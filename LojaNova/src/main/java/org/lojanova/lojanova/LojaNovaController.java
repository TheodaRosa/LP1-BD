package org.lojanova.lojanova;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class LojaNovaController {
    int valor;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnHD;

    @FXML
    private Button btnGabinete;

    @FXML
    private Button btnFinalizar;

    @FXML
    private Button btnProcessador;

    @FXML
    private Button btnMouse;

    @FXML
    private Button btnPlacaMae;

    @FXML
    private Label lblTotal;

    @FXML
    private Button btnRAM;

    @FXML
    private Button btnFonte;

    @FXML
    private Button btnMonitor;

    @FXML
    private Button btnSSD;

    @FXML
    private Button btnPlacaVideo;

    @FXML
    private Button btnTeclado;

    @FXML
    private Button btnCooler;

    @FXML
    public void btnFinalizarCompras(javafx.event.ActionEvent event) {
        System.out.println("Obrigado por comprar na minha loja! O total foi de R$"+valor);
        Stage stage = (Stage) btnFinalizar.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void btnMonitorOpen(javafx.event.ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(LojaNovaController.class.getResource("/org/lojanova/lojanova/monitor_view.fxml"));
            Parent root = fxmlLoader.load();

            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setTitle("Monitores");

            stage.setScene(scene);
            stage.show();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        Monitor monitor = new Monitor();
        valor += monitor.getCompra();
        lblTotal.setText(Integer.toString(valor));
    }

    @FXML
    public void btnPlacaMaeOpen(javafx.event.ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(LojaNovaController.class.getResource("/org/lojanova/lojanova/placa_mae_view.fxml"));
            Parent root = fxmlLoader.load();

            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setTitle("Placas Mãe");

            stage.setScene(scene);
            stage.show();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        PlacaMae placaMae = new PlacaMae();
        valor += placaMae.getCompra();
        lblTotal.setText(Integer.toString(valor));
    }

    @FXML
    public void btnGabineteOpen(javafx.event.ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(LojaNovaController.class.getResource("/org/lojanova/lojanova/gabinete_view.fxml"));
            Parent root = fxmlLoader.load();

            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setTitle("Gabinetes");

            stage.setScene(scene);
            stage.show();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        Gabinete gabinete = new Gabinete();
        valor += gabinete.getCompra();
        lblTotal.setText(Integer.toString(valor));
    }

    @FXML
    public void btnCoolerOpen(javafx.event.ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(LojaNovaController.class.getResource("/org/lojanova/lojanova/cooler_view.fxml"));
            Parent root = fxmlLoader.load();

            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setTitle("Coolers");

            stage.setScene(scene);
            stage.show();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        Cooler cooler = new Cooler();
        valor += cooler.getCompra();
        lblTotal.setText(Integer.toString(valor));    }

    @FXML
    public void btnFonteOpen(javafx.event.ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(LojaNovaController.class.getResource("/org/lojanova/lojanova/fonte_view.fxml"));
            Parent root = fxmlLoader.load();

            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setTitle("Fontes");

            stage.setScene(scene);
            stage.show();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        Fonte fonte = new Fonte();
        valor += fonte.getCompra();
        lblTotal.setText(Integer.toString(valor));    }

    @FXML
    public void btnRAMOpen(javafx.event.ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(LojaNovaController.class.getResource("/org/lojanova/lojanova/ram_view.fxml"));
            Parent root = fxmlLoader.load();

            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setTitle("RAMs");

            stage.setScene(scene);
            stage.show();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        RAM ram = new RAM();
        valor += ram.getCompra();
        lblTotal.setText(Integer.toString(valor));    }

    @FXML
    public void btnHDOpen(javafx.event.ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(LojaNovaController.class.getResource("/org/lojanova/lojanova/hd_view.fxml"));
            Parent root = fxmlLoader.load();

            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setTitle("HDs");

            stage.setScene(scene);
            stage.show();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        HD hd = new HD();
        valor += hd.getCompra();
        lblTotal.setText(Integer.toString(valor));    }

    @FXML
    public void btnSSDOpen(javafx.event.ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(LojaNovaController.class.getResource("/org/lojanova/lojanova/ssd_view.fxml"));
            Parent root = fxmlLoader.load();

            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setTitle("SSDs");

            stage.setScene(scene);
            stage.show();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        SSD ssd = new SSD();
        valor += ssd.getCompra();
        lblTotal.setText(Integer.toString(valor));
    }

    @FXML
    public void btnPlacaVideoOpen(javafx.event.ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(LojaNovaController.class.getResource("/org/lojanova/lojanova/placa_video_view.fxml"));
            Parent root = fxmlLoader.load();

            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setTitle("Placas de Vídeo");

            stage.setScene(scene);
            stage.show();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        PlacaVideo placa = new PlacaVideo();
        valor += placa.getCompra();
        lblTotal.setText(Integer.toString(valor));    }

    @FXML
    public void btnProcessadorOpen(javafx.event.ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(LojaNovaController.class.getResource("/org/lojanova/lojanova/processador_view.fxml"));
            Parent root = fxmlLoader.load();

            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setTitle("Processadores");

            stage.setScene(scene);
            stage.show();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        Processador processador = new Processador();
        valor += processador.getCompra();
        lblTotal.setText(Integer.toString(valor));
    }

    @FXML
    public void btnTecladoOpen(javafx.event.ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(LojaNovaController.class.getResource("/org/lojanova/lojanova/teclado_view.fxml"));
            Parent root = fxmlLoader.load();

            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setTitle("Teclados");

            stage.setScene(scene);
            stage.show();

        }
        catch(IOException e){
            e.printStackTrace();
        }
        Teclado teclado = new Teclado();
        valor += teclado.getCompra();
        lblTotal.setText(Integer.toString(valor));    }

    @FXML
    public void btnMouseOpen(javafx.event.ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(LojaNovaController.class.getResource("/org/lojanova/lojanova/mouse_view.fxml"));
            Parent root = fxmlLoader.load();

            Stage stage = new Stage();
            Scene scene = new Scene(root);
            stage.setTitle("Mouses");

            stage.setScene(scene);
            stage.show();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        Mouse mouse = new Mouse();
        valor += mouse.getCompra();
        lblTotal.setText(Integer.toString(valor));    }

    @FXML
    void initialize(){
    }


}
