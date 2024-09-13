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
		if (!this.motor.isLigado()) {
            if (this.tanque.getQuantidadePresente() > 0) {
                this.motor.ligar();
                System.out.println("O carro " + this.getModelo()+  " de cor " + this.getCor() + " foi ligado.");
            } else System.out.println("Sem combustível para ligar!");
        } else System.out.println("Motor já ligado!");
    }

    public void desligar() {
        if (this.motor.isLigado()) {
            if (getVelocidade() > 0) {
                this.freiar();
            }
            this.motor.desligar();
                System.out.println("O carro " + this.getModelo()+  " de cor " + this.getCor() + " foi desligado.");
            } else System.out.println("Já desligado!");
        } 

    public void acelerar(int quantCombustivel) {
    int combustivelDisponivel = tanque.usarCombustivel(quantCombustivel);
    if (this.motor.isLigado()) {
        if (combustivelDisponivel > 0) {
            this.motor.acelerar(this, combustivelDisponivel);
            if (this.tanque.getQuantidadePresente() == 0) {
                System.out.println("Faltou combustível :/.");
                this.desligar(); 
                }
            } else {
                this.motor.desligar();
            }
        }
    }
    
    public void freiar() {
        this.velocidade = 0;
        System.out.println("Carro freiado!");
    }
    
    protected void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    public int getVelocidade() {
        return velocidade;
    }
    
    public void abastecer(int quantidade) {
        this.tanque.abastecer(quantidade);
    }
    
    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }
}
