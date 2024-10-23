package org.lojanova.lojanova;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class CoolerController {


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



    @FXML
    void btnComprarCooler2(ActionEvent event) {
        LojaNovaController.valor += Integer.parseInt(lblPreco2.getText());
        System.out.println("Compra feita com Sucesso! "+lblMarca2.getText());
    }

    @FXML
    void btnComprarCooler3(ActionEvent event) {
        LojaNovaController.valor += Integer.parseInt(lblPreco3.getText());
        System.out.println("Compra feita com Sucesso! "+lblMarca3.getText());
    }

    @FXML
    void btnComprarCooler1(ActionEvent event) {
        LojaNovaController.valor += Integer.parseInt(lblPreco1.getText());
        System.out.println("Compra feita com Sucesso! "+lblMarca1.getText());
    }

    @FXML
    void btnCoolerClose(ActionEvent event) {
        Stage stage = (Stage) btnFechar.getScene().getWindow();
        stage.close();
    }

}
