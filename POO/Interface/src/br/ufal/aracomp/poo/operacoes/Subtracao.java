package br.ufal.aracomp.poo.operacoes;

public class Subtracao implements Operacao{
	Visual visual = new Visual();

	@Override
	public void calcular(float num1, float num2) {
		this.visual.mostrar(num1 + " - " + num2 + " = " + (num1-num2));
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean valor = false;
		
		if(obj instanceof Subtracao)
			valor = true;
		
		return valor;
	}
	
	@Override
	public String toString() {
		return super.toString() + "...SUBTRACAO.";
	}
	
}
