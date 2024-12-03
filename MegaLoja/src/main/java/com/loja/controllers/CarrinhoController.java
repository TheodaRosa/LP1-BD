package com.loja.controllers;

import com.loja.objects.Produto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

public class CarrinhoController {

    @FXML
    private TableView<Produto> tbProdutos = new TableView<Produto>();



    @FXML
    private Button btnComprar;

    @FXML
    void comprarProdutos(ActionEvent event) {

    }

    public void configurarTabelas(){
        //tbProdutos.setItems();
    }

}
