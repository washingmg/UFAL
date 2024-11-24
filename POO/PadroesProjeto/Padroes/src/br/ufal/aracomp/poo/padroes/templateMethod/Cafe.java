package br.ufal.aracomp.poo.padroes.templateMethod;

import java.util.Scanner;

public class Cafe extends BebidaQuente {
	
	@Override
	protected void misturarAgua() {
		System.out.println("Misturando café na água quente...");
		
	}

	@Override
	protected void adicionarCondimentos() {
		System.out.println("Adicionando açucar e leite no café...");
		
	}
	
	@SuppressWarnings("resource")
	@Override
	protected boolean adicionarMaisIngredientes() {
		//pode-se ler dados do teclado para verificar se cliente deseja mais ingredientes.
		Scanner input = new Scanner(System.in);
		System.out.println("Deseja adicionar mais açúcar no Café? (S/N)");
		String user = input.nextLine();
		if(user.equals("S")) {
			return adicionarMaisIngredientes();
		} 
		input.close();
		return false;
		}
	}
