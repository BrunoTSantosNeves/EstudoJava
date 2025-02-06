
/*
 * Realiza operações matemáticas envolvendo dois números inteiros.
 */

@Author Bruno Tonetti
@Version 1.0
@Since 06/02/2025




public class Calculadora {
    public static void main(String[] args) {
        // Declaração de variáveis
        int numero1 = 10;
        int numero2 = 5;
        int resultado;

        // Soma
        resultado = numero1 + numero2;
        System.out.println("Soma: " + resultado);

        // Subtração
        resultado = numero1 - numero2;
        System.out.println("Subtração: " + resultado);

        // Multiplicação
        resultado = numero1 * numero2;
        System.out.println("Multiplicação: " + resultado);

        // Divisão
        resultado = numero1 / numero2;
        System.out.println("Divisão: " + resultado);

        // Resto da divisão
        resultado = numero1 % numero2;
        System.out.println("Resto da divisão: " + resultado);
    }
}