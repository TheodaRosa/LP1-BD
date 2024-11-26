package com.loja.megaloja;

public class Produto {
    String tipo;
    String marca;
    String modelo;
    float preco;

    public Produto( float preco, String modelo, String marca, String tipo) {
        this.preco = preco;
        this.modelo = modelo;
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float isPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

}
