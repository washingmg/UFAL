package br.ufal.aracomp.poo.padroes.observer;

import java.util.ArrayList;

public class SujeitoImpl implements SujeitoIF {

	private ArrayList<ObservadorIF> observers;
	private String onChangeThisVariable;
	
	public SujeitoImpl() {
		observers = new ArrayList<ObservadorIF>();
	}
	
	@Override
	public void registrarObserver(ObservadorIF observer) {
		observers.add(observer);
	}

	@Override
	public void removerObserver(ObservadorIF observer) {
		observers.remove(observer);
	}

	@Override
	public void notificarObservers() {
		for(ObservadorIF observer : observers) {
			observer.update(this);
		}
	}
	
	public void setOnChangeThisVariable(String newValue) {
		onChangeThisVariable = newValue;
		notificarObservers();
	}
	
	public String getOnChangeThisVariable() {
		return onChangeThisVariable;
	}

}
