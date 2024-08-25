package Inclusao.br.ufal.aracomp.poo.operacoes;


public class Principal2 {
	public static void main(String[] args) {
		Operacao op = new Subtracao();
		
		if(op instanceof Adicao)
			System.out.println("ADICAO!");
		else if(op instanceof Subtracao)
			System.out.println("SUBTRAÇÃO!");
		else if(op instanceof Multiplicacao)
			System.out.println("MULTIPLICAÇÃO!");
		else if(op instanceof Divisao)
			System.out.println("DIVISÃO!");
		
		op.calcular(2, 3);
	}
}
