import java.util.Scanner;

public class Multiplicacao {
    private int num1, num2;
    public Multiplicacao(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int Mult() {
        return num1 * num2;
    }

    public static void Multiplicar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        int num2 = sc.nextInt();
        Multiplicacao m = new Multiplicacao(num1, num2);
        System.out.printf("%d x %d = "+m.Mult(), num1, num2);
        System.out.println("Digite 1-4 para escolher outra operação, digite 0 para sair: ");
    }
}
