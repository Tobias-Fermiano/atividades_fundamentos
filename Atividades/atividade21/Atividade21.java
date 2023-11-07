package atividade21;
import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalOnibus = 5;
        int totalPassageiros = 0;
        int onibusMaisLotado = 0;
        int maxPassageiros = 0;
        double mediaPassageiros = 0;

        // Loop para coletar informações de cada ônibus
        for (int i = 0; i < totalOnibus; i++) {
            System.out.println("Ônibus " + (i + 1));
            System.out.print("Número inicial da catraca: ");
            int catracaInicial = scanner.nextInt();
            System.out.print("Número final da catraca: ");
            int catracaFinal = scanner.nextInt();
            int passageirosNesteOnibus = catracaFinal - catracaInicial;
            totalPassageiros += passageirosNesteOnibus;

            // Verifica o ônibus mais lotado
            if (passageirosNesteOnibus > maxPassageiros) {
                maxPassageiros = passageirosNesteOnibus;
                onibusMaisLotado = i + 1;
            }
        }

        // Calcula a média de passageiros
        mediaPassageiros = (double) totalPassageiros / totalOnibus;

        // Exibe os resultados
        System.out.println("a) Quantas pessoas são transportadas em média pela empresa a cada viagem: " + mediaPassageiros);
        System.out.println("b) O número do ônibus que andou mais lotado é o ônibus " + onibusMaisLotado + " e transportou " + maxPassageiros + " passageiros.");
        System.out.println("c) Para viagens com lotação superior à média: ");

        // Loop para verificar os ônibus com lotação superior à média
        for (int i = 0; i < totalOnibus; i++) {
            System.out.print("   Ônibus " + (i + 1) + ": ");
            int passageirosNesteOnibus = scanner.nextInt();
            if (passageirosNesteOnibus > mediaPassageiros) {
                System.out.println("   Ônibus " + (i + 1) + " transportou " + passageirosNesteOnibus + " passageiros.");
            }
        }

        // Fecha o Scanner
        scanner.close();
    }
}