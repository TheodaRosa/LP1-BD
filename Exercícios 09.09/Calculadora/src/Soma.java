import java.util.Scanner;

public class Soma {
    private int num1, num2;
    public Soma(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int soma() {
        return num1 + num2;
    }

    public static void Soma() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();
        Soma soma = new Soma(num1, num2);
        System.out.printf("%d + %d = "+soma.soma(), num1, num2);
        System.out.println("Digite 1-4 para escolher outra operação, digite 0 para sair: ");
    }
}
