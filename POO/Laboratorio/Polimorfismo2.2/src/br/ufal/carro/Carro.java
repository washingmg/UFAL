package br.ufal.carro;

public class Carro {

    private String modelo;
    private String cor;
    private int velocidade;
    private Tanque tanque;
    private IMotor motor;

    public Carro(String modelo, String cor, IMotor motor, Tanque tanque) {
        this.modelo = modelo;
        this.cor = cor;
        this.motor = motor;
        this.velocidade = 0;
        this.tanque = tanque;
    }

    public void ligar() {
		if (!motor.isLigado()) {
            if (tanque.getQuantidadePresente() > 0) {
                motor.ligar();
                System.out.println("O carro " + modelo +  " de cor " + cor + " foi ligado.");
            } else System.out.println("Sem combustível para ligar!");
        } else System.out.println("Motor já ligado!");
    }

    public void desligar() {
        if (motor.isLigado()) {
            if (getVelocidade() > 0) {
                this.freiar();
            }
                motor.desligar();
                System.out.println("O carro " + modelo +  " de cor " + cor + " foi desligado.");
            } else System.out.println("Já desligado!");
        } 

    public void acelerar(int quantCombustivel) {
        int combustivelDisponivel = tanque.usarCombustivel(quantCombustivel);
        if (motor.isLigado()) {
            if (combustivelDisponivel > 0) {
                motor.acelerar(this, combustivelDisponivel);
                if (tanque.getQuantidadePresente() == 0) {
                    System.out.println("Faltou combustível :/.");
                    desligar(); 
                }
            } else {
                motor.desligar();
            }
        } else System.out.println("Motor desligado!");
        }

    public void freiar() {
        velocidade = 0;
        System.out.println("Carro freiado!");
    }

    protected void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void abastecer(int quantidade) {
        tanque.abastecer(quantidade);
    }
}
