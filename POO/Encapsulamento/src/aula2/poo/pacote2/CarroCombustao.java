package Encapsulamento.src.aula2.poo.pacote2;

import Encapsulamento.src.aula2.poo.pacote1.Carro;

public class CarroCombustao extends Carro {
    private int quantidadeCombustivel;

    public CarroCombustao(String placa, String modelo, String marca) {
        super(placa, modelo, marca);
        this.quantidadeCombustivel = 0;
    }

    public void abastecer(int quantidade) {
        this.quantidadeCombustivel += quantidade;
    }

    public int getQuantidadeCombustivel() {
        return this.quantidadeCombustivel;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Quantidade de Combustível: " + quantidadeCombustivel);
    }
}
