package org.lojanova.lojanova;

import java.util.Scanner;

public class HD {
    private String modelo;
    private int GB;
    static float preco;

    public void opcoesHD(String modelo, int GB, float preco) {
        HD.preco = preco;
    }

    public static float getPreco (){
        return preco;
    }
    public String getModelo() {return modelo;}
    public int getGB() {return GB;}

    static void hdEscolhas() {
        HD hd1 = new HD();
        HD hd2 = new HD();
        HD hd3 = new HD();

                    hd1.opcoesHD("Seagate", 500, 50);

                    hd2.opcoesHD("WD", 1000, 150);

                    hd3.opcoesHD("Seagate", 4000, 350);

    }
}