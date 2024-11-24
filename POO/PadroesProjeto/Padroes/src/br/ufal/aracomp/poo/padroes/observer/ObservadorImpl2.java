package br.ufal.aracomp.poo.padroes.observer;

public class ObservadorImpl2 implements ObservadorIF {

	@Override
	public void update(SujeitoIF subject) {
		System.out.println("Sou o observador 2 => " + ((SujeitoImpl)subject).getOnChangeThisVariable());
	}
	
	

}
