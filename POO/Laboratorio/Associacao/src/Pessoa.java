public class Pessoa {

    public Pessoa(String nome, String telefone, String email, String senha) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    private String nome;
    private String telefone;
    private String email;
    private String senha;

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public boolean validarSenha(String senha) {
        boolean retorno = false;
        if (this.senha != null && this.senha.equals(senha)) {
            retorno = true;
        }
        return retorno;

    }

}
