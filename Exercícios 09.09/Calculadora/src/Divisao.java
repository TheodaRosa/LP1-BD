import java.util.Scanner;

public class Divisao {
    private int divisor;
    private int numerador;
    public Divisao(int divisor, int numerador) {
        this.divisor = divisor;
        this.numerador = numerador;
    }

    public double dividendo() {
        return (double) numerador / divisor;
    }

    public static void Divisao() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numerador: ");
        int numerador = sc.nextInt();
        System.out.println("Digite o divisor: ");
        int divisor = sc.nextInt();
            if (divisor != 0) {
                Divisao d = new Divisao(divisor, numerador);
                System.out.printf("%d/%d = "+d.dividendo(),numerador,divisor);
            }
            else{
                System.out.println("0 não pode ser o Divisor");
            }
        System.out.println("Digite 1-4 para escolher outra operação, digite 0 para sair: ");
    }
}
