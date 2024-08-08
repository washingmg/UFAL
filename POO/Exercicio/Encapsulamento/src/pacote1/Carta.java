package pacote1;

public class Carta extends Documento{ //Extends: adquire ou herda todas as propriedades(métodos e atributos) da classe pai
    String anexo;

    public Carta(String nome, String data, String anexo) {
        super(nome, data); //Palavra reservada super para acessar os atributos da classe pai.
        this.anexo = anexo;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Anexo: " + anexo);
    }

    // public String getData(){
    //     return this.data;
    // }
}
