package com.example.artificialpalace;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.xml.sax.XMLReader;

public class HelloController {
    @FXML
    private Label welcomeText = new Label();


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}