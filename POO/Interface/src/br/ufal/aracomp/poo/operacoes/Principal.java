package br.ufal.aracomp.poo.operacoes;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		//ALTERNATIVA AO SCANNER
		//String teste = JOptionPane.showInputDialog("Digite a opção:");
		
		Operacao op = null;
		String opcao = "";
//		Scanner scan = new Scanner(System.in);
		while(!opcao.equalsIgnoreCase("0")) {
//			System.out.println("Digite A para realizar a adição;\n"
//					+ "Digite S para realizar a subtração;\n"
//					+ "Digite M para realizar a multiplicação;\n"
//					+ "Digite D para realizar a divisão;\n"
//					+ "Digite 0 (zero) para SAIR;");
			
//			opcao = scan.next();
			opcao = JOptionPane.showInputDialog(
					"Digite A para realizar a adição;\n"
					+ "Digite S para realizar a subtração;\n"
					+ "Digite M para realizar a multiplicação;\n"
					+ "Digite D para realizar a divisão;\n"
					+ "Digite 0 (zero) para SAIR;");
			
			//INSTANCIAR A OP CORRETA
			if(opcao.equalsIgnoreCase("A"))
				op = new Adicao();
			else if(opcao.equalsIgnoreCase("S"))
				op = new Subtracao();
			else if(opcao.equalsIgnoreCase("M"))
				op = new Multiplicacao();
			else if(opcao.equalsIgnoreCase("D"))
				op = new Divisao();
			
			if(!opcao.equals("0")) {
				//LER NUMEROS
				String numStr = JOptionPane.showInputDialog("Digite o primeiro numero:");
				float num1 = Float.parseFloat(numStr);
				numStr = JOptionPane.showInputDialog("Digite o segundo numero:");
				float num2 = Float.parseFloat(numStr);
				
				//EXECUTAR A OPERACAO
				op.calcular(num1, num2);
			}
		}
//		scan.close();
	}
}
