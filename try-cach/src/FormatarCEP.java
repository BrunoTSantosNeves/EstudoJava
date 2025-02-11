public class FormatarCEP {


    /*
     * Exeção é um erro que ocorre durante a execução de um programa.
     * O tratamento de exceções é uma técnica utilizada para lidar com exceções e evitar que o programa seja interrompido.
     * O bloco try é o bloco de código que será executado e o bloco catch é o bloco de código que será executado caso ocorra uma exceção.
     * O bloco finally é um bloco opcional que será executado independente de ocorrer uma exceção ou não.
     * Deixando uma mensagem de erro mais amigável para o usuário.
     * Neste exemplo, a exceção CepInvalidoException é lançada caso o CEP não tenha 8 dígitos.  
     * O método formatarCEP() recebe um CEP como parâmetro e retorna o CEP formatado.
     * O método main() chama o método formatarCEP() e imprime o CEP formatado.
     * Caso o CEP não tenha 8 dígitos, a exceção CepInvalidoException é lançada e a mensagem de erro é impressa.
     */
    public static void main(String[] args) {
        String cep = "12345678"; // Exemplo de CEP
        try {
            String cepFormatado = formatarCEP(cep);
            System.out.println("CEP formatado: " + cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }

    static String formatarCEP(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException("O CEP deve conter 8 dígitos.");
        }
        return cep.substring(0, 5) + "-" + cep.substring(5, 8);
    }
}

class CepInvalidoException extends Exception {
    public CepInvalidoException(String errorMessage) {
        super(errorMessage);
    }
}
