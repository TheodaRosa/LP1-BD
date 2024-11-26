package com.loja.megaloja;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class MegaLojaController {


    private void abrirJanela(String titulo) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("compra-view.fxml"));
            Parent root = loader.load();
            ComprandoController controller = loader.getController();

            Produto produto = new Produto(100, "Oi", "AOC", "Gabinete");
            controller.configurarProduto(produto);

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle(titulo);
            stage.show();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    int preco;
    int preco2;
    int preco3;
    String modelo;
    String marca;
    String tipo;
    String modelo2;
    String marca2;
    String tipo2;
    String modelo3;
    String marca3;
    String tipo3;

    Produto produto1 = new Produto(preco, modelo, marca, tipo);
    Produto produto2 = new Produto(preco2, modelo2, marca2, tipo2);
    Produto produto3 = new Produto(preco3, modelo3, marca3, tipo3);

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
        abrirJanela("Gabinetes");
        preco = 100; marca = "AOC"; modelo = "Oi"; tipo = "gabinete";
    }

    @FXML
    void PlacaMaeOpen(ActionEvent event) throws IOException {
        abrirJanela("PlacaMae");
    }

    @FXML
    void cpuOpen(ActionEvent event) throws IOException {
        abrirJanela("CPU");
    }

    @FXML
    void fonteOpen(ActionEvent event) throws IOException {
        abrirJanela("Fonte");
    }

    @FXML
    void monitorOpen(ActionEvent event) throws IOException {
        abrirJanela("Monitor");
    }

    @FXML
    void coolerOpen(ActionEvent event) throws IOException {
        abrirJanela("Cooler");
    }

    @FXML
    void mouseOpen(ActionEvent event) throws IOException {
        abrirJanela("Mouse");
    }

    @FXML
    void ramOpen(ActionEvent event) throws IOException {
        abrirJanela("RAM");
    }

    @FXML
    void ssdOpen(ActionEvent event) throws IOException {
        abrirJanela("SSD");
    }

    @FXML
    void tecladoOpen(ActionEvent event) throws IOException {
        abrirJanela("Teclado");
    }

    @FXML
    void gpuOpen(ActionEvent event) throws IOException {
        abrirJanela("Gpu");
    }

    @FXML
    void hdOpen(ActionEvent event) throws IOException {
        abrirJanela("HD");
    }

    @FXML
    void carrinhoOpen(ActionEvent event) throws IOException {
        abrirJanela("Carrinho");
    }

    @FXML
    void cancelarCompras(ActionEvent event) {

    }

}
