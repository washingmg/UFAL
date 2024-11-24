package br.ufal.aracomp.es.strategy.main;

import br.ufal.aracomp.es.strategy.Desempenho;
import br.ufal.aracomp.es.strategy.Economia;
import br.ufal.aracomp.es.strategy.Servidor;

public class Principal {
	public static void main(String[] args) {
		Servidor i1 = new Servidor("Aracomp");
		i1.processar(50);
		
		System.out.println();
		//FASE2
		i1.setModoExecucao(new Desempenho());
		i1.processar(50);
		
		System.out.println();
		//FASE3
		i1.setModoExecucao(new Economia());
		i1.processar(50);
		
		System.out.println();
		//FASE4
		i1.setModoExecucao(new Desempenho());
		i1.processar(50);
	}
}
