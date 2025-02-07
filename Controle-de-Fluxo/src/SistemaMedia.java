public class SistemaMedia {


    /*
     * Mostrando uma estrutura condicional switch case
     * Se a sigla for "A" imprime "Aprovado", se for "R" imprime "Recuperação", se for "P" imprime "Reprovado"
     */
    public static void main(String[] args)
    {
        String sigla = "P";

        switch (sigla)
        {
            case "A":
                System.out.println("Aprovado");
                break;
            case "R":
                System.out.println("Recuperação");
                break;
            case "P":
                System.out.println("Reprovado");
                break;
            default:
                System.out.println("Não identificado");
        }
    }
}
