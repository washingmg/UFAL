package pacote1;

public class Carteiro {
    private Carta carta;

    public Carteiro(Carta carta){
        this.carta = carta;
    }

    public void mostrar(){
        carta.mostrar();
    }
}

