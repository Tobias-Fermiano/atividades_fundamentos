package atividade4;
import java.util.Scanner;

public class Atividade4 {
    public static void main () {
        Scanner scanner = new Scanner(System.in);
        int[] origem = new int[3];
        int[] idade = new int[3];
        int torcedores = 0;

        while(torcedores <= 3) {
            torcedores++;
            System.out.println("Digite a origem do torcedor " + torcedores);
            origem[torcedores - 1] = scanner.nextInt();

            System.out.println("Digite a idade do torcedor " + torcedores);
            idade[torcedores - 1] = scanner.nextInt();
        }
        
        // Percentual de torcedores de Brusque
        int somaTorcBrusque = 0;
        for (int i = 0; i < torcedores; i++) {
            if (origem[i] == 1) {
                somaTorcBrusque++;
            }
        }
        int percentBrusque = (somaTorcBrusque * 100) / torcedores;
        System.out.println("O percentual de torcedores de Brusque é de: " + percentBrusque + " %");

        // Media de idade de outras cidades
        int somaIdadeOutras = 0;
        int qtdIdadeOutras = 0;
        for (int i = 0; i < torcedores; i++) {
            if (origem[i] == 2) {
                somaIdadeOutras += idade[i];
                qtdIdadeOutras++;
            }
        }
        int mediaIdadeOutras = somaIdadeOutras / qtdIdadeOutras;
        System.out.println("A média de idade dos torcedores de outras cidades é de: " + mediaIdadeOutras + " anos");

        scanner.close();
    }
}
