package pacote1;

public class Carta extends Documento{
    String anexo;
    
    public Carta(String nome, String data, String anexo) {
        super(nome, data); //palavra reservada super é usada para acessar atributos e métodos de Doumentos
        this.anexo = anexo;
    }

    public void mostrar(){
        System.out.println(anexo);
    }

    public String getData(){
        return this.data;
    }

    public String getAnexo() {
        return this.anexo;
    }

    public String getNome(){
        return this.nome;
    }
}
