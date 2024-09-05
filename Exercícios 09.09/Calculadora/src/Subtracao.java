import java.util.Scanner;

public class Subtracao {
    private int num1, num2;

    public Subtracao(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int subtracao() {
        return num1 - num2;
    }

    public static void Subtracao() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int num2 = sc.nextInt();
        Subtracao subtracao = new Subtracao(num1, num2);
        System.out.printf("%d - %d = "+subtracao.subtracao(), num1, num2);
        System.out.println("Digite 1-4 para escolher outra operação, digite 0 para sair: ");
    }
}
