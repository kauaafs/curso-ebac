package Lição3;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois numero para comparação:");

        int n1 = scanner.nextInt();

        int n2 = scanner.nextInt();

        if (n1 > n2) {

            System.out.println("O maior numero e o " + (n1));

        } else if (n1 < n2) {

            System.out.println("O maior numero e o " + (n2));

        } else if (n1 == n2) {

            System.out.println("Os dois numeros são iguais");

        } else {
            System.out.println("Erro Tente novamente");
        }
    }
}
