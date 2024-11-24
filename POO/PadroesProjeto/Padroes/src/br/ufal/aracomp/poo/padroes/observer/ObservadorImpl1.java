package br.ufal.aracomp.poo.padroes.observer;

public class ObservadorImpl1 implements ObservadorIF {

	@Override
	public void update(SujeitoIF subject) {
		System.out.println("Sou o observador 1 => " + ((SujeitoImpl)subject).getOnChangeThisVariable());
		this.atualizarGrafico(subject);
	}
	
	public void atualizarGrafico(SujeitoIF obj) {
		
	}

}
