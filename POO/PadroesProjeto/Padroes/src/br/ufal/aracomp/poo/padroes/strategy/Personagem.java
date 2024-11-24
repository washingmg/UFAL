package br.ufal.aracomp.poo.padroes.strategy;

public abstract class Personagem {
	
	@SuppressWarnings("unused")
	private String name;
	protected ArmarIF arma;
	
	public Personagem(String name) {
		this.name = name;
	}
	
	public void setArma(ArmarIF arma) {
		this.arma = arma;
	}
	
	public abstract void lutar();
	
}
