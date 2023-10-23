package atividade10;
import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entrada = scanner.nextInt();

        int soma = 0;
        int qtd = 0;
        int maior = 0;
        int mult5 = 0;

        while (entrada != 99) {
            soma += entrada;
            qtd++;
            if (entrada > maior) {
                maior = entrada;
            }
            if (entrada % 5 == 0) {
                mult5++;
            }
        }
        int media = soma / qtd;
        System.out.println("A média aritmética dos números informados é de: " + media);
        System.out.println("O maior número informado é: " + maior);
        System.out.println(mult5 + "dos números informados são múltiplos de cinco");
        scanner.close();
    }
}
