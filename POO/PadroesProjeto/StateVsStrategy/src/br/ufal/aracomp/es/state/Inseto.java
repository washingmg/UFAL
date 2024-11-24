package br.ufal.aracomp.es.state;

public class Inseto {
	private String nome;
	private int forca;
	private int distanciaPercorrida;
	private Estado estado;
	
	
	public Inseto(String nome, int forca) {
		this.nome = nome;
		this.forca = forca;
		this.distanciaPercorrida = 0;
		this.estado = new Lagarta(this);
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getForca() {
		return forca;
	}
	
	public int getDistanciaPercorrida() {
		return distanciaPercorrida;
	}
	
	public void incrementarDistancia(int metros) {
		this.distanciaPercorrida += metros;
	}
	
	public void mostrarDetalhes() {
		System.out.println("Meu nome é "+this.nome+" e tenho força "+this.forca+"! "+this.estado.meuEstado()+" Ao todo, já andei "+this.distanciaPercorrida+" metros em minha vida toda!");
	}
	
	
	
	public void proximoEstado() {
		if(this.estado instanceof Lagarta) {
			this.estado = new Larva(this);
			System.err.println("Era uma lagarta, agora sou uma larva!");
		}
		else if(this.estado instanceof Larva) {
			this.estado = new Borboleta(this);
			System.err.println("Era uma larva, agora sou uma borboleta!");
		}
		else if(this.estado instanceof Borboleta) {
			System.err.println("Não há mais mudanças para mim... já sou uma borboleta!");
		}
	}
	
	//OPERACOES DEPENDENTES DE ESTADO
	public void movimentar(int metros) {
		this.estado.movimentar(metros);
	}
}
