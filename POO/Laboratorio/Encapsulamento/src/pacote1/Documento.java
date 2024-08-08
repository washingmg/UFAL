package pacote1;

public class Documento {
    String nome;
    protected String data; //Protected: torna o membro acessível às classes do mesmo pacote ou através de herança

    public Documento(String nome, String data) {
        this.nome = nome;
        this.data = data;
    }

    public Documento(String data) {
        this.nome = "Documento Qualquer";
        this.data = data;
    }
    
    public void mostrar(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Data: " + this.data);
    }
}
