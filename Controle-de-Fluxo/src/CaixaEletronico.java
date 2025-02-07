public class CaixaEletronico {


    /*
     * Mostrando uma estrutura condicional composta
     */

    public static void main(String[] args) {
        int saldo = 1000;
        int valorSolicitado = 2000;

        if (valorSolicitado <= saldo) 
        {
            saldo = saldo - valorSolicitado;
            System.out.println("Saque efetuado com sucesso!");
            System.out.println("Saldo atual: " + saldo);
        } 
        
        else 
        {
            System.out.println("Saldo insuficiente!");
        }
    }
    
}
