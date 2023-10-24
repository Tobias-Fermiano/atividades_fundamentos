package atividade17;
import java.util.Scanner;
import java.util.ArrayList;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> entradas = new ArrayList<>();
        int aluno = 0;
        int somaIdade = 0;
        int countMenorMedia = 0;

        while(aluno < 20) {
            aluno++;
            System.out.println("Digite a idade do aluno " + aluno);
            int entrada = scanner.nextInt();
            entradas.add(entrada);
            somaIdade += entrada;
        }

        int media = somaIdade / 20;
        System.out.println("A média de idade da turma é de " + media + " anos.");

        for (int i = 0; i < entradas.size(); i++) {
            if (media > entradas.get(i)) {
                countMenorMedia++;
            }
        }
        System.out.println(countMenorMedia + "alunos tem idade abaixo da média.");
        scanner.close();
    }
}
