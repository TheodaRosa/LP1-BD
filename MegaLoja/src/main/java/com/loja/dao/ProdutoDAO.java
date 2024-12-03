package com.loja.dao;

import com.loja.objects.Produto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    private Connection connection;

    // Construtor que recebe a conexão
    public ProdutoDAO(Connection connection) {
        this.connection = connection;
    }

    public void inserir(Produto produto) throws SQLException {
        String sql = "INSERT INTO produtos (marca, modelo, tipo, preco) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, produto.getMarca());
            stmt.setString(2, produto.getModelo());
            stmt.setString(3, produto.getTipo());
            stmt.setDouble(4, produto.getPreco());
            stmt.executeUpdate();
        }
    }

    public List<Produto> listar() throws SQLException {
        String sql = "SELECT * FROM produtos";
        List<Produto> produtos = new ArrayList<>();
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                String tipo = rs.getString("tipo");
                double preco = rs.getDouble("preco");
                produtos.add(new Produto(preco, modelo, marca, tipo));
            }
        }
        return produtos;
    }

    public void atualizar(Produto produto) throws SQLException {
        String sql = "UPDATE produtos SET modelo = ?, tipo = ?, preco = ? WHERE marca = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, produto.getModelo());
            stmt.setString(2, produto.getTipo());
            stmt.setDouble(3, produto.getPreco());
            stmt.setString(4, produto.getMarca());
            stmt.executeUpdate();
        }
    }

    public void excluir(String marca) throws SQLException {
        String sql = "DELETE FROM produtos WHERE marca = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, marca);
            stmt.executeUpdate();
        }
    }
}
