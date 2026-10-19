import java.util.Scanner;

public class index {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Coloque seu nome completo aqui: ");
        String nome = scanner.nextLine();

        System.out.println("Coloque seu CPF aqui: ");
        String cpf = scanner.nextLine();

        System.out.println("Coloque sua Idade aqui: ");
        int idade = scanner.nextInt();

        System.out.println("Coloque seu Peso aqui: ");
        double peso = scanner.nextDouble();

        System.out.println("Coloque sua Altura aqui: ");
        double altura = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Coloque seu Estado civil aqui: ");
        String estadocivil = scanner.nextLine();


        scanner.close();

        System.out.println("Seu nome é " + nome + ", seu CPF é " + cpf + ", voce tem " + idade + " anos, seu peso é " + peso + ", sua altura é " + altura + ", e atualmente você esta " + estadocivil );

    }

}
