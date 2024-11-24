package br.ufal.aracomp.es.state;

public class Larva extends Estado{

	public Larva(Inseto inseto) {
		super(inseto);
	}
	
	
	@Override
	protected String meuEstado() {
		return "Sou uma Larva!";
	}
	
	@Override
	protected void movimentar(int metros) {
		System.out.println("Não consigo me movimentar! Sou só uma larva!");
	}
}
