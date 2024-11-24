package br.ufal.aracomp.poo.padroes.templateMethod;

public abstract class BebidaQuente {
	
	public final void prepararBebida() {
		feverAgua();
		misturarAgua();
		colocarNaXicara();
		adicionarCondimentos();
		if (adicionarMaisIngredientes()) {
			//adicionar mais condimentos
		}
			
	}
	
	protected abstract void misturarAgua();
	protected abstract void adicionarCondimentos();
	
	private void feverAgua() {
		System.out.println("Fevendo água...");
	}
	
	private void colocarNaXicara() {
		System.out.println("Colocando na xicara...");
	}
	
	protected boolean adicionarMaisIngredientes() {
		return false; //por padrão, nao retorna nada.
	}
	
}
