package POO.Introducao;

public class Pessoa {
    public String nome;
    int idade;
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    Pessoa(int idade){
    	this.idade = idade;
    	this.nome = "Não informado";
    }
    
    void falar(String frase){
        System.out.println(frase + " Eu sou "+ this.nome);
    }
    
    public static void main(String[] args){
        System.out.println("Iniciando o programa...");
        
        Pessoa p1 = new Pessoa("Alberto", 63);
        p1.falar("Olá!");
        Pessoa p2 = new Pessoa("Ferdinanda", 30);
        p2.falar("Fala!");
        
        Pessoa p3 = new Pessoa(29);
        p3.falar("Oi!");
        
        p1 = p2;
        p1.falar("Alguma coisa!");
        
        String endereco = new String("Meu endereco");
        System.out.println(endereco.length());
    
    }
}