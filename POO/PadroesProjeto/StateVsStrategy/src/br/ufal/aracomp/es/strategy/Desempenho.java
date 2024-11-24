package br.ufal.aracomp.es.strategy;

public class Desempenho extends ModoExecucao{

	@Override
	protected void processar(int megabytes) {
		System.out.println("Executei "+megabytes+" megabytes em "+megabytes/20 + " segundos!");
	}
}
