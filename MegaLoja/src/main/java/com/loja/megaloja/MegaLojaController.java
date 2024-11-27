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


    private void abrirJanela(String titulo, Produto produto1, Produto produto2, Produto produto3) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("compra-view.fxml"));
            Parent root = loader.load();
            ComprandoController controller = loader.getController();
            controller.configurarProdutos(produto1, produto2, produto3);

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle(titulo);
            stage.show();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static float valor;

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
        Produto produto1 = new Produto(100, "modelo", "marca", "Gabinete");
        Produto produto2 = new Produto(200, "modelo2", "marca2", "Gabinete");
        Produto produto3 = new Produto(300, "modelo3", "marca3", "Gabinete");
        abrirJanela("Gabinetes", produto1, produto2, produto3);
    }

    @FXML
    void PlacaMaeOpen(ActionEvent event) throws IOException {
        Produto produto1 = new Produto(100, "modelo", "marca", "Gabinete");
        Produto produto2 = new Produto(200, "modelo2", "marca2", "Gabinete");
        Produto produto3 = new Produto(300, "modelo3", "marca3", "Gabinete");
        abrirJanela("PlacaMae", produto1, produto2, produto3);
    }

    @FXML
    void cpuOpen(ActionEvent event) throws IOException {
        Produto produto1 = new Produto(100, "modelo", "marca", "Gabinete");
        Produto produto2 = new Produto(200, "modelo2", "marca2", "Gabinete");
        Produto produto3 = new Produto(300, "modelo3", "marca3", "Gabinete");
        abrirJanela("CPU", produto1, produto2, produto3);
    }

    @FXML
    void fonteOpen(ActionEvent event) throws IOException {
        Produto produto1 = new Produto(100, "modelo", "marca", "Gabinete");
        Produto produto2 = new Produto(200, "modelo2", "marca2", "Gabinete");
        Produto produto3 = new Produto(300, "modelo3", "marca3", "Gabinete");
        abrirJanela("Fonte", produto1, produto2, produto3);
    }

    @FXML
    void monitorOpen(ActionEvent event) throws IOException {
        Produto produto1 = new Produto(100, "modelo", "marca", "Gabinete");
        Produto produto2 = new Produto(200, "modelo2", "marca2", "Gabinete");
        Produto produto3 = new Produto(300, "modelo3", "marca3", "Gabinete");
        abrirJanela("Monitor", produto1, produto2, produto3);
    }

    @FXML
    void coolerOpen(ActionEvent event) throws IOException {
        Produto produto1 = new Produto(100, "modelo", "marca", "Gabinete");
        Produto produto2 = new Produto(200, "modelo2", "marca2", "Gabinete");
        Produto produto3 = new Produto(300, "modelo3", "marca3", "Gabinete");
        abrirJanela("Cooler", produto1, produto2, produto3);
    }

    @FXML
    void mouseOpen(ActionEvent event) throws IOException {
        Produto produto1 = new Produto(100, "modelo", "marca", "Gabinete");
        Produto produto2 = new Produto(200, "modelo2", "marca2", "Gabinete");
        Produto produto3 = new Produto(300, "modelo3", "marca3", "Gabinete");
        abrirJanela("Mouse", produto1, produto2, produto3);
    }

    @FXML
    void ramOpen(ActionEvent event) throws IOException {
        Produto produto1 = new Produto(100, "modelo", "marca", "Gabinete");
        Produto produto2 = new Produto(200, "modelo2", "marca2", "Gabinete");
        Produto produto3 = new Produto(300, "modelo3", "marca3", "Gabinete");
        abrirJanela("RAM", produto1, produto2, produto3);
    }

    @FXML
    void ssdOpen(ActionEvent event) throws IOException {
        Produto produto1 = new Produto(100, "modelo", "marca", "Gabinete");
        Produto produto2 = new Produto(200, "modelo2", "marca2", "Gabinete");
        Produto produto3 = new Produto(300, "modelo3", "marca3", "Gabinete");
        abrirJanela("SSD", produto1, produto2, produto3);
    }

    @FXML
    void tecladoOpen(ActionEvent event) throws IOException {
        Produto produto1 = new Produto(100, "modelo", "marca", "Gabinete");
        Produto produto2 = new Produto(200, "modelo2", "marca2", "Gabinete");
        Produto produto3 = new Produto(300, "modelo3", "marca3", "Gabinete");
        abrirJanela("Teclado", produto1, produto2, produto3);
    }

    @FXML
    void gpuOpen(ActionEvent event) throws IOException {
        Produto produto1 = new Produto(100, "modelo", "marca", "Gabinete");
        Produto produto2 = new Produto(200, "modelo2", "marca2", "Gabinete");
        Produto produto3 = new Produto(300, "modelo3", "marca3", "Gabinete");
        abrirJanela("Gpu", produto1, produto2, produto3);
    }

    @FXML
    void hdOpen(ActionEvent event) throws IOException {
        Produto produto1 = new Produto(100, "modelo", "marca", "Gabinete");
        Produto produto2 = new Produto(200, "modelo2", "marca2", "Gabinete");
        Produto produto3 = new Produto(300, "modelo3", "marca3", "Gabinete");
        abrirJanela("HD", produto1, produto2, produto3);
    }

    @FXML
    void carrinhoOpen(ActionEvent event) throws IOException {
    }

    @FXML
    void cancelarCompras(ActionEvent event) {

    }

}
