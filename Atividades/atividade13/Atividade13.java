package atividade13;
import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner scanner = new Scanner(System.in);
        int[] idade = new int[20];
        int[] sexo = new int[20];
        int[] xp = new int[20];

        // Captura das informações
        int candidato = 0;
        while (candidato < 20) {
            candidato++;
            System.out.println("Informe a idade do candidato " + candidato);
            idade[candidato - 1] = scanner.nextInt();
            
            System.out.println("Informe o sexo do candidato " + candidato + " (1 = Masculino / 2 = Feminino)");
            sexo[candidato - 1] = scanner.nextInt();
            
            System.out.println("Informe a experiência do candidato" + candidato + " (1 = Sim / 2 = Não)");
            xp[candidato - 1] = scanner.nextInt();
        }

        // Qtd do sexo feminino
        int somaFeminino = 0;
        for (int i = 0; i < candidato; i++) {
            if (sexo[i] == 2) {
                somaFeminino++;
            }
        }
        System.out.println("A quantidade de candidatos do sexo feminino é: " + somaFeminino);

        // Qtd do sexo masculino
        int somaMasculino = 0;
        for (int i = 0; i < candidato; i++) {
            if (sexo[i] == 1) {
                somaMasculino++;
            }
        }
        System.out.println("A quantidade de candidatos do sexo masculino é: " + somaMasculino);

        // Idade média dos homens com experiência
        int somaMasculinoIdade = 0;
        int qtdMasculinoExperiencia = 0;
        int mediaMasculinoExperiencia = 0;
        for (int i = 0; i < candidato; i++) {
            if (sexo[i] == 1) {
                if (xp[i] == 1) {
                    somaMasculinoIdade += idade[i];
                    qtdMasculinoExperiencia++;
                }
            }
        }
        mediaMasculinoExperiencia = somaMasculinoIdade / qtdMasculinoExperiencia;
        System.out.println("A média de idade dos homens com experiência pe de: " + mediaMasculinoExperiencia);

        // Porcentagem dos homens com mais de 45 anos, em relação ao total de homens
        int qtdMasculino45 = 0;
        int porcentMasculino45 = 0;
        int totalMasculino = 0;
        for (int i = 0; i < candidato; i++) {
            if (sexo[i] == 1) {
                totalMasculino++;
                if (idade[i] > 45) {
                    qtdMasculino45++;
                }
            }
        }
        porcentMasculino45 = (qtdMasculino45 / totalMasculino) * 100;
        System.out.println("A porcentagem dos homens com mais de 45 anos, em relação ao total de homens é de: " + porcentMasculino45 + "%");

        // Quantidade de mulheres com idade inferior a 35 anos e com experiência no serviço
        int qtdFeminino35xp = 0;
        for (int i = 0; i < candidato; i++) {
            if (sexo[i] == 2) {
                if (idade[i] < 35) {
                    if (xp[i] == 1) {
                        qtdFeminino35xp++;
                    }
                }
            }
        }
        System.out.println("A quantidade de mulheres com idade inferior a 35 anos e com experiência no serviço é de " + qtdFeminino35xp);

        // Fecha o scanner
        scanner.close();
    }
}