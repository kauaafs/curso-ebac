import java.util.Arrays;
import java.util.Scanner;

public class vetores1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Preencher o vetor de números
        System.out.print("Quantos números deseja inserir no vetor? ");
        int n = scanner.nextInt();
        int[] numeros = new int[n];

        System.out.println("Digite os " + n + " números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

        // 2. Ordenar o vetor usando Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }

        System.out.println("Valor ordenado: " + Arrays.toString(numeros));

        // 3. Receber um nome e contar as vogais
        System.out.print("Digite um nome: ");
        String nome = scanner.next().toLowerCase();

        char[] letras = nome.toCharArray();
        int contadorVogais = 0;

        for (char letra : letras) {
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadorVogais++;
            }
        }

        System.out.println("O nome \"" + nome + "\" possui " + contadorVogais + " vogais.");
        scanner.close();
    }
}