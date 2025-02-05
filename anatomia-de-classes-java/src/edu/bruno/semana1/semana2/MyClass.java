package edu.bruno.semana1.semana2;
public class MyClass 
{
    public static void main(String [] args) 
    {
        String FirstName = "Bruno";
        String SecondName = "Tonetti";

        String FullName = FullName(FirstName, SecondName);
        System.out.println(FullName);
    }

    public static String FullName(String FirstName, String SecondName)
    {
        return "Resultado do método " + FirstName.concat(" ").concat(SecondName);
    }
}