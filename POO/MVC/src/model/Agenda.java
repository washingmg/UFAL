package model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private int codigo;
	private String nome;
	private List<Contato> contatos;
	
	public Agenda(int codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
		this.contatos = new ArrayList<>();
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Contato> getContatos() {
		return contatos;
	}
	
	public void adicionarOuAtualizarContato(Contato contato) {
		int i = this.contatos.indexOf(contato);
		if (i <0)
			this.contatos.add(contato);
		else
			this.contatos.set(i,contato);
	}
	
	public void removerContato(Contato contato) {
		this.contatos.remove(contato);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		boolean retorno = false;
		
		if(obj instanceof Agenda && 
				((Agenda)obj).getCodigo() == this.codigo){
				retorno = true;
		}
		
		return retorno;
	}
}
