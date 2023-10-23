package atividade5;
import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {

        int[] veiculo = new int[3];
        int[] sexo = new int[3];
        int[] idade = new int[3];

        Scanner scanner = new Scanner(System.in);
        int alunos = 0;
        while (alunos < 3) {
            alunos++;
            System.out.println("Digite a marca do veículo do aluno " + alunos + " (1 = VW  2 = Fiat  3 = outros)");
            veiculo[alunos - 1] = scanner.nextInt();

            System.out.println("Digite o sexo do aluno " + alunos + " (1 = Feminino  2 = Masculino)");
            sexo[alunos - 1] = scanner.nextInt();

            System.out.println("Digite a idade do aluno " + alunos);
            idade[alunos - 1] = scanner.nextInt();
        }

        // Idade média das mulheres
        int somaIdadeFem = 0;
        int qtdIdadeFem = 0;
        for (int i = 0; i < alunos; i++) {
            if (sexo[i] == 1) {
                somaIdadeFem += idade[i];
                qtdIdadeFem++;
            }
        }
        int mediaIdadeFem = somaIdadeFem / qtdIdadeFem;
        System.out.println("A idade média das alunas mulheres é de " + mediaIdadeFem + " anos");

        // Qtd homens com VW
        int qtdMascVW = 0;
        for (int i = 0; i < alunos; i++) {
            if (sexo[i] == 2 && veiculo[i] == 1) { // Verifica se é um homem com carro VW
                qtdMascVW++;
            }
        }
        System.out.println("O total de alunos homens que possuem VW é de: " + qtdMascVW);
        scanner.close();
    }
}