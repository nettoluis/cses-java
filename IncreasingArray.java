import java.util.Scanner;

public class Permutations {
    public static long aprumaSequencia(String[] numeros) {
        long total = 0;

        for (int i = 1; i < numeros.length; ++i) {
            long anterior = Long.parseLong(numeros[i - 1]), atual = Long.parseLong(numeros[i]);
            if (anterior > atual) {
                total += anterior - atual; 
                numeros[i] = numeros[i - 1];
            }
        }

        return total;
    }
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            long quantidade = Long.parseLong(leitor.nextLine());

            String[] numeros = leitor.nextLine().split(" ");
            long saida = aprumaSequencia(numeros);

            System.out.println(saida);
        }
    }
}
