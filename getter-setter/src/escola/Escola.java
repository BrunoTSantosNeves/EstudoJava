package escola;

/*
 * Getter e Setter são métodos que permitem o acesso a atributos privados de uma classe.
 * Eles são usados para proteger os atributos de uma classe, tornando-os privados e permitindo
 * que o acesso a eles seja feito por métodos públicos.
 */

public class Escola {
    public static void main(String[] args) {
        Aluno João = new Aluno();
        João.setNome("João");
        João.setIdade(15);

        System.out.println("Nome: " + João.getNome());
        System.out.println("Idade: " + João.getIdade());

    }
}
