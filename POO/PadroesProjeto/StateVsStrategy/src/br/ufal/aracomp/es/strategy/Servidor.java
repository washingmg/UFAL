package br.ufal.aracomp.es.strategy;

public class Servidor {
	private String nome;
	private ModoExecucao modoExecucao;
	
	
	public Servidor(String nome) {
		this.nome = nome;
		this.modoExecucao = new Economia();
	}
	
	public String getNome() {
		return nome;
	}
	
	
	public void setModoExecucao(ModoExecucao modoExecucao) {
		this.modoExecucao = modoExecucao;
		if(modoExecucao instanceof Economia)
			System.err.println("Entrei no modo ECONOMIA!");
		else if(modoExecucao instanceof Desempenho)
			System.err.println("Entrei no modo DESEMPENHO!");
	}
	
	//OPERACOES DEPENDENTES DE ESTRATEGIA
	public void processar(int megabytes) {
		this.modoExecucao.processar(megabytes);
	}
}
