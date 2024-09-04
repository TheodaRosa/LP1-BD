import java.util.Scanner;

public class Mouse {
    private String modelo;
    private int dpi;
    private static float preco;

    public void getMouse(String modelo, int dpi, float preco) {
        Mouse.preco = preco;
        System.out.printf("Modelo: %s \nCor: %d \nPreço: %.2f \n \n ", modelo, dpi, preco);
    }

    public static float getPreco (){
        return preco;
    }

    static void mousesEscolhas() {
        Mouse mouse = new Mouse();
        Scanner entrada = new Scanner(System.in);
        int escolha;
        do {
            escolha = entrada.nextInt();
            switch (escolha) {
                case 1:
                    mouse.getMouse("Redragon", 800, 200);
                    break;
                case 2:
                    mouse.getMouse("Logitech", 1600, 400);
                    break;
                case 3:
                    mouse.getMouse("Razer", 2400, 600);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção invalida");

            }
        }while (escolha != 0);
    }
}
