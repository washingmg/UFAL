package br.ufal.aracomp.es.state.main;

import br.ufal.aracomp.es.state.Inseto;

public class Principal {
	public static void main(String[] args) {
		Inseto i1 = new Inseto("Borba", 2);
		i1.mostrarDetalhes();
		i1.movimentar(5);
		i1.mostrarDetalhes();
		
		System.out.println();
		//FASE2
		i1.proximoEstado();
		i1.mostrarDetalhes();
		i1.movimentar(5);
		i1.mostrarDetalhes();
		
		System.out.println();
		//FASE3
		i1.proximoEstado();
		i1.mostrarDetalhes();
		i1.movimentar(5);
		i1.mostrarDetalhes();
		
		System.out.println();
		//FASE4
		i1.proximoEstado();
		i1.mostrarDetalhes();
		i1.movimentar(5);
		i1.mostrarDetalhes();
	}
}
