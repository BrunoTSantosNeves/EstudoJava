package edu.bruno.semana1;
public class BoletimEstudantil {

    /* 
     *    O código abaixo é um exemplo de um boletim estudantil, onde é verificado se o aluno foi aprovado, reprovado ou se irá para a prova de recuperação.
     */

    public static void main(String[] args)
    {
        int mediaFinal = 7;
        if (mediaFinal < 6)
            System.out.println("Reprovado");
        else if (mediaFinal == 6) 
        {
            System.out.println("Prova de Recuperacão");
        }
        else
            System.out.println("Aprovado");
    }
}