package org.lojanova.lojanova;

import java.util.Scanner;

public class SSD {
    private String modelo;
    private int GB;
    static float preco;

    public void opcoesSSD(String modelo, int GB, float preco) {
        SSD.preco = preco;
        System.out.printf("Modelo: %s \nMemória: %d \nPreço: %.2f \n \n ", modelo, GB, preco);
    }

    public static float getPreco (){
        return preco;
    }

    static void ssdEscolhas() {
        SSD ssd = new SSD();
        Scanner entrada = new Scanner(System.in);
        int escolha;
        int i = 1;

        do {
            switch (i) {
                case 1:
                    System.out.println("1. ");
                    ssd.opcoesSSD("SanDisk", 250, 100);
                    break;
                case 2:
                    System.out.println("2. ");
                    ssd.opcoesSSD("SanDisk", 500, 200);
                    break;
                case 3:
                    System.out.println("3. ");
                    ssd.opcoesSSD("Kingston", 960, 350);
                    break;
                case 4:
                    System.out.println("0. Sair");
                    break;
                default:
                    System.out.println("Opção invalida");
            }
            i++;
        }while (i != 5);

        do {
            escolha = entrada.nextInt();
            switch (escolha) {
                case 1:
                    ssd.opcoesSSD("SanDisk", 250, 100);
                    break;
                case 2:
                    ssd.opcoesSSD("SanDisk", 500, 200);
                    break;
                case 3:
                    ssd.opcoesSSD("Kingston", 960, 350);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção invalida");
            }
            System.out.println("Digite 1-3 para continuar sua compra, ou 0 para sair.");
        }while (escolha != 0);
    }
}