package org.lojanova.lojanova;


public class Teclado {
    private String modelo;
    private String switches;
    static float preco;

    public void opcoesTeclado(String modelo, String switches, float preco) {
        Teclado.preco = preco;
        this.modelo = modelo;
        this.switches = switches;
    }
    public String getModelo(){ return modelo;}
    public String getSwitches(){ return switches;}
    public float getPreco (){
        return preco;
    }

    static void tecladoEscolhas() {
        Teclado teclado1 = new Teclado();
        Teclado teclado2 = new Teclado();
        Teclado teclado3 = new Teclado();

        teclado1.opcoesTeclado("Redragon", "Marrom", 125);
        teclado2.opcoesTeclado("Logitech", "Azul", 350);
        teclado3.opcoesTeclado("Razer", "Vermelho", 700);

    }
}