package atividade11;
import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entrada = 0;
        int maior = 0;
        int menor = 0;
        int count22 = 0;

        for (int i = 0; i < 20; i++) {
            entrada = scanner.nextInt();

            int resultado = 1;
            for (int fatorial = 1; fatorial <= entrada; fatorial++) {
                resultado *= fatorial;
            }
            System.out.println("O fatorial do número " + entrada + " é " + resultado);

            if (entrada % 2 == 0) {
                System.out.println("O número informado é par");
            } else {
                System.out.println("O número informado é ímpar");
            }

            if (entrada > maior) {
                maior = entrada;
            }

            if (entrada < menor) {
                menor = entrada;
            }

            if (entrada == 22) {
                count22++;
            }
        }
        System.out.println("O maior número informado é: " + maior);
        System.out.println("O menor número informado é: " + menor);
        System.out.println("O número 22 foi repetido " + count22 + " vezes");
        scanner.close();
    }
}
