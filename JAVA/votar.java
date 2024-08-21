public class votar {
    private int anoAtual;
    private int anoNascimento;
    private String podeVotar = "Esse cidadão pode votar esse ano";
    private String naoPode = "Esse cidadão não pode votar esse ano";

    public votar(int anoAtual, int anoNascimento) {
        this.anoAtual = anoAtual;
        this.anoNascimento = anoNascimento;
    }

    public String poderVotar() {
        if ((anoAtual - anoNascimento) > 16) return podeVotar; else return naoPode;
    }

    public static void main(String[] args) {
        votar v1 = new votar(2024, 2005);
        System.out.println(v1.poderVotar());
    }
}
