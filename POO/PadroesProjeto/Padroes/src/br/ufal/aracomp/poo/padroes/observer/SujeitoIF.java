package br.ufal.aracomp.poo.padroes.observer;

public interface SujeitoIF {
	
	public void registrarObserver(ObservadorIF observer);
	public void removerObserver(ObservadorIF observer);
	public void notificarObservers();
	
}
