import java.util.Scanner;

public class Gabinete {
    private String modelo;
    private String cor;
    private static float preco;

    public void opcoesGabinete(String modelo, String cor, float preco) {
        Gabinete.preco = preco;
        System.out.printf("Modelo: %s \n Cor: %s \n Preço: %.2f \n \n ", modelo, cor, preco);
    }

    public static float getPreco(){
        return preco;
    }

    static void gabinetesEscolhas() {
        Gabinete gabinete = new Gabinete();
        Scanner entrada = new Scanner(System.in);
        int escolha;
        int i = 1;

        do {
            switch (i) {
                case 1:
                    System.out.println("1. ");
                    gabinete.opcoesGabinete("Pequeno", "Preto", 500);
                    break;
                case 2:
                    System.out.println("2. ");
                    gabinete.opcoesGabinete("Médio", "Cinza", 600);
                    break;
                case 3:
                    System.out.println("3. ");
                    gabinete.opcoesGabinete("Grande", "Branco", 800);
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
                    gabinete.opcoesGabinete("Pequeno", "Preto", 500);
                    break;
                case 2:
                    gabinete.opcoesGabinete("Médio", "Cinza", 600);
                    break;
                case 3:
                    gabinete.opcoesGabinete("Grande", "Branco", 800);
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
