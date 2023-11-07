package atividade18;
import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] areasSalas = new double[20];
        double somaAreas = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Digite a área da sala " + (i + 1) + " da Unifebe (em metros quadrados):");
            areasSalas[i] = scanner.nextDouble();
            somaAreas += areasSalas[i];
        }
        scanner.close();

        double mediaAreas = somaAreas / 20;

        System.out.println("A área média das salas da Unifebe é " + mediaAreas + " metros quadrados.");

        System.out.println("Salas com área maior que a média:");

        for (int i = 0; i < 20; i++) {
            if (areasSalas[i] > mediaAreas) {
                System.out.println("Sala " + (i + 1) + " - Área: " + areasSalas[i] + " metros quadrados");
            }
        }
    }
}