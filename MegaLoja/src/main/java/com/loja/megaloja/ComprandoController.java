package com.loja.megaloja;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ComprandoController {

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
    private Button btnComprar3;

    @FXML
    private Button btnCompra1;

    @FXML
    private Button btnComprar2;

    @FXML
    private Label lblMarca2;

    @FXML
    private Label lblMarca3;

    @FXML
    private Label lblMarca1;

    public void initialize() {
        lblMarca1.setText("Marca");
        lblMarca2.setText("Marca");
        lblMarca3.setText("Marca");

        lblPreco1.setText("Preco");
        lblPreco2.setText("Preco");
        lblPreco3.setText("Preco");

        lblModelo1.setText("Modelo");
        lblModelo2.setText("Modelo");
        lblModelo3.setText("Modelo");
    }

    @FXML
    void comprarModelo1(ActionEvent event) {
        MegaLojaController.valor = Integer.parseInt(lblPreco1.getText());
    }

    @FXML
    void comprarModelo2(ActionEvent event) {

    }

    @FXML
    void comprarModelo3(ActionEvent event) {

    }

    @FXML
    void sairJanela(ActionEvent event) {

    }

}
