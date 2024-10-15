package model;

public class Contato {
	private int codigo;
	private String nome;
	private String telefone;
	private String email;

	public Contato(int codigo, String nome, String telefone, String email) {
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean retorno = false;
		
		if(obj instanceof Contato && 
				((Contato)obj).getEmail().equals(this.email)){
				retorno = true;
		}
		else if(obj instanceof Contato && 
				((Contato)obj).getCodigo() == this.codigo){
				retorno = true;
		}
		
		return retorno;
	}
}
