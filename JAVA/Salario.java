// Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
// Calcular e escrever o valor do novo salário.

public class Salario {
    private double salMen;
    private double reajuste;

    public Salario(double salmen, double reajuste) {
        this.salMen = salmen;
        this.reajuste = reajuste;
    }

    public double reajuste() {
        return ((salMen * (reajuste/100))+salMen);
    }


    public static void main(String[] args) {
        Salario c1;
        c1 = new Salario(1000, 100);

        c1.reajuste();
        System.out.println("O novo salário após reajuste é de: "+c1.reajuste());
    }
}