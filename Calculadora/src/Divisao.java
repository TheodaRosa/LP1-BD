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
        Divisao d = new Divisao(divisor, numerador);
        System.out.printf((char)4+"%d"+"= \n%d"+d.dividendo(), numerador, divisor);
    }
}
