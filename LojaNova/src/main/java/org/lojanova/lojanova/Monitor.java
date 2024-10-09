package org.lojanova.lojanova;

import java.util.Scanner;

public class Monitor {
    private String modelo;
    private String hertz;
    private static float preco;

    public void comprarMonitor(String modelo, String hertz, float preco) {
        Monitor.preco = preco;
        System.out.printf("Modelo: %s \nCor: %s \nPreço: %.2f \n \n ", modelo, hertz, preco);
    }

    public static float getPreco (){
        return preco;
    }

    static void monitorEscolhas() {
        Monitor monitor = new Monitor();
        Scanner entrada = new Scanner(System.in);
        int escolha;
        int i = 1;

        do {
            switch (i) {
                case 1:
                    System.out.println("1. ");
                    monitor.comprarMonitor("Acer", "60HZ", 400);
                    break;
                case 2:
                    System.out.println("2. ");
                    monitor.comprarMonitor("AOC", "144HZ", 800);
                    break;
                case 3:
                    System.out.println("3. ");
                    monitor.comprarMonitor("LG", "240HZ", 1600);
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
                    monitor.comprarMonitor("Acer", "60HZ", 400);
                    break;
                case 2:
                    monitor.comprarMonitor("AOC", "144HZ", 800);
                    break;
                case 3:
                    monitor.comprarMonitor("LG", "240HZ", 1600);
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