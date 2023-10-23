package atividade14;
import java.util.ArrayList;
import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> idade = new ArrayList<>();
        ArrayList<Integer> opiniao = new ArrayList<>();

        // Entrada do usuário
        int i = 0;
        while (true) {
            i++;
            System.out.println("Informe a idade do entrevistado " + i);
            int idadeEntrevistado = scanner.nextInt();
            
            if (idadeEntrevistado == 999) {
                break;
            }
            idade.add(idadeEntrevistado);

            System.out.println("Informe a opinião do entrevistado " + i + ", sendo (1)ótimo, (2)bom, (3)regular, (4)ruim, (5)péssimo");
            int opiniaoEntrevistado = scanner.nextInt();
            opiniao.add(opiniaoEntrevistado);
        }

        // Cálculos
        int qtdOtimo = 0;
        int qtdBom = 0;
        int qtdRegular = 0;
        int qtdRuim = 0;
        int qtdPessimo = 0;
        int qtdTotal = opiniao.size();

        for (int j = 0; j < opiniao.size(); j++) {
            if (opiniao.get(j) == 1) {
                qtdOtimo++;
            } else if (opiniao.get(j) == 2) {
                qtdBom++;
            } else if (opiniao.get(j) == 3) {
                qtdRegular++;
            } else if (opiniao.get(j) == 4) {
                qtdRuim++;
            } else if (opiniao.get(j) == 5) {
                qtdPessimo++;
            }
        }

        int diferenca = qtdBom - qtdRegular;
        int somaIdadesRuim = 0;
        for (int j = 0; j < opiniao.size(); j++) {
            if (opiniao.get(j) == 4) {
                somaIdadesRuim += idade.get(j);
            }
        }
        
        double percentpessimo = (qtdPessimo / (double)qtdTotal) * 100.0;

        System.out.println("A quantidade de respostas Ótimo é de " + qtdOtimo);
        System.out.println("A diferença de votos entre respostas Bom e Regular é de " + diferenca);
        System.out.println("A média de idade das pessoas que responderam ruim é " + (qtdRuim > 0 ? somaIdadesRuim / qtdRuim : 0));
        System.out.println("O percentual de respostas Péssimo é de " + percentpessimo + "%");
        scanner.close();
    }
}