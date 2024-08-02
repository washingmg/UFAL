package pacote2;

import pacote1.Carta;
import pacote1.Documento;

public class Telegrama extends Documento{
    private String assinatura;

    public Telegrama(String nome, String data, String assinatura){
        super(nome, data);
        this.assinatura = assinatura;
    }

    public void mostrar(){
        super.mostrar();
        System.out.println(assinatura);
    }

    public void mostrar2(){
        Carta carta = new Carta("Washington","01-08-2024","Anexo1");
        Telegrama telegrama = new Telegrama("Washingon", "11-03-2024", "washingmg");

        System.out.println(carta.getData()); //tive que cirar os métodos Getters de carta e telegrama, pois n consgui acessá-los
        System.out.println(telegrama.getData());
    }

    public String getData(){
        return this.data;
    }
}

