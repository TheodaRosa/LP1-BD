public class Main {
    private int numerador1, numerador2, denominador1, denominador2;

    public Main(int numerador1, int numerador2, int denominador1, int denominador2) {
        this.numerador1 = numerador1;
        this.numerador2 = numerador2;
        this.denominador1 = denominador1;
        this.denominador2 = denominador2;
    }

    public double Fracao1() {
        return (double) numerador1 / denominador1;
    }
    public double Fracao2() {
        return (double) numerador2 / denominador2;
    }

    public static void main(String[] args) {

    }

}
