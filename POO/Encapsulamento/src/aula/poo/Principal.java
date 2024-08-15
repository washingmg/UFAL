package Encapsulamento.src.aula.poo;

public class Principal {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        
        c1.setPlaca("1AE-4JA");
        c1.setModelo("GOL");
        c1.setMarca("VolksWagen");

        // c1.marca = "GM"; variável privada n é acessível sem o uso de métodos.
        c1.setMarca("G");
        c1.mostrar();
        
        Carro c2 = new Carro("AAA-111", "Voyage","Volkswagen");
        
        c2.mostrar();

    }
}
