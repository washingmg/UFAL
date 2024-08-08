package pacote2;

import pacote1.Carta;

public class Inicial {
    public static void main(String[] args) {
        Carta carta = new Carta("Manoel", "01-02-2024", "APP.java");
        carta.mostrar();

        // Problema: Não é possível acessar diretamente atributos protegidos ou com visibilidade de pacote de outra classe de um pacote diferente.
        // Resposta: Acessar através de métodos públicos disponíveis na classe ou suas subclasses.

        // Problema: Atributo 'data' protegido não é diretamente acessível fora da classe Documento ou seus subclasses.
        // Resposta: Acessar através de métodos públicos ou imprimir usando mostrar()
        
        // Problema: Como inicializar os atributos “herdados” sem mudar a visibilidade dos atributos?
        // Resposta: Palavra reservada super (superclasse) é usada  para acessar os atributos da classe pai.
    }
}
