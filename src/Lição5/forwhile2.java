package Lição5;

import java.util.Scanner;

public class forwhile2 {

    public static void main(String[] args) {

        System.out.println("TABUADA" + "\n");

        tabuada();

        Scanner sc = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("\n" + "-----Menu da Tabuada-----");
            System.out.println("1 - Continuar");
            System.out.println("2 - Sair");
            System.out.println("Escolha uma Opção:" + "\n");

            opcao = sc.nextInt();

            if (opcao == 1){
                tabuada();
            } else if (opcao == 2){
                break;
            }else{
                System.out.println("Opção Invalida");
            }
        }while (opcao !=  2);

        System.out.println("Obrigado por utilizar o nosso sistema, espero que tenha gostado.");

    }
    public static void tabuada () {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int n1 = sc.nextInt();

        int n2 = 1;

        System.out.println("\n" + "Tabuada do: " + n1 + "\n");

        while (n2 <= 10) {
             int resultado = n1 * n2;
            System.out.println(n1 + " x " + n2 + " = " + resultado);
            n2++;

        }
    }
}
