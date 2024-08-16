package Encapsulamento.src.aula2.poo.pacote1;

public class Motorista {
    private String nome;
    private Carro carro;

    public Motorista(String nome) {
        this.nome = nome;
        this.carro = null;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Carro getCarro() {
        return carro;
    }

    public String getNome() {
        return nome;
    }
}
