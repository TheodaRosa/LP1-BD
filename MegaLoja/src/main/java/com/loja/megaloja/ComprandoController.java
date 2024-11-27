package com.loja.megaloja;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

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
    private Button btnSair;

    @FXML
    private Label lblMarca2;

    @FXML
    private Label lblMarca3;

    @FXML
    private Label lblMarca1;

    @FXML
    void comprarModelo1(ActionEvent event) {
        try {
            System.out.println(lblModelo1.getText() + " foi adicionado no Carrinho");
            MegaLojaController.valor += Float.parseFloat(lblPreco1.getText());
        }catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void comprarModelo2(ActionEvent event) {
        try{
            System.out.println(lblModelo2.getText() + " foi adicionado no Carrinho");
            MegaLojaController.valor += Float.parseFloat(lblPreco2.getText());
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void comprarModelo3(ActionEvent event) {
        try {
            System.out.println(lblModelo3.getText() + " foi adicionado no Carrinho");
            MegaLojaController.valor += Float.parseFloat(lblPreco3.getText());
        }catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void sairJanela(ActionEvent event) {
        Stage stage = (Stage) btnSair.getScene().getWindow();
        stage.close();
    }

    public void configurarProdutos(Produto produto1, Produto produto2, Produto produto3) {
        lblModelo1.setText(produto1.getModelo());
        lblModelo2.setText(produto2.getModelo());
        lblModelo3.setText(produto3.getModelo());

        lblPreco1.setText(String.format("%.2f", produto1.getPreco()));
        lblPreco2.setText(String.format("%.2f", produto2.getPreco()));
        lblPreco3.setText(String.format("%.2f", produto3.getPreco()));

        lblMarca1.setText(produto1.getMarca());
        lblMarca2.setText(produto2.getMarca());
        lblMarca3.setText(produto3.getMarca());
    }
}
