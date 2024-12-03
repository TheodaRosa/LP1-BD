package com.loja.controllers;

import com.loja.objects.Produto;
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
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/loja/megaloja/compra-view.fxml"));
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
        Produto produto1 = new Produto(159, "Gamer", "Preto", "Gabinete");
        Produto produto2 = new Produto(199, "Trabalho", "Branco", "Gabinete");
        Produto produto3 = new Produto(259, "Vidro", "Colorido", "Gabinete");
        abrirJanela("Gabinetes", produto1, produto2, produto3);
    }

    @FXML
    void PlacaMaeOpen(ActionEvent event) throws IOException {
        Produto produto1 = new Produto(1000, "B550M", "Aorus", "Placa Mãe");
        Produto produto2 = new Produto(1500, "B460M", "Asus", "Placa Mãe");
        Produto produto3 = new Produto(2000, "B760-A", "ROG", "Placa Mãe");
        abrirJanela("PlacaMae", produto1, produto2, produto3);
    }

    @FXML
    void cpuOpen(ActionEvent event) throws IOException {
        Produto produto1 = new Produto(1000, "Ryzen 7 5700g", "AMD", "CPU");
        Produto produto2 = new Produto(1300, "Core I5", "Intel", "CPU");
        Produto produto3 = new Produto(1500, "Ryzen 5 5500", "AMD", "CPU");
        abrirJanela("CPU", produto1, produto2, produto3);
    }

    @FXML
    void fonteOpen(ActionEvent event) throws IOException {
        Produto produto1 = new Produto(200, "TMWK500", "Tomahawk", "Fonte");
        Produto produto2 = new Produto(300, "P550B 500W", "Gigabyte", "Fonte");
        Produto produto3 = new Produto(400, "Kyber 850W", "XPG", "Fonte");
        abrirJanela("Fonte", produto1, produto2, produto3);
    }

    @FXML
    void monitorOpen(ActionEvent event) throws IOException {
        Produto produto1 = new Produto(500, "T350", "Samsung", "Monitor");
        Produto produto2 = new Produto(1000, "DX240G", "Freesync", "Monitor");
        Produto produto3 = new Produto(1500, "Ultragear 27", "LG", "Monitor");
        abrirJanela("Monitor", produto1, produto2, produto3);
    }

    @FXML
    void coolerOpen(ActionEvent event) throws IOException {
        Produto produto1 = new Produto(100, "Air Cooler 120mm", "Revenger", "Cooler");
        Produto produto2 = new Produto(200, "Air Cooler 240mm", "Corsair", "Cooler");
        Produto produto3 = new Produto(300, "Water Cooler 360mm", "Rise Mode", "Cooler");
        abrirJanela("Cooler", produto1, produto2, produto3);
    }

    @FXML
    void mouseOpen(ActionEvent event) throws IOException {
        Produto produto1 = new Produto(50, "Cobra", "Redragon", "Mouse");
        Produto produto2 = new Produto(100, "Lightsync", "Logitech", "Mouse");
        Produto produto3 = new Produto(200, "Deathadder", "Razer", "Mouse");
        abrirJanela("Mouse", produto1, produto2, produto3);
    }

    @FXML
    void ramOpen(ActionEvent event) throws IOException {
        Produto produto1 = new Produto(80, "4GB", "HyperX", "RAM");
        Produto produto2 = new Produto(100, "8GB", "XPG", "RAM");
        Produto produto3 = new Produto(120, "8GB", "Kingston", "RAM");
        abrirJanela("RAM", produto1, produto2, produto3);
    }

    @FXML
    void ssdOpen(ActionEvent event) throws IOException {
        Produto produto1 = new Produto(100, "240gb", "Rise Mode", "SSD");
        Produto produto2 = new Produto(200, "960gb", "Kingston", "SSD");
        Produto produto3 = new Produto(300, "1tb", "SanDisk", "SSD");
        abrirJanela("SSD", produto1, produto2, produto3);
    }

    @FXML
    void tecladoOpen(ActionEvent event) throws IOException {
        Produto produto1 = new Produto(100, "Lakshmi M", "Redragon", "Teclado");
        Produto produto2 = new Produto(200, "G213 R", "Logitech", "Teclado");
        Produto produto3 = new Produto(300, "Apex 3 B", "SteelSeries", "Teclado");
        abrirJanela("Teclado", produto1, produto2, produto3);
    }

    @FXML
    void gpuOpen(ActionEvent event) throws IOException {
        Produto produto1 = new Produto(1000, "Radeon RX5700", "AMD", "GPU");
        Produto produto2 = new Produto(2000, "RTX 4060", "NVidia", "GPU");
        Produto produto3 = new Produto(3000, "RTX 4090", "NVidia", "GPU");
        abrirJanela("Gpu", produto1, produto2, produto3);
    }

    @FXML
    void hdOpen(ActionEvent event) throws IOException {
        Produto produto1 = new Produto(100, "1tb", "Seagate", "HD");
        Produto produto2 = new Produto(200, "2tb", "WD", "HD");
        Produto produto3 = new Produto(300, "4tb", "WD", "HD");
        abrirJanela("HD", produto1, produto2, produto3);
    }

    @FXML
    void carrinhoOpen(ActionEvent event) throws IOException {
    }

    @FXML
    void cancelarCompras(ActionEvent event) {
        Stage stage = (Stage) btnCancelar.getScene().getWindow();
        stage.close();
    }

}
