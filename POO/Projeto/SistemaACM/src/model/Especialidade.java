package model;

public class Especialidade {
    private String nome;

    public Especialidade(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Especialidade: " + nome;
    }
}
