import java.util.Scanner;

class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominador não pode ser zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    private void reduce() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            throw new ArithmeticException("Não se pode dividir por zero.");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre o numerador e o denominador para a primeira fração:");
        int numerator1 = scanner.nextInt();
        int denominator1 = scanner.nextInt();
        Fraction fraction1 = new Fraction(numerator1, denominator1);

        System.out.println("Entre o numerador e o denominador para a seguda fração:");
        int numerator2 = scanner.nextInt();
        int denominator2 = scanner.nextInt();
        Fraction fraction2 = new Fraction(numerator2, denominator2);

        System.out.println("First Fraction: " + fraction1);
        System.out.println("Second Fraction: " + fraction2);

        System.out.println("Soma: " + fraction1.add(fraction2));
        System.out.println("Subtração: " + fraction1.subtract(fraction2));
        System.out.println("Multiplicação: " + fraction1.multiply(fraction2));
        System.out.println("Divisão: " + fraction1.divide(fraction2));

        scanner.close();
    }
}

