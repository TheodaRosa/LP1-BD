public class CalcIdade{
    private int ano;
    private int mes;
    private int dia;
    
    public CalcIdade(int a, int m, int d){
        this.ano = a;
        this.mes = m;
        this.dia = d;
    }
    
    public int conv(){
        return((ano*365)+(mes*30)+dia);
    }
    
    public static void main(String []args){
        CalcIdade c1;
        c1=new CalcIdade(19,7,30);
        c1.conv();
        
        System.out.print("A idade do indivíduo, em dias, são:"+c1.conv());
    }
}