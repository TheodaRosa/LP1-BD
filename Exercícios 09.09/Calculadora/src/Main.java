import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha;
        System.out.println("""
                           CALCULADORA\s
                           "1. SOMA\s
                           "2. SUBTRAÇÃO\s
                           "3. MULTIPLICAÇÃO\s
                           "4. DIVISÃO\s
                           "0. SAIR
                           """);
        do{
            escolha = sc.nextInt();
            switch (escolha) {
                case 1:
                    Soma.Soma();
                    break;
                case 2:
                    Subtracao.Subtracao();
                    break;
                case 3:
                    Multiplicacao.Multiplicar();
                    break;
                case 4:
                    Divisao.Divisao();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }
        }while (escolha != 0);
    }
}