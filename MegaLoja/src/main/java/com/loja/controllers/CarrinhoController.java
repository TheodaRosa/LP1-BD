package com.loja.controllers;

import com.loja.context.CarrinhoContext;
import com.loja.dao.ProdutoDAO;
import com.loja.objects.Produto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.List;

public class CarrinhoController {

    @FXML
    private TableView<Produto> tbProdutos = new TableView<Produto>();

    TableColumn<Produto, String> clMarca = new TableColumn<>("Marca");
    TableColumn<Produto, String> clModelo = new TableColumn<>("Modelo");
    TableColumn<Produto, String> clTipo = new TableColumn<>("Tipo");
    TableColumn<Produto, Double> clValor = new TableColumn<>("Valor");

    @FXML
    private Button btnComprar;


    List<Produto> produtos = CarrinhoContext.getInstance().getProdutosCarrinho();

    @FXML
    void comprarProdutos(ActionEvent event) {

        if (produtos.isEmpty()) {
            System.out.println("Carrinho vazio. Nenhuma compra realizada.");
            return;
        }

        ProdutoDAO compraDAO = new ProdutoDAO();
        compraDAO.salvarCompra(produtos);

        System.out.println("Produtos comprados com sucesso!");

        CarrinhoContext.getInstance().getProdutosCarrinho().clear();
    }

    public void configurarTabelas() {
        try {
            ObservableList<Produto> produtosObservable = FXCollections.observableArrayList(
                    CarrinhoContext.getInstance().getProdutosCarrinho()
            );
            tbProdutos.setItems(produtosObservable);

            clMarca.setCellValueFactory(new PropertyValueFactory<>("marca"));
            clModelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));
            clTipo.setCellValueFactory(new PropertyValueFactory<>("tipo"));
            clValor.setCellValueFactory(new PropertyValueFactory<>("valor"));


            if (!tbProdutos.getColumns().contains(clMarca)) {
                tbProdutos.getColumns().addAll(clMarca, clModelo, clTipo, clValor);
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
