package atividade20;
import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalClientes = 30;
        int somaNotas = 0;
        int somaNotasHomens = 0;
        int contMulheresAcima50 = 0;
        int idadeMulherMaisJovem = Integer.MAX_VALUE;
        double mediaNotas = 0;

        for (int i = 0; i < totalClientes; i++) {
            System.out.println("Cliente " + (i + 1));
            System.out.print("Sexo (1 = feminino, 2 = masculino): ");
            int sexo = scanner.nextInt();
            System.out.print("Nota para o cinema (0 a 10): ");
            int nota = scanner.nextInt();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();

            somaNotas += nota;

            if (sexo == 2) { // Verifica se o cliente é do sexo masculino
                somaNotasHomens += nota;
            }

            if (sexo == 1 && idade < idadeMulherMaisJovem) { // Verifica a mulher mais jovem
                idadeMulherMaisJovem = idade;
            }

            if (sexo == 1 && idade > 50 && nota > mediaNotas) { // Verifica mulheres com mais de 50 anos
                contMulheresAcima50++;
            }
        }

        scanner.close();
        mediaNotas = (double) somaNotas / totalClientes;

        System.out.println("a) A nota média recebida pelo cinema é: " + mediaNotas);
        System.out.println("b) A nota média atribuída pelos homens é: " + (double) somaNotasHomens / totalClientes);
        System.out.println("c) A nota atribuída pela mulher mais jovem é: " + idadeMulherMaisJovem);
        System.out.println("d) Quantidade de mulheres com mais de 50 anos que deram nota acima da média: " + contMulheresAcima50);
    }
}