import java.util.Scanner;

public class Teclado {
    private String modelo;
    private String switches;
    static float preco;

    public void opcoesTeclado(String modelo, String switches, float preco) {
        Teclado.preco = preco;
        System.out.printf("Modelo: %s \nSwitch: %s \nPreço: %.2f \n \n ", modelo, switches, preco);
    }

    public static float getPreco (){
        return preco;
    }

    static void tecladoEscolhas() {
        Teclado teclado = new Teclado();
        Scanner entrada = new Scanner(System.in);
        int escolha;
        int i = 1;

        do {
            switch (i) {
                case 1:
                    System.out.println("1. ");
                    teclado.opcoesTeclado("Redragon", "Marrom", 125);
                    break;
                case 2:
                    System.out.println("2. ");
                    teclado.opcoesTeclado("Logitech", "Azul", 350);
                    break;
                case 3:
                    System.out.println("3. ");
                    teclado.opcoesTeclado("Razer", "Vermelho", 700);
                    break;
                case 4:
                    System.out.println("0. Sair");
                    break;
                default:
                    System.out.println("Opção invalida");
            }
            i++;
        } while(i != 5);

        do {
            escolha = entrada.nextInt();
            switch (escolha) {
                case 1:
                    teclado.opcoesTeclado("Redragon", "Marrom", 125);
                    break;
                case 2:
                    teclado.opcoesTeclado("Logitech", "Azul", 350);
                    break;
                case 3:
                    teclado.opcoesTeclado("Razer", "Vermelho", 700);
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