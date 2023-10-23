package atividade1;
import java.util.Scanner;

public class Atividade1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o ano de fabricação do primeiro carro:");
        int anoFabricacao1 = scanner.nextInt();
        int idadeCarro1 = 2023 - anoFabricacao1;

        System.out.println("Informe o ano de fabricação do segundo carro:");
        int anoFabricacao2 = scanner.nextInt();
        int idadeCarro2 = 2023 - anoFabricacao2;
        
        System.out.println("Informe o ano de fabricação do terceiro carro:");
        int anoFabricacao3 = scanner.nextInt();
        int idadeCarro3 = 2023 - anoFabricacao3;

        scanner.close();

        int soma = idadeCarro1 + idadeCarro2 + idadeCarro3;
        int qtd = 3;
        int media = soma / qtd;

        System.out.println(media);
    }
}