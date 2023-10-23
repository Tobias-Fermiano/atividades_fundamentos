package atividade2;
import java.util.Scanner;

public class Atividade2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a idade do primeiro aluno: ");
        int idadeAluno1 = scanner.nextInt();

        System.out.println("Informe a idade do segundo aluno: ");
        int idadeAluno2 = scanner.nextInt();

        System.out.println("Informe a idade do terceiro aluno: ");
        int idadeAluno3 = scanner.nextInt();

        scanner.close();

        int soma = idadeAluno1 + idadeAluno2 + idadeAluno3;
        int qtd = 3;
        int media = soma / qtd;

        System.out.println(media);
    }
}
