public class Maca {
    private int qntMaca;
    public Maca(int qntMaca) {
        this.qntMaca = qntMaca;
    }
    public double custo() {
        if(qntMaca > 11) return qntMaca; else return qntMaca*1.3;
    }

    public static void main(String[] args) {
        Maca maca = new Maca(11);
        System.out.println("O preço a se pagar é de R$"+maca.custo());
    }
}
