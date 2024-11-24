package br.ufal.aracomp.es.state;

public class Lagarta extends Estado{

	public Lagarta(Inseto inseto) {
		super(inseto);
	}
	
	@Override
	protected String meuEstado() {
		return "Sou uma Lagarta!";
	}

	@Override
	protected void movimentar(int metros) {
		this.getInseto().incrementarDistancia(metros);
		System.out.println("Rastejando "+metros+" metros... demorei " + (metros - this.getInseto().getForca()) * 10 + " minutos!");
	}
}
