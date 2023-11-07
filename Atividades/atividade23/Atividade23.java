package atividade23;
import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalViagens = 10;
        int[] numeroOnibus = new int[totalViagens];
        int[] lotacaoMaxima = new int[totalViagens];
        int lotacaoMaisLotado = 0;
        int onibusMaisLotado = 0;
        int somaLotacoes = 0;

        // Coleta as informações de cada viagem
        for (int i = 0; i < totalViagens; i++) {
            System.out.println("Viagem " + (i + 1));
            System.out.print("Número do ônibus: ");
            numeroOnibus[i] = scanner.nextInt();
            System.out.print("Número inicial da catraca: ");
            int catracaInicial = scanner.nextInt();
            System.out.print("Número final da catraca: ");
            int catracaFinal = scanner.nextInt();
            lotacaoMaxima[i] = catracaFinal - catracaInicial;
            somaLotacoes += lotacaoMaxima[i];

            // Verifica o ônibus mais lotado
            if (lotacaoMaxima[i] > lotacaoMaisLotado) {
                lotacaoMaisLotado = lotacaoMaxima[i];
                onibusMaisLotado = numeroOnibus[i];
            }
        }

        double mediaLotacoes = (double) somaLotacoes / totalViagens;

        System.out.println("Número do ônibus mais lotado: Ônibus " + onibusMaisLotado + " com lotação de " + lotacaoMaisLotado);
        System.out.print("Ônibus com lotação abaixo da média: ");
        
        // Verifica os ônibus com lotação abaixo da média
        for (int i = 0; i < totalViagens; i++) {
            if (lotacaoMaxima[i] < mediaLotacoes) {
                System.out.print("Ônibus " + numeroOnibus[i] + " ");
            }
        }
        
        // Fecha o Scanner
        scanner.close();
    }
}
