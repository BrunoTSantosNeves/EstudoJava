public class breakCintinue {


    /*
     * O break é uma instrução que interrompe a execução de um laço de repetição.
     * O continue é uma instrução que interrompe a execução da iteração atual de um
     * laço de repetição e passa para a próxima iteração.
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Valor de i: " + i);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("Valor de i: " + i);
        }
    }
}
