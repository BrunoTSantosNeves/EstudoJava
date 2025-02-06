import java.util.Locale;
import java.util.Scanner;


public class AboutMe {

    //Recebendo parâmetros pelo terminal
    //Usando o Scanner para receber dados do usuário, o programa irá esperar até que o usuário digite algo e pressione a tecla Enter.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu Sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite sua Idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua Altura: ");
        double altura = scanner.nextDouble();


        System.out.println("Olá, meu nome é: " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos e  " + altura + " metros de altura.");


    }
    
}