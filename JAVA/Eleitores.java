public class Eleitores{
    private double eleitores;
    private double nulos;
    private double branco;
    private double valido;

    public Eleitores(double e, double n, double b, double v){
        this.eleitores = e;
        this.nulos = n;
        this.branco = b;
        this.valido = v;
    }

    public double porc(){
        return(((nulos+branco+valido)/eleitores)*100);
    }

    public static void main(String[] args) {
        Eleitores c1;
        c1=new Eleitores(1000, 69, 1, 420);
        c1.porc();

        System.out.println("A porcentagem de eleitores na cidade é de: "+c1.porc()+"%");
    }
}