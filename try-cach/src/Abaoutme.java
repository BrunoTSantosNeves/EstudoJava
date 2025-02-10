import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class Abaoutme {
    public static void main(String[] args) throws Exception {
        
        /*
         * Try-catch é uma estrutura de controle que permite que o programa execute um bloco de código e, caso ocorra uma exceção, o programa não seja interrompido.
         * O bloco try é o bloco de código que será executado e o bloco catch é o bloco de código que será executado caso ocorra uma exceção.
         * O bloco finally é um bloco opcional que será executado independente de ocorrer uma exceção ou não.
         * Deixando uma mensagem de erro mais amigável para o usuário.
         */

        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your height: ");
        double height = scanner.nextDouble();

        System.out.println("Enter your weight: ");
        double weight = scanner.nextDouble();

        System.out.println("Enter your marital status: ");
        boolean isMarried = scanner.nextBoolean();

        System.out.println("Welcome " + name + "!");
        System.out.println("Your age is " + age + " years old.");
        System.out.println("Your height is " + height + " cm.");
        System.out.println("Your weight is " + weight + " kg.");
        System.out.println("Your marital status is " + isMarried + ".");

        scanner.close();
             }

        catch (InputMismatchException e) 
        {
            System.out.println("Os campos de idade, altura e peso devem ser preenchidos com números.");
        }
        
        
    }
}
