public class Extra {
    private int horario;
    private int salario;
    public Extra(int horario, int salario) {
        this.horario = horario;
        this.salario = salario;
    }
    public double getHorario() {
        if(horario > 240) return 240*salario+((horario-240)*(salario*50/100)); else return horario*salario;
    }

    public static void main(String[] args) {
        Extra e = new Extra(240, 120);
        System.out.println("O salário do funcionário desse mes é de R$"+e.getHorario());
    }
}
