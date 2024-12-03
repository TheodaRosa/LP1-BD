package com.loja.controllers;

import com.loja.context.CarrinhoContext;
import com.loja.dao.ProdutoDAO;
import com.loja.objects.Produto;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

import java.util.List;

public class CarrinhoController {

    @FXML
    private TableView<Produto> tbProdutos = new TableView<Produto>();

    @FXML
    private Button btnComprar;

    @FXML
    void comprarProdutos(ActionEvent event) {
        List<Produto> produtos = CarrinhoContext.getInstance().getProdutosCarrinho();

        if (produtos.isEmpty()) {
            System.out.println("Carrinho vazio. Nenhuma compra realizada.");
            return;
        }

        ProdutoDAO compraDAO = new ProdutoDAO();
        compraDAO.salvarCompra(produtos);

        System.out.println("Produtos comprados com sucesso!");

        CarrinhoContext.getInstance().getProdutosCarrinho().clear();
    }

    public void configurarTabelas(){
        tbProdutos.setItems(CarrinhoContext.getInstance().getProdutosCarrinho());
    }

}
