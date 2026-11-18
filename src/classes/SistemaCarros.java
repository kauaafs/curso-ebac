package classes;

import java.util.Scanner;

public class SistemaCarros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Carro[] carros = new Carro[50];

        int quantidadeParaCadastrar = 0;

        while (true) {
            System.out.print("Quantos carros você deseja cadastrar? (Máximo 50): ");
            quantidadeParaCadastrar = scanner.nextInt();
            scanner.nextLine();

            if (quantidadeParaCadastrar > 0 && quantidadeParaCadastrar <= 50) {
                break;
            } else {
                System.out.println("❌ Valor inválido! Digite um número entre 1 e 50.");
            }
        }

        for (int i = 0; i < quantidadeParaCadastrar; i++) {
            System.out.println("\n--- Cadastro do " + (i + 1) + "º Carro ---");

            System.out.print("Digite o nome/modelo do carro: ");
            String nome = scanner.nextLine();

            System.out.print("Digite o preço do carro (R$): ");
            double preco = scanner.nextDouble();
            scanner.nextLine();

            carros[i] = new Carro(nome, preco);
        }

        System.out.println("\n========================================");
        System.out.println("      RESUMO DOS CARROS CADASTRADOS     ");
        System.out.println("========================================");

        double somaPrecos = 0.0;

        for (int i = 0; i < quantidadeParaCadastrar; i++) {
            System.out.println("- Carro " + (i + 1) + ": " + carros[i].getNome() + " | R$ " + carros[i].getPreco());
            somaPrecos += carros[i].getPreco();
        }

        System.out.println("----------------------------------------");
        System.out.println("Quantidade total de carros criados: " + quantidadeParaCadastrar);
        System.out.println("Soma total dos preços: R$ " + somaPrecos);
        System.out.println("========================================");

        scanner.close();
    }
}