import java.util.Scanner;

public class Monitor {
    private String modelo;
    private String hertz;
    private static float preco;

    public void getMonitor(String modelo, String hertz, float preco) {
        Teclado.preco = preco;
        System.out.printf("Modelo: %s \nCor: %s \nPreço: %.2f \n \n ", modelo, hertz, preco);
    }

    public static float getPreco (){
        return preco;
    }

    static void monitorEscolhas() {
        Monitor monitor = new Monitor();
        Scanner entrada = new Scanner(System.in);
        int escolha;
        do {
            escolha = entrada.nextInt();
            switch (escolha) {
                case 1:
                    monitor.getMonitor("Acer", "60HZ", 400);
                    break;
                case 2:
                    monitor.getMonitor("AOC", "144HZ", 800);
                    break;
                case 3:
                    monitor.getMonitor("LG", "240HZ", 1600);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção invalida");

            }
        }while (escolha != 0);
    }
}