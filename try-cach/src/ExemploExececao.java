public class ExemploExececao {
   
   /*
    * Exeção é um erro que ocorre durante a execução de um programa.
    * O tratamento de exceções é uma técnica utilizada para lidar com exceções e evitar que o programa seja interrompido.
    * O bloco try é o bloco de código que será executado e o bloco catch é o bloco de código que será executado caso ocorra uma exceção.
    * O bloco finally é um bloco opcional que será executado independente de ocorrer uma exceção ou não.
    * Deixando uma mensagem de erro mais amigável para o usuário.
    */
   
   
   
    public static void main(String[] args) {
       Number valor;
       try {
           valor = Double.valueOf("a1.75");
           System.out.println(valor);

         } catch (NumberFormatException e) {
           System.out.println("Erro: " + e.getMessage());
         }
       
    }
}
