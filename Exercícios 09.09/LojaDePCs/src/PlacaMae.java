import java.util.Scanner;

public class PlacaMae {
    private String modelo;
    private String geracao;
    static float preco;

    public void opcoesPlacaMae(String modelo, String geracao, float preco) {
        PlacaMae.preco = preco;
        System.out.printf("Modelo: %s \nGeracao: %s \nPreço: %.2f \n \n ", modelo, geracao, preco);
    }

    public static float getPreco (){
        return preco;
    }

    static void PlacaMaeEscolhas() {
        PlacaMae placaMae = new PlacaMae();
        Scanner entrada = new Scanner(System.in);
        int escolha;
        int i = 1;

        do {
            switch (i) {
                case 1:
                    System.out.println("1. ");
                    placaMae.opcoesPlacaMae("Gigabyte", "B760M", 1500);
                    break;
                case 2:
                    System.out.println("2. ");
                    placaMae.opcoesPlacaMae("AMD", "5700x", 2700);
                    break;
                case 3:
                    System.out.println("3. ");
                    placaMae.opcoesPlacaMae("Asus", "Z790", 4800);
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
                    placaMae.opcoesPlacaMae("Gigabyte", "B760M", 1500);
                    break;
                case 2:
                    placaMae.opcoesPlacaMae("AMD", "5700x", 2700);
                    break;
                case 3:
                    placaMae.opcoesPlacaMae("Asus", "Z790", 4800);
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