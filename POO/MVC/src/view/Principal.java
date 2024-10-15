package view;

import controller.ControleAgenda;
import controller.ISistemaAgenda;

public class Principal {

	public static void main(String[] args) {
		ISistemaAgenda agendaController = new ControleAgenda();
		TelaTextual tela =  new TelaTextual(agendaController);
		tela.exibir(null);
		
	}
}
