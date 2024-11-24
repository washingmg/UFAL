package br.ufal.aracomp.poo.padroes.strategy;

public class Rainha extends Personagem {

	@SuppressWarnings("unused")
	private String qualquerOutroAttrDeRainha;
	
	public Rainha(String name, String qualquerOutroAttrDeRainha) {
		super(name);
		this.qualquerOutroAttrDeRainha = qualquerOutroAttrDeRainha;
	}
	
	@Override
	public void lutar() {
		System.out.println("Rainha recebe mensagem para lutar...");
		this.arma.usarArma();
	}

}
