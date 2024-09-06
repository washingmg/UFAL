package br.ufal.aracomp.poo.operacoes;


public class Divisao implements Operacao{
	Visual visual = new Visual();

	@Override
	public void calcular(float num1, float num2) {
		this.visual.mostrar(num1 + " / " + num2 + " = " + (num1/num2));
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean valor = false;
		
		if(this instanceof Divisao  && obj instanceof Divisao)
			valor = true;
		
		return valor;
	}


}
