package controller;

import model.Contato;

import java.util.ArrayList;
import java.util.List;

import model.Agenda;

public class ControleAgenda implements ISistemaAgenda {
	private List<Agenda> agendas;
	
	public ControleAgenda() {
		this.agendas = new ArrayList<>();
	}
	
	@Override
	public List<Agenda> obterAgendas() {
		return this.agendas;
	}
	
	@Override
	public Agenda obterAgenda(int codAgenda) {
		for(Agenda agenda : this.agendas) {
			if(agenda!=null  &&  agenda.getCodigo()==codAgenda) {
				return agenda;
			}
		}
		return null;
	}

	@Override
	public void adicionarOuReiniciarAgenda(int codigoAgenda, String nomeAgenda) {
		Agenda agenda = new Agenda(codigoAgenda, nomeAgenda);
		this.adicionarOuAtualizarAgenda(agenda);
	}
	
	private void adicionarOuAtualizarAgenda(Agenda agenda) {
		int i = this.agendas.indexOf(agenda);
		if (i <0)
			this.agendas.add(agenda);
		else
			this.agendas.set(i,agenda);
	}

	@Override
	public void apagarAgenda(int codigo) {
		for(Agenda agenda : this.agendas) {
			if(agenda!=null  &&  agenda.getCodigo()==codigo) {
				this.agendas.remove(agenda);
				break;
			}
		}
	}

	@Override
	public void adicionarOuAtualizarContato(int codAgenda, Contato contato) {
		Agenda agenda = this.obterAgenda(codAgenda);
		if(agenda!=null) {
			agenda.adicionarOuAtualizarContato(contato);
			this.adicionarOuAtualizarAgenda(agenda);
		}
	}

	@Override
	public void removerContato(int codAgenda, int codContato) {
		Contato contato = this.obterContato(codAgenda, codContato);
		if(contato != null) {
			Agenda agenda = this.obterAgenda(codAgenda);
			agenda.removerContato(contato);
		}
	}

	@Override
	public Contato obterContato(int codAgenda, int codContato) {
		Agenda agenda = this.obterAgenda(codAgenda);
		if(agenda != null) {
			for(Contato contato : agenda.getContatos()) {
				if(contato.getCodigo() == codContato) {
					return contato;
				}
			}
		}
		return null;
	}

	@Override
	public List<Contato> obterContatos(int codAgenda) {
		Agenda agenda = this.obterAgenda(codAgenda);
		if (agenda != null) {
			return agenda.getContatos();
		}
		
		return new ArrayList<Contato>();
	}
}
