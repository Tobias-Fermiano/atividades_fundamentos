package atividade7;

public class Atividade7 {
    public static void main(String[] args) {
        int fim = 14835;

        int count3 = 0;
        int count3e7 = 0;

        for ( int inicio = 237; inicio <= fim; inicio++) {
            if (inicio % 3 == 0) {
                count3++;
                if (inicio % 7 == 0) {
                    count3e7++;
                }
            }
        }

        System.out.println(count3 + " número são múltiplos de três");
        System.out.println(count3e7 + " número são múltiplos de três e também de sete");
    }
}
