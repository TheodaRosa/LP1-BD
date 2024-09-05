import java.util.Scanner;

public class Processador {
    private String modelo;
    private String GHz;
    static float preco;

    public void opcoesProcessador(String modelo, String Geracao, float preco) {
        Processador.preco = preco;
        System.out.printf("Modelo: %s \nGeração: %s \nPreço: %.2f \n \n ", modelo, GHz, preco);
    }

    public static float getPreco (){
        return preco;
    }

    static void processadorEscolhas() {
        Processador processador = new Processador();
        Scanner entrada = new Scanner(System.in);
        int escolha;
        int i = 1;

        do {
            switch (i) {
                case 1:
                    System.out.println("1. ");
                    processador.opcoesProcessador("Philco", "Ph900 Turbo", 200);
                    break;
                case 2:
                    System.out.println("2. ");
                    processador.opcoesProcessador("AMD", "Ryzen 7 5700", 1000);
                    break;
                case 3:
                    System.out.println("3. ");
                    processador.opcoesProcessador("Intel", "i5 Core 14400F", 1200);
                    break;
                case 4:
                    System.out.println("0. Sair.");
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
                    processador.opcoesProcessador("Philco", "Ph900 Turbo", 200);
                    break;
                case 2:
                    processador.opcoesProcessador("AMD", "Ryzen", 1000);
                    break;
                case 3:
                    processador.opcoesProcessador("Intel", "Core", 1200);
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