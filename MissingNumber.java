import java.util.Scanner;

public class MissingNumber {
    public static long soma(String[] sequencia) {
        long total = 0;
        for (String elemento : sequencia) {
            total += Integer.parseInt(elemento);
        }

        return total;
    }
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            long qtd = Integer.parseInt(leitor.nextLine());

            String[] numeros = leitor.nextLine().split(" ");
            long encontrado = soma(numeros);
            long total = ((1 + qtd) * qtd) / 2;

            System.out.println(total - encontrado);
        }
    }
}
