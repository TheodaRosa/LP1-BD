import java.util.Scanner;

public class Gabinete {
    private String modelo;
    private String cor;
    private float preco;

    public void getGabinete(String modelo, String cor, float preco) {
        System.out.printf("Modelo: %s \n Cor: %s \n Preço: %.2f \n \n ", modelo, cor, preco);
    }

    private float getPreco (){
        return preco;
    }

    static void gabinetesEscolhas() {
        Gabinete gabinete = new Gabinete();
        Scanner entrada = new Scanner(System.in);
        int escolha;
        do {
            escolha = entrada.nextInt();
            switch (escolha) {
                case 1:
                    gabinete.getGabinete("Pequeno", "Preto", 500);
                    gabinete.getPreco();
                    break;
                case 2:
                    gabinete.getGabinete("Médio", "Cinza", 600);
                    gabinete.getPreco();
                    break;
                case 3:
                    gabinete.getGabinete("Grande", "Branco", 800);
                    gabinete.getPreco();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção invalida");

            }
        }while (escolha != 0);
    }
}
