package org.lojanova.lojanova;

import java.util.Scanner;

public class Cooler {
    private String modelo;
    private String waterAir;
    static float preco;

    public void opcoesCooler(String modelo, String waterAir, float preco) {
        Cooler.preco = preco;
        this.modelo = "Modelo: " + modelo;
        this.waterAir = "Water Air: " + waterAir;
        System.out.printf("Modelo: %s \nAir/Water: %s \nPreço: %.2f \n \n ", modelo, waterAir, preco);
    }

    public static float getPreco (){
        return preco;
    }

    static void CoolerEscolhas() {
        Cooler cooler = new Cooler();
        Scanner entrada = new Scanner(System.in);
        int escolha;

        int i = 1;
        do {
            switch (i) {
                case 1:
                    System.out.println("1. ");
                    cooler.opcoesCooler("Rise", "Air 120mm", 50);
                    break;
                case 2:
                    System.out.println("2. ");
                    cooler.opcoesCooler("Rise", "Air 240mm", 100);
                    break;
                case 3:
                    System.out.println("3. ");
                    cooler.opcoesCooler("Corsair", "Water", 400);
                    break;
                case 4:
                    System.out.println("0. Sair");
                    break;
                default:
                    System.out.println("Opção invalida");

            }
            i++;
        } while (i != 5);

        do {
            escolha = entrada.nextInt();
            switch (escolha) {
                case 1:
                    cooler.opcoesCooler("Rise", "Air 120mm", 50);
                    break;
                case 2:
                    cooler.opcoesCooler("Rise", "Air 240mm", 100);
                    break;
                case 3:
                    cooler.opcoesCooler("Corsair", "Water", 400);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção invalida");
            }
            System.out.println("Digite 1-3 para continuar sua compra, ou 0 para sair.");
        } while (escolha != 0);
    }
}