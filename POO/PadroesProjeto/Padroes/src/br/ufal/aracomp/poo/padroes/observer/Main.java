package br.ufal.aracomp.poo.padroes.observer;

public class Main {

	public static void main(String[] args) {
		SujeitoImpl subjectImp = new SujeitoImpl();
		
		ObservadorIF observer1 = new ObservadorImpl1();
		ObservadorIF observer2 = new ObservadorImpl2();
		
		subjectImp.registrarObserver(observer1);
		subjectImp.registrarObserver(observer2);
		
		subjectImp.setOnChangeThisVariable("Nova String 1");
		subjectImp.setOnChangeThisVariable("Nova String 2");
		subjectImp.setOnChangeThisVariable("Nova String 3");
		
		System.err.println("Removendo o Observador 1 - ele não receberá novas notificações");
		subjectImp.removerObserver(observer1);
		
		subjectImp.setOnChangeThisVariable("Nova String 1");
		subjectImp.setOnChangeThisVariable("Nova String 2");
		subjectImp.setOnChangeThisVariable("Nova String 3");
		
		System.err.println("Removendo o Observador 2 - ele não receberá novas notificações");
		subjectImp.removerObserver(observer2);
		
		subjectImp.setOnChangeThisVariable("Nova String 1");
		subjectImp.setOnChangeThisVariable("Nova String 2");
		subjectImp.setOnChangeThisVariable("Nova String 3");
		
	}
	
}
