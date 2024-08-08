package pacote2;

import pacote1.Carta; 
import pacote1.Documento;
//Utilizar classes e interfaces que estão localizadas em outros pacotes dentro do seu código sem precisar referenciá-las com seus caminhos completos. 

public class Telegrama extends Documento{
    private String assinatura;

    public Telegrama(String nome, String data, String assinatura) {
        super(nome, data);
        this.assinatura = assinatura;
    }
    
    public void mostrar() {
        super.mostrar();
        System.out.println("Assinatura: " + assinatura);
    }

    public void mostrar2() {
        Carta carta = new Carta("Juca","03-05-2024", "Index.html");
        Telegrama telegrama = new Telegrama("Bob","01-02-2024", "bob.ok");
        
        // System.out.println("Data da Carta: " + carta.getData());
        // System.out.println("Data do Telegrama: " + telegrama.data);

        carta.mostrar();
        telegrama.mostrar();

        // Problema: Atributo 'data' protegido não é diretamente acessível fora da classe Documento ou seus subclasses.
        // Resposta: Acessar através de métodos públicos ou imprimir usando mostrar()
    }
}
