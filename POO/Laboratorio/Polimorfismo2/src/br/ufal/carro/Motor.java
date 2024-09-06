package br.ufal.carro;

public abstract class Motor {

	private boolean ligado;
	private int aceleracao;


	public Motor() {

	}

	public void ligar() {

	}

	public void desligar() {

	}

	public boolean isLigado() {
		return false;
	}
	
	protected void setAceleracao(int aceleracao) {
		
	}

	public abstract void acelerar(Carro c, int quantCombustivel);

}
