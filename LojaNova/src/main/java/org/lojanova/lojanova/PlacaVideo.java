package org.lojanova.lojanova;

import java.util.Scanner;

public class PlacaVideo {
    private String modelo;
    private String geracao;
    static float preco;

    public void opcoesPlacaVideo(String modelo, String geracao, float preco) {
        PlacaVideo.preco = preco;
        System.out.printf("Modelo: %s \nGeracao: %s \nPreço: %.2f \n \n ", modelo, geracao, preco);
    }

    public static float getPreco (){
        return preco;
    }

    static void PlacaVideoEscolhas() {
        PlacaVideo placaVideo = new PlacaVideo();
        Scanner entrada = new Scanner(System.in);
        int escolha;

        int i = 1;
        do {
            switch (i) {
                case 1:
                    System.out.println("1. ");
                    placaVideo.opcoesPlacaVideo("NVidia", "3060", 1400);
                    break;
                case 2:
                    System.out.println("2. ");
                    placaVideo.opcoesPlacaVideo("AMD", "RX 6600", 1500);
                    break;
                case 3:
                    System.out.println("3. ");
                    placaVideo.opcoesPlacaVideo("NVidia", "GeForce 4060", 2600);
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
                    placaVideo.opcoesPlacaVideo("NVidia", "3060", 1400);
                    break;
                case 2:
                    placaVideo.opcoesPlacaVideo("AMD", "RX 6600", 1500);
                    break;
                case 3:
                    placaVideo.opcoesPlacaVideo("NVidia", "GeForce 4060", 2600);
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