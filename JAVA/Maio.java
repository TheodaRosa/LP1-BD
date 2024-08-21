
// Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso contrário escrever
// NÃO É MAIOR QUE 10!

public class Maio {
    private int leitura;
    private String maior = "É MAIOR QUE 10";
    private String menor = "NÃO É MAIOR QUE 10";
    private String positivo = "É POSITIVO";
    private String negativo = "É NEGATIVO";

    public Maio(int leitura) {
        this.leitura = leitura;
    }

    public String maiorQue10() {
        if (leitura > 10) return maior; else return menor;
    }
    public String valor() {
        if (leitura > 0) return positivo; else return negativo;
    }

    public static void main(String[] args) {
        Maio maio = new Maio(-110);
        System.out.println(maio.maiorQue10());
        System.out.println(maio.valor());
    }
}
