package br.ufal.aracomp.es.state;

public class Borboleta extends Estado{

	public Borboleta(Inseto inseto) {
		super(inseto);
	}
	
	@Override
	protected String meuEstado() {
		return "Sou uma Borboleta!";
	}
	
	@Override
	protected void movimentar(int metros) {
		this.getInseto().incrementarDistancia(metros);
		System.out.println("Voando "+metros+" metros... demorei " + ((metros - this.getInseto().getForca()) / 2) + " minutos!");
	}
}
