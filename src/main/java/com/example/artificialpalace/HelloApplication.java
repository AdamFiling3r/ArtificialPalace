package com.example.artificialpalace;



import java.awt.*;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


import java.io.File;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource("hello-view.fxml"));


        Scene scene = new Scene(loader);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        stage.setMaximized(true);
        stage.setTitle("ArtificialPalace");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        Toolkit.getDefaultToolkit();
        launch();

    }

}