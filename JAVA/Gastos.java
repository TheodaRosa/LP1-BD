
// Na empresa em que trabalhamos, há tabelas com o gasto de cada mês.
// Para fechar o balanço do primeiro trimestre, precisamos somar o gasto total.
// Sabendo que, em janeiro, foram gastos 15 mil reais, em fevereiro, 23 mil reais e, em março, 17 mil reais,
// faça um programa que calcule e imprima a despesa total no trimestre e a média mensal de gastos.

public class Gastos {
    private double mediaTrim;

    public Gastos() {
        mediaTrim = 55000/3;
    }

    public static void main(String[] args) {
        Gastos g = new Gastos();
        System.out.println("Os gastos do trimestre foram de 55 mil reais, e a média dos gastos foram de R$"+g.mediaTrim);
    }
}
