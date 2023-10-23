package atividade9;
import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int entrada = scanner.nextInt();

        boolean ehPrimo = true;

        if (entrada <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i * i <= entrada; i++) {
                if (entrada % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        if (ehPrimo) {
            System.out.println("O número é primo.");
        } else {
            System.out.println("O número não é primo.");
        }

        scanner.close();
    }
}
