package br.ufal.aracomp.poo.padroes.strategy;

public class Main {

	public static void main(String[] args) {
		Personagem rainha = new Rainha("Elizabeth", "imortal!");
		Personagem rei = new Rei("KingName", "unknownAttr");
		Personagem cavaleiro = new Cavaleiro("MenInHorseName", "unknownAttrForHim");
		
		rainha.setArma(new Arco());
		rainha.lutar();
		rainha.setArma(new Machado());
		rainha.lutar();
		
		rei.setArma(new Faca());
		rei.lutar();
		
		cavaleiro.setArma(new Espada());
		cavaleiro.lutar();
		
	}
	
}
