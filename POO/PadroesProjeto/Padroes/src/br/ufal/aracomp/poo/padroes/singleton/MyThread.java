package br.ufal.aracomp.poo.padroes.singleton;

public class MyThread implements Runnable {

	private int a;
	public MyThread(int a) {
		this.a = a;
	}
	
	@Override
	public void run() {
		
		MySingleton s = MySingleton.getInstance();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Eu sou thread " + a 
					+ " valor random = " + s.getRandomNumber() +
					" com endereco de memoria " + s);
		}
		
	}

}
