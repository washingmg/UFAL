package br.ufal.aracomp.poo.associacao;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Pessoa> pessoas; 
    
    public Agenda() {
        this.pessoas = new ArrayList<>();
    }

    public void inserirPessoa(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    };

    public void removerPessoa(Pessoa pessoa) {
        this.pessoas.removeIf(p -> p.getEmail().equals(pessoa.getEmail()));
    }
    
    public void imprimirPessoas() {
        for (Pessoa pessoa : pessoas) {
            System.out.println("NOME: "+ pessoa.getNome() + " E-MAIL: " + pessoa.getEmail() + " TELFONE: " + pessoa.getTelefone());
        }
    }
}
