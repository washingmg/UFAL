package br.ufal.aracomp.poo.operacoes;


public class Multiplicacao extends Operacao{

	@Override
	public void calcular(float num1, float num2) {
		this.mostrar(num1 + " x " + num2 + " = " + (num1*num2));
	}
	
	@Override
	public String toString() {
		String valor = "Multiplicacao " + "sem atributos";
		return valor;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean valor = false;
		
		if(this instanceof Multiplicacao  && obj instanceof Multiplicacao)
			valor = true;
		
		return valor;
	}
}
