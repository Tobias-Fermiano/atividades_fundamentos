package atividade16;
import java.util.Scanner;
import java.util.ArrayList;

public class Atividade16 {
    public static void main(String[] args) {
        int somaEntradas = 0;
        int qtdEntradas = 0;
        int maior = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> entradas = new ArrayList<>();
        int giro = 0;
        while (giro < 8) {
            giro++;
            System.out.println("Digite a entrada " + giro);
            int entrada = scanner.nextInt();
            entradas.add(entrada);

            for (int i = 0; i < entradas.size(); i++) {
                // impar ou par
                if (entradas.get(i) % 2 == 0) {
                    System.out.println("O número " + entradas.get(i) + " é par");
                } else {
                    System.out.println("O número " + entradas.get(i) + " é ímpar");
                }
                // fatorial
                int resultado = 1;
                for (int fatorial = 1; fatorial <= entrada; fatorial++) {
                resultado *= fatorial;
                }
                System.out.println("O fatorial do número " + entrada + " é " + resultado);
                // media
                somaEntradas += entradas.get(i);
                qtdEntradas++;
                // maior
                if (entradas.get(i) > maior) {
                    maior = entradas.get(i);
                }
            }
        }
        int media = somaEntradas / qtdEntradas;
        System.out.println("O a média dos números informados é de " + media);
        System.out.println("O maior número informado é " + maior);
        scanner.close();
    }   
}