package atividade8;
import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro para calcular seu fatorial: ");
        int entrada = scanner.nextInt();

        // Cálculo do fatorial
        int resultado = 1;
        for (int fatorial = 1; fatorial <= entrada; fatorial++) {
            resultado *= fatorial;
        }
        System.out.println("O fatorial do número " + entrada + " é " + resultado);
        scanner.close();
    }
}
