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

    public double porNul(){
        return((nulos/eleitores)*100);
    }
    public double porBra(){
        return((branco/eleitores)*100);
    }
    public double porVal(){
        return((valido/eleitores)*100);
    }

    public static void main(String[] args) {
        Eleitores c1;
        c1=new Eleitores(10000, 300, 400, 5000);
        c1.porc();
        c1.porNul();
        c1.porBra();
        c1.porVal();

        System.out.println("A porcentagem de eleitores na cidade é de: "+c1.porc()+"%");
        System.out.println("A porcentagem de votos nulos na cidade é de: "+c1.porNul()+"%");
        System.out.println("A porcentagem de votos brancos na cidade é de: "+c1.porBra()+"%");
        System.out.println("A porcentagem de votos válidos na cidade é de: "+c1.porVal()+"%");
    }
}