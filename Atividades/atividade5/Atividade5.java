package atividade5;
import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        int[] veiculo = new int[3]; // Array para armazenar a marca de veículo de 3 alunos.
        int[] sexo = new int[3]; // Array para armazenar o sexo de 3 alunos (1 = Feminino, 2 = Masculino).
        int[] idade = new int[3]; // Array para armazenar a idade de 3 alunos.

        Scanner scanner = new Scanner(System.in);
        int alunos = 0; // Variável para rastrear o número de alunos inseridos.

        while (alunos < 3) { // Loop para coletar informações de até 3 alunos.
            alunos++;
            System.out.println("Digite a marca do veículo do aluno " + alunos + " (1 = VW  2 = Fiat  3 = outros)");
            veiculo[alunos - 1] = scanner.nextInt(); // Lê a marca de veículo e armazena no array.

            System.out.println("Digite o sexo do aluno " + alunos + " (1 = Feminino  2 = Masculino)");
            sexo[alunos - 1] = scanner.nextInt(); // Lê o sexo e armazena no array.

            System.out.println("Digite a idade do aluno " + alunos);
            idade[alunos - 1] = scanner.nextInt(); // Lê a idade e armazena no array.
        }

        // Cálculo da idade média das alunas mulheres.
        int somaIdadeFem = 0;
        int qtdIdadeFem = 0;
        for (int i = 0; i < alunos; i++) {
            if (sexo[i] == 1) { // Verifica se o aluno é do sexo feminino.
                somaIdadeFem += idade[i];
                qtdIdadeFem++;
            }
        }
        int mediaIdadeFem = somaIdadeFem / qtdIdadeFem;
        System.out.println("A idade média das alunas mulheres é de " + mediaIdadeFem + " anos");

        // Contagem de alunos homens com veículos da marca VW.
        int qtdMascVW = 0;
        for (int i = 0; i < alunos; i++) {
            if (sexo[i] == 2 && veiculo[i] == 1) { // Verifica se é um homem com carro da marca VW.
                qtdMascVW++;
            }
        }
        System.out.println("O total de alunos homens que possuem VW é de: " + qtdMascVW);
        scanner.close(); // Fecha o Scanner após a leitura.
    }
}