import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // if (escolha > 0) {System.out.print(escolha);} else {System.out.print("-");}
        int escolha;
        float total = 0;
        do {
            System.out.print("BEM VINDO À LOJA DE PCS \n 1. GABINETES \n 2. MOUSES \n 3. TECLADOS \n 4. MONITORES");
            escolha = teclado.nextInt();
            switch (escolha) {
                case 1:
                    Gabinete.gabinetesEscolhas();
                    total += Gabinete.getPreco();
                    break;
                case 2:
                    Mouse.mousesEscolhas();
                    total += Mouse.getPreco();
                    break;
                case 3:
                    Teclado.tecladoEscolhas();
                    total += Teclado.getPreco();
                    break;
                case 4:
                    Monitor.monitorEscolhas();
                    total += Monitor.getPreco();
                    break;
                case 5:
                    System.out.println("E");
                    break;
                case 6:
                    System.out.println("F");
                    break;
                case 7:
                    System.out.println("G");
                    break;
                case 8:
                    System.out.println("H");
                    break;
                case 9:
                    System.out.println("I");
                    break;
                case 10:
                    System.out.println("J");
                    break;
                case 11:
                    System.out.println("K");
                    break;
                case 12:
                    System.out.println("L");
                    break;
                case 0:
                    System.out.println("Obrigado por visitar!");
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        } while (escolha != 0);

    }

}