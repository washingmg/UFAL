package Encapsulamento.src.aula2.poo.pacote2;

// import Encapsulamento.src.aula2.poo.pacote1.Carro;
import Encapsulamento.src.aula2.poo.pacote1.Motorista;

public class Principal {
    public static void main(String[] args) {
        CarroEletrico c1 = new CarroEletrico("ABC-1234", "Uno", "FIAT");
        CarroCombustao c2 = new CarroCombustao("AAA-1111", "Gol", "VW");

        c1.mostrar();
        System.out.println(c1);

        c2.mostrar();
        System.out.println(c2);

        Motorista joao = new Motorista("Joao");
        Motorista maria = new Motorista("Maria");

        c1.setMotorista(joao);
        joao.setCarro(c1);
        
        c2.setMotorista(maria);
        maria.setCarro(c2);

        c1.mostrar();
        c2.mostrar();
    }
}
