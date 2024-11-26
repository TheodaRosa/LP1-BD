package com.loja.megaloja;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MegaLoja extends Application {
    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MegaLoja.class.getResource("janela-loja-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 810, 646);
            stage.setTitle("MegaLoja");
            stage.setScene(scene);
            stage.show();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}