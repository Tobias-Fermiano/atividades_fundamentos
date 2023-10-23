package atividade3;
import java.util.Scanner;

public class Atividade3 {
    public static void main (String[] args) {
        int[] altura = new int[4];
        int[] peso = new int[4];
        int[] sexo = new int[4];
        int[] idade = new int[4];

        int alunos = 0;
        Scanner scanner = new Scanner(System.in);

        while (alunos < 4) {
            alunos++;
            System.out.println("Informe a altura do aluno " + alunos + " (cm): ");
            altura[alunos - 1] = scanner.nextInt();

            System.out.println("Informe o peso do aluno " + alunos + " (kg): ");
            peso[alunos - 1] = scanner.nextInt();

            System.out.println("Informe o sexo do aluno " + alunos + " (1 = Feminino, 2 = Masculino): ");
            sexo[alunos - 1] = scanner.nextInt();

            System.out.println("Informe a idade do aluno " + alunos + " (anos): ");
            idade[alunos - 1] = scanner.nextInt();
        }

        // Altura média das mulheres
        int somaAlturasFeminino = 0;
        int qtdAlturasFeminino = 0;
        for (int i = 0; i < alunos; i++) {
            if (sexo[i] == 1) {
                somaAlturasFeminino += altura[i];
                qtdAlturasFeminino++;
            }
        }
        int mediaAlturasFeminino = somaAlturasFeminino / qtdAlturasFeminino;
        System.out.println("A média de altura das alunas mulheres é de: " + mediaAlturasFeminino + " cm");

        // Peso médio dos homens
        int somaPesoMasc = 0;
        int qtdPesoMasc = 0;
        for (int i = 0; i < alunos; i++) {
            if (sexo[i] == 2) {
                somaPesoMasc += peso[i];
                qtdPesoMasc += 1;
            }
        }
        int mediaPesosMasc = somaPesoMasc / qtdPesoMasc;
        System.out.println("A média de peso dos alunos homens é de: " + mediaPesosMasc + " kg");

        // Média de idade de todos
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
