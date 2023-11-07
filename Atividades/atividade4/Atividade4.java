package atividade4;
import java.util.Scanner;

public class Atividade4 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int[] origem = new int[3]; // Array para armazenar a origem de 3 torcedores (1 = Brusque, 2 = Outras cidades).
        int[] idade = new int[3]; // Array para armazenar a idade de 3 torcedores.
        int torcedores = 0; // Variável para rastrear o número de torcedores inseridos.

        while (torcedores <= 3) { // Loop para coletar informações de até 3 torcedores.
            torcedores++;
            System.out.println("Digite a origem do torcedor " + torcedores); // Solicita a origem do torcedor.
            origem[torcedores - 1] = scanner.nextInt(); // Lê a origem e armazena no array.

            System.out.println("Digite a idade do torcedor " + torcedores); // Solicita a idade do torcedor.
            idade[torcedores - 1] = scanner.nextInt(); // Lê a idade e armazena no array.
        }

        // Cálculo do percentual de torcedores de Brusque.
        int somaTorcBrusque = 0;
        for (int i = 0; i < torcedores; i++) {
            if (origem[i] == 1) { // Verifica se a origem do torcedor é Brusque.
                somaTorcBrusque++;
            }
        }
        int percentBrusque = (somaTorcBrusque * 100) / torcedores;
        System.out.println("O percentual de torcedores de Brusque é de: " + percentBrusque + " %");

        // Cálculo da média de idade dos torcedores de outras cidades.
        int somaIdadeOutras = 0;
        int qtdIdadeOutras = 0;
        for (int i = 0; i < torcedores; i++) {
            if (origem[i] == 2) { // Verifica se a origem do torcedor é de outras cidades.
                somaIdadeOutras += idade[i];
                qtdIdadeOutras++;
            }
        }
        int mediaIdadeOutras = somaIdadeOutras / qtdIdadeOutras;
        System.out.println("A média de idade dos torcedores de outras cidades é de: " + mediaIdadeOutras + " anos");

        scanner.close(); // Fecha o Scanner após a leitura.
    }
}