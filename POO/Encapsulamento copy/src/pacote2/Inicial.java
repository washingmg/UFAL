package pacote2;

import pacote1.Carta;

public class Inicial {
    public static void main(String[] args) {
        Carta carta = new Carta("Manoel", "01-02-2024", "Anexo2");

        System.out.println(carta.getNome());
        System.out.println(carta.getData());
        System.out.println(carta.getAnexo());
        
        
    }
}

// Como inicializar os atributos “herdados” sem mudar a visibilidade dos atributos?
// RESPOSTA: palavra reservada super é usada para acessar atributos e métodos

// O que aconteceu? Como você poderia corrigir o problema? Justifique através de um comentário no código.
// RESPOSTA: Tive que cirar os métodos Getters de carta e telegrama, pois não consegui acessar os valores dos atributos.

// objeto. O que aconteceu? Como você poderia corrigir o problema?
// RESPOSTA: Não consegui acessar os valores dos atributos de carta, então foi necessário criar métodos Getters
