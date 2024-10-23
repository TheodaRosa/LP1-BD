package org.lojanova.lojanova;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class GabineteController {

    @FXML
    private Button btnComprar1;

    @FXML
    private Button btnComprar3;

    @FXML
    private Button btnComprar2;

    @FXML
    private Label lblMarca2;

    @FXML
    private Button btnFechar;

    @FXML
    private Label lblMarca3;

    @FXML
    private Label lblMarca1;

    @FXML
    private Label lblModelo3;

    @FXML
    private Label lblModelo2;

    @FXML
    private Label lblModelo1;

    @FXML
    private Label lblPreco1;

    @FXML
    private Label lblPreco2;

    @FXML
    private Label lblPreco3;

    static int compra;
    public static int valor(){return compra;};

    @FXML
    void btnComprarGabinete2(ActionEvent event) {
        LojaNovaController.valor += Integer.parseInt(lblPreco2.getText());
        System.out.println("Compra feita com Sucesso! "+lblModelo2.getText());
    }

    @FXML
    void btnComprarGabinete3(ActionEvent event) {
        LojaNovaController.valor += Integer.parseInt(lblPreco3.getText());
        System.out.println("Compra feita com Sucesso! "+lblModelo3.getText());
    }

    @FXML
    void btnComprarGabinete1(ActionEvent event) {
        LojaNovaController.valor += Integer.parseInt(lblPreco1.getText());
        System.out.println("Compra feita com Sucesso! "+lblModelo1.getText());
    }

    @FXML
    void btnGabineteClose(ActionEvent event) {
        Stage stage = (Stage) btnFechar.getScene().getWindow();
        stage.close();
    }

}
