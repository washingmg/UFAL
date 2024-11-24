package br.ufal.aracomp.poo.padroes.strategy;

public class Rei extends Personagem {

	@SuppressWarnings("unused")
	private String qualquerOutroAttrDeRei;
	public Rei(String name, String qualquerOutroAttrDeRei) {
		super(name);
		this.qualquerOutroAttrDeRei = qualquerOutroAttrDeRei;
	}
	
	@Override
	public void lutar() {
		System.out.println("Rei recebe mensagem para lutar...");
		this.arma.usarArma();
	}

}
