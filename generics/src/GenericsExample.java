import java.util.ArrayList;


public class GenericsExample {
    public static void main(String[] args) {
        // Criando uma lista genérica para Strings
        ArrayList<String> lista = new ArrayList<>();

        // Adicionando elementos
        lista.add("Olá");
        lista.add("Mundo");

        // Acessando elementos
        for (String item : lista) {
            System.out.println(item);
        }
    }
}