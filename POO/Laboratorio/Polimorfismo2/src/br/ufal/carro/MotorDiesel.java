package br.ufal.carro;

public class MotorDiesel implements IMotor {
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
        aceleracao = quantCombustivel * 750;
        int velocidade = Math.round(aceleracao / 110.0f);
        c.setVelocidade(velocidade);
        System.out.println("Carro com Motor Diesel acelerando!");
		System.out.println("Velocidade: " + c.getVelocidade() + " km/h");
    }
}
