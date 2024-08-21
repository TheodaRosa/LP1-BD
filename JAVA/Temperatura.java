
// Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor correspondente
// em graus Celsius. Observação: Para testar se a sua resposta está correta saiba que 100°C = 212°F

public class Temperatura {
    private int tempFarenheit;
    private int tempCelsius;

    public Temperatura(int tempFarenheit, int tempCelsius) {
        this.tempFarenheit = tempFarenheit;
        this.tempCelsius = tempCelsius;
    }
    public int convFarenheit() {
        return (((tempCelsius*9)+160)/5);
    }
    public int convCelsius() {
        return ((tempFarenheit*5)-160)/9;
    }

    public static void main(String[] args) {
        Temperatura c1 = new Temperatura(0,0);
        c1.convCelsius();
        c1.convFarenheit();
        System.out.println(c1.convFarenheit());
        System.out.println(c1.convCelsius());
    }
}
