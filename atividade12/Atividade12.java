package atividade12;
import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entrada;
        int soma = 0;
        int qtd = 0;
        int maior = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Digite um número inteiro");
            entrada = scanner.nextInt();

            if (entrada > 20) {
                break;
            }

            boolean ehPrimo = isPrimo(entrada);
            String parOuImpar;
            if (entrada % 2 == 0) {
                parOuImpar = "par";
            } else {
                parOuImpar = "ímpar";
            }

            System.out.println("O número " + entrada + " é " + (ehPrimo ? "primo" : "não primo") + " e é " + parOuImpar);

            soma += entrada;
            qtd++;
            if (entrada > maior) {
                maior = entrada;
            }
        }

        if (qtd > 0) {
            int media = soma / qtd;
            System.out.println("A média aritmética dos números informados (desconsiderando o último) é: " + media);
            System.out.println("O maior número informado é: " + maior);
        } else {
            System.out.println("Nenhum número válido foi informado.");
        }

        scanner.close();
    }

    public static boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}