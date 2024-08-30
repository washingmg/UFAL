package br.ufal.aracomp.poo.associacao;

public class Pessoa {
    private String nome;
    private String telefone;
    private String email;
    private String senha;

    public Pessoa(String nome, String telefone, String email, String senha) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public boolean validarSenha(String senha) {
        boolean verificar = false;
        if (this.senha != null && this.senha.equals(senha)) {
            verificar = true;
        }
        return verificar;
    }

    @Override
    public String toString() {
        return this.nome + " - " + this.telefone + " - " + this.email;
    }

    @Override
    public boolean equals(Object obj) {
        boolean iguais = false;
        
        if (obj instanceof Pessoa) {
            if (((Pessoa)obj).getEmail().equals(this.email)) {
                iguais =  true;
            }
        }
        return iguais;
    }
}
