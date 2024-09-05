package br.ufal.aracomp.poo.operacoes;

public class Subtracao extends Operacao{

	@Override
	public void calcular(float num1, float num2) {
		this.mostrar(num1 + " - " + num2 + " = " + (num1-num2));
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean valor = false;
		
		if(this instanceof Subtracao  && obj instanceof Subtracao)
			valor = true;
		
		return valor;
	}
	
}
