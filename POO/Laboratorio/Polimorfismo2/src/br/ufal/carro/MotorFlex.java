package br.ufal.carro;

public class MotorFlex implements IMotor {
    private boolean ligado;
    private int aceleracao;

    @Override
    public void ligar() {
        ligado = true;
    }

    @Override
    public void desligar() {
        ligado = false;
    }

    @Override
    public boolean isLigado() {
        return ligado;
    }

    @Override
    public void acelerar(Carro c, int quantCombustivel) {
        aceleracao = quantCombustivel * 500;
        int novaVelocidade = aceleracao / 50;
        c.setVelocidade(novaVelocidade);
        System.out.println("Carro com Motor Flex acelerando!");
		System.out.println("Velocidade: " + c.getVelocidade() + " km/h");
    }
}
