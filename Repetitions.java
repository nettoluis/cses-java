import java.util.Scanner;

public class Repetitions  {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            String entrada = leitor.nextLine();

            char ultimaLetra = entrada.charAt(0);
            int qtd = 1, maiorSequencia = 1;
            for (int i = 1; i < entrada.length(); ++i) {
                char letra = entrada.charAt(i);
                if (letra == ultimaLetra) {
                    ++qtd;
                } else {
                    if (qtd > maiorSequencia) {
                        maiorSequencia = qtd;
                    }
                    ultimaLetra = letra;
                    qtd = 1;
                }
            }

            if (qtd > maiorSequencia) {
                maiorSequencia = qtd;
            }

            System.out.println(maiorSequencia);
        }
    }
}
