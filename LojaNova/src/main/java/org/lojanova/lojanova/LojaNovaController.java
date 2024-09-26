package org.lojanova.lojanova;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class LojaNovaController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}