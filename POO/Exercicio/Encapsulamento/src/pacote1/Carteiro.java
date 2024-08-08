package pacote1;

public class Carteiro {
    private Carta carta; //A instância da classe Carta dentro da classe Carteiro permite ao Carteiro manipular e exibir o conteúdo da carta específica que ele possui.

    public Carteiro(Carta carta){
        this.carta = carta;
    }
    
    public void mostrar(){
        carta.mostrar();
    }
}
