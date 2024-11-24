package br.ufal.aracomp.poo.padroes.templateMethod;

public class Cha extends BebidaQuente {

	@Override
	protected void misturarAgua() {
		System.out.println("Mergulhando chá na água fervente...");
		
	}

	@Override
	protected void adicionarCondimentos() {
		System.out.println("Adicionando limão ao chá...");
		
	}
	
	

}
