package com.loja.context;

import com.loja.objects.Produto;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CarrinhoContext {
    private static CarrinhoContext instance;
    private final ObservableList<Produto> produtosCarrinho;

    private CarrinhoContext() {
        produtosCarrinho = FXCollections.observableArrayList();
    }

    public static CarrinhoContext getInstance() {
        if (instance == null) {
            instance = new CarrinhoContext();
        }
        return instance;
    }

    public ObservableList<Produto> getProdutosCarrinho() {
        return produtosCarrinho;
    }

    public void adicionarProduto(Produto produto) {
        produtosCarrinho.add(produto);
    }
}
