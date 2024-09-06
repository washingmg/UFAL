package br.ufal.aracomp.poo.operacoes;

public class Principal2 {
	
	public static void main(String[] args) {
		Operacao o = new Adicao();
		
		if(o instanceof Adicao)
			((Adicao)o).calcular(2, 5, 3);
		else
			System.out.println("Operação imcompatível!");
	}
}
