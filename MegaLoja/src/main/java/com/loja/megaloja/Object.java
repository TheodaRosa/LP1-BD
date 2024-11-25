package com.loja.megaloja;

public class Object {
    String tipo;
    String marca;
    String modelo;
    boolean preco;

    public Object( boolean preco, String modelo, String marca, String tipo) {
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

    public boolean isPreco() {
        return preco;
    }

    public void setPreco(boolean preco) {
        this.preco = preco;
    }

}
