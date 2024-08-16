package Encapsulamento.src.aula2.poo.pacote2;

import Encapsulamento.src.aula2.poo.pacote1.Carro;

public class CarroEletrico extends Carro {
    private int quantidadeEnergia;

    public CarroEletrico(String placa, String modelo, String marca) {
        super(placa, modelo, marca);
        this.quantidadeEnergia = 0;
    }

    public void carregar(int quantidade) {
        this.quantidadeEnergia += quantidade;
    }

    public int getQuantidadeEnergia() {
        return this.quantidadeEnergia;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Quantidade de Energia: " + quantidadeEnergia);
    }
}
