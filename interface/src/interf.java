/**
 * Interface representando uma operação matemática.
 */
interface Operacao {
    /**
     * Executa uma operação com dois operandos.
     *
     * @param a o primeiro operando.
     * @param b o segundo operando.
     * @return o resultado da operação.
     */
    double executar(double a, double b);
}

/**
 * Implementação da interface Operacao para realizar a soma.
 */
class Soma implements Operacao {

    /**
     * Realiza a soma dos dois operandos.
     *
     * @param a o primeiro operando.
     * @param b o segundo operando.
     * @return a soma de a e b.
     */
    @Override
    public double executar(double a, double b) {
        return a + b;
    }
}

/**
 * Classe principal que demonstra o uso da interface Operacao com a implementação Soma.
 */
public class interf {

    /**
     * Método main que executa a demonstração.
     *
     * @param args argumentos da linha de comando.
     */
    public static void main(String[] args) {
        Operacao operacao = new Soma();
        double resultado = operacao.executar(5.0, 3.0);
        System.out.println("Resultado da soma: " + resultado);
    }
}
