import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // if (escolha > 0) {System.out.print(escolha);} else {System.out.print("-");}
        int escolha;
        do {
            escolha = teclado.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("A");
                    break;
                case 2:
                    System.out.println("B");
                    break;
                case 3:
                    System.out.println("C");
                    break;
                case 4:
                    System.out.println("D");
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