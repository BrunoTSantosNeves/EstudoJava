import java.util.Random;

/*
 * A estrutura de repetição do-while é semelhante ao while, mas a diferença é que a condição é verificada após a execução do bloco de código.
 * Isso significa que o bloco de código será executado pelo menos uma vez, mesmo que a condição seja falsa.
 */

public class Dowhile {
    public static void main(String[] args) {
        do {
            System.out.println("Ligando para o cliente...");
        } while (tocando());
            System.out.println("Cliente atendeu!");
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu: " + atendeu);
        return !atendeu;
    }
}

