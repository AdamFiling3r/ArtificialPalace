package com.example.artificialpalace;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import com.dansoftware.pdfdisplayer.PDFDisplayer;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        PDFDisplayer displayer = new PDFDisplayer();
        stage.setScene(new Scene(displayer.toNode()));
        displayer.loadPDF(new File("wsu-css-cheat-sheet-gdocs.pdf"));
        stage.setTitle("Hello!");
        stage.show();
    }

    public static void main(String[] args) throws IOException {
        launch();

    }

    public static void pdf_view(Stage stage) throws IOException {


        stage.show();







    }
}