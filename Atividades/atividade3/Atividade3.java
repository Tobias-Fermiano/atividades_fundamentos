package atividade3;
import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        int[] altura = new int[4]; // Array para armazenar alturas de 4 alunos.
        int[] peso = new int[4]; // Array para armazenar pesos de 4 alunos.
        int[] sexo = new int[4]; // Array para armazenar o sexo de 4 alunos (1 = Feminino, 2 = Masculino).
        int[] idade = new int[4]; // Array para armazenar idades de 4 alunos.

        int alunos = 0; // Variável para rastrear o número de alunos inseridos.
        Scanner scanner = new Scanner(System.in);

        while (alunos < 4) { // Loop para coletar informações de 4 alunos.
            alunos++;
            System.out.println("Informe a altura do aluno " + alunos + " (cm): ");
            altura[alunos - 1] = scanner.nextInt(); //armazena a altura na posição 0 do array.

            System.out.println("Informe o peso do aluno " + alunos + " (kg): ");
            peso[alunos - 1] = scanner.nextInt();

            System.out.println("Informe o sexo do aluno " + alunos + " (1 = Feminino, 2 = Masculino): ");
            sexo[alunos - 1] = scanner.nextInt();

            System.out.println("Informe a idade do aluno " + alunos + " (anos): ");
            idade[alunos - 1] = scanner.nextInt();
        }

        // Cálculo da média de altura das alunas
        int somaAlturasFeminino = 0;
        int qtdAlturasFeminino = 0;
        for (int i = 0; i < alunos; i++) {
            if (sexo[i] == 1) { // Verifica se o aluno é do sexo feminino
                somaAlturasFeminino += altura[i];
                qtdAlturasFeminino++;
            }
        }
        int mediaAlturasFeminino = somaAlturasFeminino / qtdAlturasFeminino; //calculo da media de altura das mulheres.
        System.out.println("A média de altura das alunas mulheres é de: " + mediaAlturasFeminino + " cm"); //apresenta o valor da media.

        // Cálculo da média de peso dos alunos do sexo masculino.
        int somaPesoMasc = 0;
        int qtdPesoMasc = 0;
        for (int i = 0; i < alunos; i++) {
            if (sexo[i] == 2) { // Verifica se o aluno é do sexo masculino.
                somaPesoMasc += peso[i];
                qtdPesoMasc++;
            }
        }
        int mediaPesosMasc = somaPesoMasc / qtdPesoMasc;
        System.out.println("A média de peso dos alunos homens é de: " + mediaPesosMasc + " kg");

        // Cálculo da média de idade de todos os alunos.
        int somaIdades = 0;
        int qtdIdades = alunos;

        for (int i = 0; i < alunos; i++) {
            somaIdades += idade[i];
        }
        int mediaIdades = somaIdades / qtdIdades;
        System.out.println("A média de idade dos alunos é de : " + mediaIdades + " anos");
        scanner.close();
    }
}