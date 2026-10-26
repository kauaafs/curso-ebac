package Lição4;

import java.util.Scanner;

public class For {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");

        String nome = scanner.nextLine();

        System.out.println("Digite um numero:");

        int n1 = scanner.nextInt();

        System.out.println("Ordem Crescente");

        int i = 0;

        while (i < n1) {

            System.out.println(i);
            i++;

        }

        System.out.println("Ordem Decrescente");

        int contador = n1;

        while (contador > 0) {

            System.out.println(contador);
            contador--;

        }

        if (nome.length() > 6){
            for(int i3 = 0; i3 < n1; i3++)
            System.out.println(nome);
        }else{
            System.out.println(nome);
        }
    }
}
