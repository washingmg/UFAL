package Inclusao.br.ufal.aracomp.poo.operacoes;


public class Adicao extends Operacao{
	private int codigo;
	
	public Adicao(int codigo) {
		this.codigo = codigo;
	}
	
	public Adicao() {
		this.codigo = 0;
	}

	@Override
	public void calcular(float num1, float num2) {
		this.mostrar(num1 + " + " + num2 + " = " + (num1+num2));
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
