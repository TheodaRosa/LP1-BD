import java.util.Scanner;

public class Teclado {
    private String modelo;
    private String switches;
    private static float preco;

    public void getTeclado(String modelo, String switches, float preco) {
        Teclado.preco = preco;
        System.out.printf("Modelo: %s \nCor: %s \nPreço: %.2f \n \n ", modelo, switches, preco);
    }

    public static float getPreco (){
        return preco;
    }

    static void tecladoEscolhas() {
        Teclado teclado = new Teclado();
        Scanner entrada = new Scanner(System.in);
        int escolha;
        do {
            escolha = entrada.nextInt();
            switch (escolha) {
                case 1:
                    teclado.getTeclado("Redragon", "Marrom", 125);
                    break;
                case 2:
                    teclado.getTeclado("Logitech", "Azul", 350);
                    break;
                case 3:
                    teclado.getTeclado("Razer", "Vermelho", 700);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção invalida");

            }
        }while (escolha != 0);
    }
}