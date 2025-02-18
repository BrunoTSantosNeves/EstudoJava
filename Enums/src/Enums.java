/*
 * Enumeradores ou Enums são uma forma de criar um tipo de dado que pode ter um número finito de valores.
 * Os Enums são usados para representar um conjunto de constantes.
 * Eles são usados como se fossem classes, mas não podem ser instanciados.
 * São parecidos com arrays, mas são mais seguros e mais fáceis de usar.
 */

public class Enums {
    public enum EstadoCivil {
        SOLTEIRO ("Solteiro", "S"),
        CASADO ("Casado", "C"),
        DIVORCIADO ("Divorciado", "D"),
        VIUVO ("Viúvo", "V");

        private final String nome;
        private final String sigla;

        private EstadoCivil(String nome, String sigla) {
            this.nome = nome;
            this.sigla = sigla;
        }

        public String getNome() {
            return nome;
        }

        public String getSigla() {
            return sigla;
        }
    }
}
