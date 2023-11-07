package atividade2;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um Scanner para receber as entradas do usuário.

        System.out.println("Informe a idade do primeiro aluno: "); // Solicita a idade do primeiro aluno.
        int idadeAluno1 = scanner.nextInt(); // Lê a idade do primeiro aluno.

        System.out.println("Informe a idade do segundo aluno: "); // Solicita a idade do segundo aluno.
        int idadeAluno2 = scanner.nextInt(); // Lê a idade do segundo aluno.

        System.out.println("Informe a idade do terceiro aluno: "); // Solicita a idade do terceiro aluno.
        int idadeAluno3 = scanner.nextInt(); // Lê a idade do terceiro aluno.

        scanner.close(); // Fecha o Scanner após a leitura.

        int soma = idadeAluno1 + idadeAluno2 + idadeAluno3; // Calcula a soma das idades dos alunos.
        int qtd = 3; // Define a quantidade de alunos (neste caso, são 3).
        int media = soma / qtd; // Calcula a média das idades dos alunos.

        System.out.println(media); // Imprime a média das idades no console.
    }
}