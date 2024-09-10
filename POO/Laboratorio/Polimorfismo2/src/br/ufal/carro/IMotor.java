package br.ufal.carro;

public interface IMotor {
    void ligar();
    void desligar();
    boolean isLigado();
    void acelerar(Carro c, int quantCombustivel);
}
