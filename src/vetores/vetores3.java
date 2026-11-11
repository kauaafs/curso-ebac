import java.util.Scanner;

public class vetores3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um nome para inverter: ");
        String nome = scanner.nextLine();

        // Converter a string num vetor de caracteres
        char[] caracteres = nome.toCharArray();

        // Variável auxiliar para a troca (como pedido no enunciado)
        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim) {
            char aux = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = aux;

            inicio++;
            fim--;
        }

        // Converter o vetor de caracteres de volta para String
        String nomeInvertido = new String(caracteres);

        System.out.println("Nome invertido: " + nomeInvertido);
        scanner.close();
    }
}