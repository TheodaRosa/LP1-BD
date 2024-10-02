package org.lojanova.lojanova;

import java.awt.event.ActionEvent;
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
    void btnFinalizarCompras(ActionEvent event) {

    }

    @FXML
    void btnMonitorOpen(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(LojaNovaController.class.getResource("/org/lojanova/lojanova/hello-view.fxml"));
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
    }

    @FXML
    void btnPlacaMaeOpen(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(LojaNovaController.class.getResource("/org/lojanova/lojanova/hello-view.fxml"));
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
    }

    @FXML
    void btnGabineteOpen(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(LojaNovaController.class.getResource("/org/lojanova/lojanova/hello-view.fxml"));
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
    }

    @FXML
    void btnCoolerOpen(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(LojaNovaController.class.getResource("/org/lojanova/lojanova/hello-view.fxml"));
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
    }

    @FXML
    void btnFonteOpen(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(LojaNovaController.class.getResource("/org/lojanova/lojanova/hello-view.fxml"));
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
    }

    @FXML
    void btnRAMOpen(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(LojaNovaController.class.getResource("/org/lojanova/lojanova/hello-view.fxml"));
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
    }

    @FXML
    void btnHDOpen(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(LojaNovaController.class.getResource("/org/lojanova/lojanova/hello-view.fxml"));
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
    }

    @FXML
    void btnSSDOpen(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(LojaNovaController.class.getResource("/org/lojanova/lojanova/hello-view.fxml"));
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
    }

    @FXML
    void btnPlacaVideoOpen(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(LojaNovaController.class.getResource("/org/lojanova/lojanova/hello-view.fxml"));
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
    }

    @FXML
    void btnProcessadorOpen(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(LojaNovaController.class.getResource("/org/lojanova/lojanova/hello-view.fxml"));
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
    }

    @FXML
    void btnTecladoOpen(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(LojaNovaController.class.getResource("/org/lojanova/lojanova/hello-view.fxml"));
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
    }

    @FXML
    void btnMouseOpen(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(LojaNovaController.class.getResource("/org/lojanova/lojanova/hello-view.fxml"));
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
    }

    @FXML
    void initialize(){
    }
}
