package atividade1;

import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        // Cria um Scanner para digitar o valor da entrada do usuário no terminal.
        Scanner scanner = new Scanner(System.in); // Inicio do Scanner.

        // Solicita a digitação do ano de fabricação do primeiro carro.
        System.out.println("Informe o ano de fabricação do primeiro carro:");
        int anoFabricacao1 = scanner.nextInt(); // Lê o ano do primeiro carro.
        int idadeCarro1 = 2023 - anoFabricacao1; // Calcula a idade do primeiro carro.

        // Solicita a digitação do ano de fabricação do segundo carro.
        System.out.println("Informe o ano de fabricação do segundo carro:");
        int anoFabricacao2 = scanner.nextInt(); // Lê o ano do segundo carro.
        int idadeCarro2 = 2023 - anoFabricacao2; // Calcula a idade do segundo carro.

        // Solicita a digitação do ano de fabricação do terceiro carro.
        System.out.println("Informe o ano de fabricação do terceiro carro:");
        int anoFabricacao3 = scanner.nextInt(); // Lê o ano do terceiro carro.
        int idadeCarro3 = 2023 - anoFabricacao3; // Calcula a idade do terceiro carro.

        scanner.close(); // Fecha o Scanner após a leitura.

        // Calcula a soma das idades dos carros.
        int soma = idadeCarro1 + idadeCarro2 + idadeCarro3;

        int qtd = 3; // Define a quantidade de carros.
        int media = soma / qtd; // Calcula a média das idades dos carros.

        // Imprime a média das idades no console.
        System.out.println(media);
    }
}