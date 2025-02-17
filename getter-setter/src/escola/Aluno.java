package escola;

/*
 * Getter e Setter são métodos que permitem o acesso a atributos privados de uma classe.
 * Eles são usados para proteger os atributos de uma classe, tornando-os privados e permitindo
 * que o acesso a eles seja feito por métodos públicos.
 * 
 * Setter é um método que permite a atribuição de um valor a um atributo privado.
 * Getter é um método que permite a leitura de um valor de um atributo privado.
 */

public class Aluno {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
}