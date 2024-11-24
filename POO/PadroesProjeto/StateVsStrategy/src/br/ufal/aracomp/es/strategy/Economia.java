package br.ufal.aracomp.es.strategy;

public class Economia extends ModoExecucao{

	@Override
	protected void processar(int megabytes) {
		System.out.println("Executei "+megabytes+" megabytes em "+megabytes/2 + " segundos!");
	}
}
