public class Valores {
    private int num1;
    private int num2;

    public Valores(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int maior() {
        if (num1 > num2) return num1; else return num2;
    }
    public String crescente() {
        if (num1 > num2) return num2+","+ num1; else return num1+","+ num2;
    }

    public static void main(String[] args) {
        Valores v1 = new Valores(30, 20);
        System.out.println("O maior valor é: "+v1.maior());
        System.out.println(v1.crescente());
    }
}

