package Herança.src.transportes;

public class Main {

    public static void main(String[] args) {
    
    Carro carro = new Carro("Uno", "Vermelho", "FIAT", 4);
    Trem trem = new Trem("Piuí", "Branco", "Piuí Inc.", 17);

    //Subclasse
    carro.acelerar();
    trem.acelerar();
    
    //Subclasse
    carro.desacelerar();
    trem.desacelerar();

    //Superclasse
    carro.registrar();
    trem.registrar();

    carro.herdar();
    trem.herdar();

    //Subclasse
    carro.mostrar();
    trem.mostrar();
    }
}
