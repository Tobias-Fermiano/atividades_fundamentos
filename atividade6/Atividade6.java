package atividade6;

public class Atividade6 {
    public static void main (String[] args) {
        // Estes são os dados das viagens de ônibus. Por favor, não os altere diretamente.
        String[] onibus = {
            "Bus001", "Bus002", "Bus003", "Bus004", "Bus005",
            "Bus006", "Bus007", "Bus008", "Bus009", "Bus010",
            "Bus011", "Bus012", "Bus013", "Bus014", "Bus015",
            "Bus016", "Bus017", "Bus018", "Bus019", "Bus020"
        };

        int[] inicial = {
            100, 75, 90, 110, 60,
            105, 70, 85, 120, 80,
            95, 65, 115, 70, 100,
            75, 110, 90, 80, 105
        };

        int[] finalCatraca = {
            135, 112, 124, 150, 88,
            140, 99, 120, 156, 115,
            130, 92, 152, 105, 136,
            109, 146, 125, 114, 140
        };

        int passageiros = 0;
        for (int i = 0; i < onibus.length; i++) {
            passageiros = passageiros + (finalCatraca[i] - inicial[i]);
        }
        int mediaPassViag = passageiros / onibus.length;
        System.out.println(mediaPassViag);
    }
}