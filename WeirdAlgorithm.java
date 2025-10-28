import java.util.Scanner;

public class WeirdAlgorithm {
    public static String montaSaida(long[] estados) {
        String saida = "";

        for (int i = 0; i < estados.length; ++i) {
            saida += i == 0? estados[i] : " " + estados[i];
            if (estados[i] == 1) {
                break;
            }
        }

        return saida;
    }
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            long entrada = leitor.nextInt();

            long[] estados = new long[1000000];
            estados[0] = entrada;

            int contador = 1;
            while (entrada != 1) {
                if (entrada % 2 == 0) {
                    entrada /= 2;
                } else {
                    entrada = (3 * entrada) + 1;
                }
                estados[contador] = entrada;
                ++contador;
            }

            String saida = montaSaida(estados);

            System.out.println(saida);
        }
    }
}
