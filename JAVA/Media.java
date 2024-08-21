public class Media {
    private int nota1;
    private int nota2;
    private String aprovado = "Aprovado";
    private String reprovado = "Reprovado";

    public Media(int nota1, int nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double getMedia() {
        return (nota1 + nota2) / 2;
    }
    public String aprovaMedia() {
        if(getMedia() >= 6) return aprovado; else return reprovado;
    }

    public static void main(String[] args) {
        Media m1 = new Media(70, 80);
        System.out.println("A média do aluno foi de "+m1.getMedia()+", e ele foi"+m1.aprovaMedia());
    }
}
