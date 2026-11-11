import java.util.Arrays;
import java.util.Scanner;

public class vetores2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números terá o vetor? ");
        int n = scanner.nextInt();
        double[] numeros = new double[n];

        System.out.println("Digite os " + n + " números inteiros:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextDouble();
        }

        // Percorrer e aplicar a regra de paridade
        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                numeros[i] = numeros[i] * 2; // Par: multiplica por 2
            } else {
                numeros[i] = Math.pow(numeros[i], 2); // Ímpar: eleva ao quadrado
            }
        }

        System.out.println("Novo vetor após a regra de paridade: " + Arrays.toString(numeros));
        scanner.close();
    }
}