
/*
 * Um construtor é um método especial que é chamado quando um objeto é instanciado.
 * Ele é usado para inicializar objetos.
 * O construtor não tem um tipo de retorno.
 * O nome do construtor deve ser o mesmo que o nome da classe.
 * Um construtor é chamado quando um objeto é criado.
 * Todos os objetos têm um construtor.
 * Se você não criar um construtor, o Java criará um construtor padrão para o objeto.
 * Você pode criar um construtor para inicializar objetos.
 * Você pode usar construtores para definir valores iniciais para atributos.
 * Você pode ter vários construtores em uma classe.
 * Você pode sobrecarregar construtores - a classe tem vários construtores que têm o mesmo nome, mas têm parâmetros diferentes.
 * Você pode chamar um construtor de outro construtor com a palavra-chave this.
 * Você pode chamar um construtor de outra classe com a palavra-chave super.
 * Você não pode retornar um valor de um construtor (porque o construtor não tem um tipo de retorno).
 * 
 * Fonte: https://www.w3schools.com/java/java_constructors.asp
 * 
 * O this é uma referência a um objeto atual - a palavra-chave this é usada para se referir a objetos atuais.
 * O this pode ser usado para acessar atributos da classe atual.
 * O this pode ser usado para chamar um construtor da classe atual.
 * Você pode usar this para passar uma referência de objeto como um argumento em um método ou construtor.
 * O this pode ser usado para retornar a instância atual de uma classe.
 * 
 */


public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

   public Pessoa(String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco(String endereco) {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
