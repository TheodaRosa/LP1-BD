package com.loja.dao;

import com.loja.connection.ConexaoFactory;
import com.loja.objects.Produto;

import java.sql.*;
import java.util.List;

public class ProdutoDAO {

    public void salvarCompra(List<Produto> produtos) {
        String sql = "INSERT INTO compras (modelo, marca, preco, tipo) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConexaoFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            for (Produto produto : produtos) {
                stmt.setString(1, produto.getModelo());
                stmt.setString(2, produto.getMarca());
                stmt.setDouble(3, produto.getValor());
                stmt.setString(4, produto.getTipo());
                stmt.addBatch(); // Adiciona ao lote
            }

            stmt.executeBatch(); // Executa o lote de inserções
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}