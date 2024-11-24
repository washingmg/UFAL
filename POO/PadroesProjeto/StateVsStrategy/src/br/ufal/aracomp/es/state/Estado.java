package br.ufal.aracomp.es.state;

public abstract class Estado {
	private Inseto inseto;
	
	public Estado(Inseto inseto) {
		this.inseto = inseto;
	}
	
	protected Inseto getInseto() {
		return inseto;
	}
	
	protected abstract String meuEstado();

	protected abstract void movimentar(int metros);
}
