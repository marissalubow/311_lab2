package com.example.csc311_gui_basics;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.MouseEvent;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label welcomeText2;

    @FXML
    private ImageView image;

    @FXML
    void showImage(MouseEvent event)
    {
        image.setVisible(true);
    }



    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onHelloButtonClick2() {
        welcomeText2.setText("Marissa Lubow");
    }
}