package br.ufal.aracomp.poo.operacoes;


public class Adicao implements Operacao{
	private Visual visual = new Visual();
	private int codigo;
	
	public Adicao(int codigo) {
		this.codigo = codigo;
	}
	
	public Adicao() {
		this.codigo = 0;
	}
	
	@Override
	public void calcular(float num1, float num2) {
		this.visual.mostrar(num1 + " + " + num2 + " = " + (num1+num2));
	}
	
	public void calcular(float num1, float num2, float num3) {
		this.visual.mostrar(num1 + " + " + num2 + " + " + num3 + " = " + (num1+num2+num3));
	}

	
	
	@Override
	public boolean equals(Object obj) {
		boolean valor = false;
		
		if(this instanceof Adicao  && obj instanceof Adicao) {
			if(this.codigo == ((Adicao)obj).codigo) {
				valor = true;
			}
		}
		
		return valor;
	}
}
