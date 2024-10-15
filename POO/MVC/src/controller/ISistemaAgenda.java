package controller;

import java.util.List;

import model.Agenda;
import model.Contato;

public interface ISistemaAgenda {
	List<Agenda> obterAgendas();
	Agenda obterAgenda(int codAgenda);
	void adicionarOuReiniciarAgenda(int codigoAgenda, String nomeAgenda);
	void apagarAgenda(int codigo);
	void adicionarOuAtualizarContato(int codigoAgenda, Contato contato);
	void removerContato(int codAgenda, int codContato);
	Contato obterContato(int codAgenda, int codContato);
	List<Contato> obterContatos(int codAgenda);
}
