package atividade22;
import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalEntrevistados = 10;
        int[] matriculas = new int[totalEntrevistados];
        double[] alturas = new double[totalEntrevistados];
        double[] pesos = new double[totalEntrevistados];
        int[] idades = new int[totalEntrevistados];
        int[] sexos = new int[totalEntrevistados];
        double alturaMediaMulheres = 0;
        double pesoMedioHomens = 0;
        int totalMulheres = 0;
        int totalHomens = 0;
        int somaIdades = 0;

        // Coleta as informações de cada entrevistado
        for (int i = 0; i < totalEntrevistados; i++) {
            System.out.println("Entrevistado " + (i + 1));
            System.out.print("Número de matrícula: ");
            matriculas[i] = scanner.nextInt();
            System.out.print("Altura (em metros): ");
            alturas[i] = scanner.nextDouble();
            System.out.print("Peso (em kg): ");
            pesos[i] = scanner.nextDouble();
            System.out.print("Idade: ");
            idades[i] = scanner.nextInt();
            System.out.print("Sexo (1 = F, 2 = M): ");
            sexos[i] = scanner.nextInt();

            // Calcula altura média das mulheres
            if (sexos[i] == 1) {
                alturaMediaMulheres += alturas[i];
                totalMulheres++;
            }

            // Calcula peso médio dos homens
            if (sexos[i] == 2) {
                pesoMedioHomens += pesos[i];
                totalHomens++;
            }

            somaIdades += idades[i];
        }

        // Calcula as médias
        if (totalMulheres > 0) {
            alturaMediaMulheres /= totalMulheres;
        }
        if (totalHomens > 0) {
            pesoMedioHomens /= totalHomens;
        }

        double mediaIdades = (double) somaIdades / totalEntrevistados;

        System.out.println("Altura média das mulheres: " + alturaMediaMulheres + " metros");
        System.out.println("Peso médio dos homens: " + pesoMedioHomens + " kg");
        System.out.print("Matrículas dos entrevistados que são mais velhos que a média: ");
        
        // Verifica os entrevistados mais velhos que a média
        for (int i = 0; i < totalEntrevistados; i++) {
            if (idades[i] > mediaIdades) {
                System.out.print(matriculas[i] + " ");
            }
        }
        
        // Fecha o Scanner
        scanner.close();
    }
}
