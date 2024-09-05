import java.util.Scanner;

public class HD {
    private String modelo;
    private int GB;
    static float preco;

    public void opcoesHD(String modelo, int GB, float preco) {
        HD.preco = preco;
        System.out.printf("Modelo: %s \nMemoria: %d \nPreço: %.2f \n \n ", modelo, GB, preco);
    }

    public static float getPreco (){
        return preco;
    }

    static void hdEscolhas() {
        HD hd = new HD();
        Scanner entrada = new Scanner(System.in);
        int escolha;
        int i = 1;

        do {
            switch (i) {
                case 1:
                    System.out.println("1. ");
                    hd.opcoesHD("Seagate", 500, 50);
                    break;
                case 2:
                    System.out.println("2. ");
                    hd.opcoesHD("WD", 1000, 150);
                    break;
                case 3:
                    System.out.println("3. ");
                    hd.opcoesHD("Seagate", 4000, 350);
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
                    hd.opcoesHD("Seagate", 500, 50);
                    break;
                case 2:
                    hd.opcoesHD("WD", 1000, 150);
                    break;
                case 3:
                    hd.opcoesHD("Seagate", 4000, 350);
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