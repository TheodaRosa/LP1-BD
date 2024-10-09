package org.lojanova.lojanova;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LojaNova extends Application {
    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(LojaNova.class.getResource("/org/lojanova/lojanova/loja_nova_view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 640, 480);
            stage.setTitle("Loja de Computadores!");
            stage.setScene(scene);
            stage.show();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
        System.out.println();
    }
}