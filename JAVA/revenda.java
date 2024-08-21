
// Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma comissão
// também fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. Escrever um algoritmo que
// leia o número de carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele recebe
// por carro vendido. Calcule e escreva o salário final do vendedor.

public class revenda {
    private int salFixo;
    private int carrosVendidos;
    private int precoCarro;
    private int comm;

    public revenda(int salFixo, int carrosVendidos, int precoCarro, int comm) {
        this.salFixo = salFixo;
        this.carrosVendidos = carrosVendidos;
        this.precoCarro = precoCarro;
        this.comm = comm;
    }
    public double comissao() {
        return salFixo + (carrosVendidos*comm) + (carrosVendidos*(precoCarro*0.05));
    }

    public static void main(String[] args) {
        revenda c1 = new revenda(1500, 1000, 3000, 100);
        c1.comissao();
        System.out.println("O salário do revendedor é de: R$"+c1.comissao());
    }
}
