package atividade15;
import java.util.ArrayList;
import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> matricula = new ArrayList<>();
        ArrayList<Integer> idade = new ArrayList<>();
        ArrayList<Integer> sexo = new ArrayList<>();
        ArrayList<Integer> altura = new ArrayList<>();
        ArrayList<Integer> peso = new ArrayList<>();

        int i = 0;
        while (true) {
            i++;
            // Matricula
            System.out.println("Informe a matricula do aluno " + i);
            int matriculaAluno = scanner.nextInt();
            matricula.add(matriculaAluno);
            if (matriculaAluno == 0) { // Correção: alterado para 0
                break;
            }
            // Idade
            System.out.println("Informe a idade ao aluno " + i);
            int idadeAluno = scanner.nextInt();
            idade.add(idadeAluno);
            // Sexo
            System.out.println("Informe o sexo do aluno " + i + " (1=F, 2=M):");
            int sexoAluno = scanner.nextInt();
            sexo.add(sexoAluno);
            // Altura
            System.out.println("Informe a altura ao aluno " + i);
            int alturaAluno = scanner.nextInt();
            altura.add(alturaAluno);
            // Peso
            System.out.println("Informe o peso do aluno " + i);
            int pesoAluno = scanner.nextInt();
            peso.add(pesoAluno);
        }
        
        // Inicialização das variáveis
        int somaAlturaMulheres = 0;
        int qtdMulheres = 0;
        int somaPesoHomens = 0;
        int qtdHomens = 0;
        int somaIdade = 0;
        int qtdTotal = 0;
        int maiorAltura = 0;
        int matriculaMaiorAltura = 0;

        for (int j = 0; j < i; j++) {
            if (sexo.get(j) == 1) {
                somaAlturaMulheres += altura.get(j);
                qtdMulheres++;
            } else if (sexo.get(j) == 2) {
                somaPesoHomens += peso.get(j);
                qtdHomens++;
            }
            if (altura.get(j) > maiorAltura) {
                maiorAltura = altura.get(j);
                matriculaMaiorAltura = matricula.get(j);
            }
            somaIdade += idade.get(j);
            qtdTotal++;
        }
        
        // Cálculo das médias
        int mediaAlturaMulheres = qtdMulheres > 0 ? somaAlturaMulheres / qtdMulheres : 0;
        int mediaPesoHomens = qtdHomens > 0 ? somaPesoHomens / qtdHomens : 0;
        int mediaIdadeAlunos = qtdTotal > 0 ? somaIdade / qtdTotal : 0;

        System.out.println("A altura média das mulheres é de: " + mediaAlturaMulheres);
        System.out.println("O peso médio dos homens é de: " + mediaPesoHomens);
        System.out.println("A idade média dos estudantes é de: " + mediaIdadeAlunos);
        System.out.println("O número de matrícula do estudante mais alto é: " + matriculaMaiorAltura);

        scanner.close();
    }
}
