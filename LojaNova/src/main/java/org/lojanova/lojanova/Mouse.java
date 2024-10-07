package org.lojanova.lojanova;

import java.util.Scanner;

public class Mouse {
    private String modelo;
    private int dpi;
    private static float preco;

    public void opcoesMouse(String modelo, int dpi, float preco) {
        Mouse.preco = preco;
        System.out.printf("Modelo: %s \nDPI: %d \nPreço: %.2f \n \n ", modelo, dpi, preco);
    }

    public static float getPreco (){
        return preco;
    }

    static void mousesEscolhas() {
        Mouse mouse = new Mouse();
        Scanner entrada = new Scanner(System.in);
        int escolha;
        int i = 1;

        do {
            switch (i) {
                case 1:
                    System.out.println("1. ");
                    mouse.opcoesMouse("Redragon", 800, 200);
                    break;
                case 2:
                    System.out.println("2. ");
                    mouse.opcoesMouse("Logitech", 1600, 400);
                    break;
                case 3:
                    System.out.println("3. ");
                    mouse.opcoesMouse("Razer", 2400, 600);
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
                    mouse.opcoesMouse("Redragon", 800, 200);
                    break;
                case 2:
                    mouse.opcoesMouse("Logitech", 1600, 400);
                    break;
                case 3:
                    mouse.opcoesMouse("Razer", 2400, 600);
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
