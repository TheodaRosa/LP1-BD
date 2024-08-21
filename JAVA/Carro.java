
// O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do
//  distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de
//  28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
//  calcular e escrever o custo final ao consumidor.

public class Carro {
    private int cusFab;

    public Carro(int cusFab) {
        this.cusFab = cusFab;
    }

    public double getCusCarro() {
        return (cusFab*1.73);
    }

    public static void main(String[] args) {
        Carro c1 = new Carro(1000);
        c1.getCusCarro();
        System.out.println("O custo do carro é de "+ c1.getCusCarro());
    }
}
