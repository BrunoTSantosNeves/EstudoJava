public class operadores {
    public static void main(String[] args) throws Exception {
        int a = 10;
        int b = 3;

        // Operadores aritméticos

        int soma = a + b;          // 13
        int subtracao = a - b;     // 7
        int multiplicacao = a * b; // 30
        int divisao = a / b;       // 3 (divisão inteira)
        int modulo = a % b;        // 1 (resto da divisão)

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Módulo: " + modulo);

        int x = 5;
        int y = 10;

        // Operadores de comparação

        boolean igual = (x == y);         // false
        boolean diferente = (x != y);       // true
        boolean maiorQue = (x > y);         // false
        boolean menorQue = (x < y);         // true
        boolean maiorOuIgual = (x >= y);    // false
        boolean menorOuIgual = (x <= y);    // true

        System.out.println("x == y: " + igual);
        System.out.println("x != y: " + diferente);
        System.out.println("x > y: " + maiorQue);
        System.out.println("x < y: " + menorQue);
        System.out.println("x >= y: " + maiorOuIgual);
        System.out.println("x <= y: " + menorOuIgual);

        // Operadores lógicos

        boolean condicao1 = true;
        boolean condicao2 = false;

        // Operador E
        boolean resultadoAnd = condicao1 && condicao2;  // false, pois uma das condições é falsa

        // Operador OU
        boolean resultadoOr = condicao1 || condicao2;   // true, pois uma das condições é verdadeira

        // Operador de Negação
        boolean resultadoNot = !condicao1;              // false, pois inverte true para false

        System.out.println("condicao1 && condicao2: " + resultadoAnd);
        System.out.println("condicao1 || condicao2: " + resultadoOr);
        System.out.println("!condicao1: " + resultadoNot);

        // Operador de Atribuição

        int numero = 10;  // Atribuição simples
        numero += 5;      // Equivalente a numero = numero + 5; (agora é 15)
        numero -= 3;      // Equivalente a numero = numero - 3; (agora é 12)
        numero *= 2;      // Equivalente a numero = numero * 2; (agora é 24)
        numero /= 4;      // Equivalente a numero = numero / 4; (agora é 6)
        numero %= 4;      // Equivalente a numero = numero % 4; (agora é 2)

        System.out.println("Valor final de numero: " + numero);

        // Operador Ternário

        // variável = (condição) ? valorSeVerdadeiro : valorSeFalso;

        int idade = 20;
        String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        
        System.out.println(resultado); // Imprime "Maior de idade"

    }
}
