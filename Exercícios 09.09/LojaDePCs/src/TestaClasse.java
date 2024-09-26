import java.util.Scanner;

public class TestaClasse {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // if (escolha > 0) {System.out.print(escolha);} else {System.out.print("-");}
        int escolha;
        float total = 0;
        do {
            System.out.print("""
                    BEM VINDO À LOJA DE PCS\s
                     1. GABINETES\s
                     2. MOUSES\s
                     3. TECLADOS\s
                     4. MONITORES\s
                     5. PROCESSADORES\s
                     6. FONTES\s
                     7. RAM\s
                     8. HD\s
                     9. SSD\s
                     10. PLACAS MÃE\s
                     11. PLACAS DE VÍDEO\s
                     12. COOLERS\s
                     0. SAIR DA LOJA\s
                    """);
            escolha = teclado.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Gabinetes");
                    Gabinete.gabinetesEscolhas();
                    total += Gabinete.getPreco();
                    break;
                case 2:
                    System.out.println("Mouses");
                    Mouse.mousesEscolhas();
                    total += Mouse.getPreco();
                    break;
                case 3:
                    System.out.println("Teclados");
                    Teclado.tecladoEscolhas();
                    total += Teclado.getPreco();
                    break;
                case 4:
                    System.out.println("Monitores");
                    Monitor.monitorEscolhas();
                    total += Monitor.getPreco();
                    break;
                case 5:
                    System.out.println("Processadores");
                    Processador.processadorEscolhas();
                    total += Processador.getPreco();
                    break;
                case 6:
                    System.out.println("Fontes");
                    Fonte.fonteEscolhas();
                    total += Fonte.getPreco();
                    break;
                case 7:
                    System.out.println("Rams");
                    RAM.ramEscolhas();
                    total += RAM.getPreco();
                    break;
                case 8:
                    System.out.println("HDs");
                    HD.hdEscolhas();
                    total += HD.getPreco();
                    break;
                case 9:
                    System.out.println("SSDs");
                    SSD.ssdEscolhas();
                    total += SSD.getPreco();
                    break;
                case 10:
                    System.out.println("Placas Mãe");
                    PlacaMae.PlacaMaeEscolhas();
                    total += PlacaMae.getPreco();
                    break;
                case 11:
                    System.out.println("Placas de Vídeo");
                    PlacaVideo.PlacaVideoEscolhas();
                    total += PlacaVideo.getPreco();
                    break;
                case 12:
                    System.out.println("Coolers");
                    Cooler.CoolerEscolhas();
                    total += Cooler.getPreco();
                    break;
                case 0:
                    System.out.println("Obrigado por visitar!");
                    break;
                default:
                    System.out.println("Opção invalida");
            }
        } while (escolha != 0);
        System.out.println("O total a se pagar é de: " + total);
    }

}