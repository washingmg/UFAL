package br.ufal.aracomp.poo.padroes.strategy;

public class Cavaleiro extends Personagem {

	@SuppressWarnings("unused")
	private String qualquerOutroAttrDeCavaleiro;
	public Cavaleiro(String name, String qualquerOutroAttrDeCavaleiro) {
		super(name);
		this.qualquerOutroAttrDeCavaleiro = qualquerOutroAttrDeCavaleiro;
	}

	@Override
	public void lutar() {
		System.out.println("Cavaleiro recebe mensagem para lutar...");
		this.arma.usarArma();
	}
	
}
