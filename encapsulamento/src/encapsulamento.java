public class encapsulamento {

    public void RecebeMensagem(){
        System.out.println("Mensagem recebida");
    }

    public static void main(String[] args) {
        // Criação de um objeto da classe Pessoa
        Pessoa pessoa = new Pessoa();
        
        // Utilização dos métodos set para definir os valores dos atributos privados
        pessoa.setNome("João");
        pessoa.setIdade(30);
        
        // Utilização dos métodos get para acessar os valores dos atributos privados
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}

class Pessoa {
    // Atributos privados, não acessíveis diretamente fora da classe
    private String nome;
    private int idade;

    // Método público para acessar o valor do atributo nome
    public String getNome() {
        return nome;
    }

    // Método público para modificar o valor do atributo nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método público para acessar o valor do atributo idade
    public int getIdade() {
        return idade;
    }

    // Método público para modificar o valor do atributo idade
    public void setIdade(int idade) {
        this.idade = idade;
    }
}

/*
 * Encapsulamento é um dos princípios fundamentais da programação orientada a objetos.
 * Ele consiste em esconder os detalhes internos de uma classe e expor apenas o que é necessário
 * através de métodos públicos. Isso ajuda a proteger os dados e a garantir que eles sejam manipulados
 * de maneira controlada.
 *
 * No exemplo acima, a classe Pessoa possui dois atributos privados: nome e idade. Esses atributos
 * não podem ser acessados diretamente fora da classe. Em vez disso, métodos públicos (getters e setters)
 * são fornecidos para acessar e modificar esses atributos. Isso permite adicionar validações ou lógica
 * adicional nos métodos setters, se necessário, garantindo que os dados sejam sempre válidos.
 */

