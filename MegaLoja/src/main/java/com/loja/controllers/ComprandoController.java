package com.loja.controllers;

import com.loja.context.CarrinhoContext;
import com.loja.objects.Produto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ComprandoController {

    private Produto produto1;
    private Produto produto2;
    private Produto produto3;

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
        comprarProduto(produto1);
    }

    @FXML
    void comprarModelo2(ActionEvent event) {
        comprarProduto(produto2);
    }

    @FXML
    void comprarModelo3(ActionEvent event) {
        comprarProduto(produto3);
    }

    private void comprarProduto(Produto produto) {
        try {
            if(produto == null) {
                System.out.println("Produto inválido");
                return;
            }
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            CarrinhoContext.getInstance().adicionarProduto(produto);
            alert.setTitle("Produto Adicionado");
            alert.setHeaderText(null);
            alert.setContentText(produto.getModelo() + " foi adicionado ao carrinho.");
            alert.showAndWait();
        }catch (NumberFormatException _) {}
    }

    @FXML
    void sairJanela(ActionEvent event) {
        Stage stage = (Stage) btnSair.getScene().getWindow();
        stage.close();
    }

    public void configurarProdutos(Produto produto1, Produto produto2, Produto produto3) {
        this.produto1 = produto1;
        this.produto2 = produto2;
        this.produto3 = produto3;

        lblModelo1.setText(produto1.getModelo());
        lblModelo2.setText(produto2.getModelo());
        lblModelo3.setText(produto3.getModelo());

        lblPreco1.setText(String.format("%.2f", produto1.getValor()));
        lblPreco2.setText(String.format("%.2f", produto2.getValor()));
        lblPreco3.setText(String.format("%.2f", produto3.getValor()));

        lblMarca1.setText(produto1.getMarca());
        lblMarca2.setText(produto2.getMarca());
        lblMarca3.setText(produto3.getMarca());
    }
}
