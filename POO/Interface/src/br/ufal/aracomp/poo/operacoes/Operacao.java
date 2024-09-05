package br.ufal.aracomp.poo.operacoes;


import javax.swing.JOptionPane;

public class Operacao{
	
	
	public void calcular(float num1, float num2) {
		System.out.println("Operação generica");
	}
	
	
	protected void mostrar(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem);
	}
	
	@Override
	public String toString() {
		return "Operação Matemática";
	}
	
}
