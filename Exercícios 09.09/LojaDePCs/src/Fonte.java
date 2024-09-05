import java.util.Scanner;

public class Fonte {
    private String modelo;
    private int Watts;
    static float preco;

    public void opcoesFonte(String modelo, int Watts, float preco) {
        Fonte.preco = preco;
        System.out.printf("Modelo: %s \nWatts: %d \nPreço: %.2f \n \n ", modelo, Watts, preco);
    }

    public static float getPreco (){
        return preco;
    }

    static void fonteEscolhas() {
        Fonte fonte = new Fonte();
        Scanner entrada = new Scanner(System.in);
        int escolha;
        int i = 1;

        do {
            switch (i) {
                case 1:
                    System.out.println("1. ");
                    fonte.opcoesFonte("Duex", 230, 200);
                    break;
                case 2:
                    System.out.println("2. ");
                    fonte.opcoesFonte("Gigabyte", 500, 250);
                    break;
                case 3:
                    System.out.println("3. ");
                    fonte.opcoesFonte("Corsair", 550, 800);
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
                    fonte.opcoesFonte("Duex", 230, 200);
                    break;
                case 2:
                    fonte.opcoesFonte("Gigabyte", 500, 250);
                    break;
                case 3:
                    fonte.opcoesFonte("Corsair", 550, 800);
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