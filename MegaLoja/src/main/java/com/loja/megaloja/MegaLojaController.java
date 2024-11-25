package com.loja.megaloja;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class MegaLojaController {


    private void start() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(MegaLoja.class.getResource("compra-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static int valor;

    @FXML
    private Button btnGPU;

    @FXML
    private Button btnCarrinho;

    @FXML
    private Button btnHD;

    @FXML
    private Button btnGabinetes;

    @FXML
    private Button btnMouse;

    @FXML
    private Button btnPlacaMae;

    @FXML
    private Button btnRAM;

    @FXML
    private Button btnFonte;

    @FXML
    private Button btnMonitor;

    @FXML
    private Button btnSSD;

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnCPU;

    @FXML
    private Button btnTeclado;

    @FXML
    private Button btnCooler;

    @FXML
    void gabinetesOpen(ActionEvent event) throws IOException {
        start();
        Object object1 = new Object(100,"um", "AOC", "top");
        Object object2 = new Object(100,"um", "AOC", "top");
        Object object3 = new Object(100,"um", "AOC", "top");
    }

    @FXML
    void PlacaMaeOpen(ActionEvent event) throws IOException {

    }

    @FXML
    void cpuOpen(ActionEvent event) throws IOException {
        start();
    }

    @FXML
    void fonteOpen(ActionEvent event) throws IOException {
        start();
    }

    @FXML
    void monitorOpen(ActionEvent event) throws IOException {
        start();
    }

    @FXML
    void coolerOpen(ActionEvent event) throws IOException {
        start();
    }

    @FXML
    void mouseOpen(ActionEvent event) throws IOException {
        start();
    }

    @FXML
    void ramOpen(ActionEvent event) throws IOException {
        start();
    }

    @FXML
    void ssdOpen(ActionEvent event) throws IOException {
        start();
    }

    @FXML
    void tecladoOpen(ActionEvent event) throws IOException {
        start();
    }

    @FXML
    void gpuOpen(ActionEvent event) throws IOException {
        start();
    }

    @FXML
    void hdOpen(ActionEvent event) throws IOException {
        start();
    }

    @FXML
    void carrinhoOpen(ActionEvent event) throws IOException {
        start();
    }

    @FXML
    void cancelarCompras(ActionEvent event) {

    }

}
