

public class ResultadoEscolarTernario {

    /*
     * Mostrando uma estrutura condicional ternária
     * O sintaxe é: condição ? valor_se_verdadeiro : valor_se_falso
     */
    public static void main(String[] args) {
        double nota = 6.0;
        String resultado = nota >= 7.0 ? "Aprovado" : nota >= 5.0 && nota < 7.0 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
