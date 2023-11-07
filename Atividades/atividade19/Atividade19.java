package atividade19;
import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[25];

        // Lê os 25 números inteiros
        for (int i = 0; i < 25; i++) {
            System.out.print("Informe o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        scanner.close();

        int soma = 0;
        int maior = numeros[0];
        int menorMultiploDe5 = Integer.MAX_VALUE;
        boolean algumMaiorQueMedia = false;

        for (int num : numeros) {
            // a) Par ou ímpar
            String parImpar = (num % 2 == 0) ? "par" : "ímpar";

            // b) Primo ou não primo
            String primoNaoPrimo = "primo";
            if (num <= 1) {
                primoNaoPrimo = "não primo";
            } else {
                for (int i = 2; i * i <= num; i++) {
                    if (num % i == 0) {
                        primoNaoPrimo = "não primo";
                        break;
                    }
                }
            }

            // c) Múltiplo de 5
            String multiploDe5 = (num % 5 == 0) ? "múltiplo de 5" : "não é múltiplo de 5";

            // Atualiza a soma
            soma += num;

            // Atualiza o maior número
            if (num > maior) {
                maior = num;
            }

            // Verifica se é o menor múltiplo de 5
            if (num % 5 == 0 && num < menorMultiploDe5) {
                menorMultiploDe5 = num;
            }

            // Verifica se o número é maior que a média
            if (num > soma / 25.0) {
                algumMaiorQueMedia = true;
            }

            // Exibe as informações para cada número
            System.out.println(num + " é " + parImpar + ", " + primoNaoPrimo + ", e " + multiploDe5);
        }

        // Calcula a média aritmética
        double media = soma / 25.0;

        // Exibe as informações adicionais
        System.out.println("A média aritmética dos números informados é: " + media);
        System.out.println("O maior número informado é: " + maior);

        if (menorMultiploDe5 != Integer.MAX_VALUE) {
            long fatorial = 1;
            for (int i = 1; i <= menorMultiploDe5; i++) {
                fatorial *= i;
            }
            System.out.println("O fatorial do menor múltiplo de 5 informado é: " + fatorial);
        } else {
            System.out.println("Nenhum múltiplo de 5 foi informado.");
        }

        if (algumMaiorQueMedia) {
            System.out.print("Os números informados maiores que a média são: ");
            for (int num : numeros) {
                if (num > media) {
                    System.out.print(num + " ");
                }
            }
        } else {
            System.out.println("Nenhum número informado é maior que a média.");
        }
    }
}