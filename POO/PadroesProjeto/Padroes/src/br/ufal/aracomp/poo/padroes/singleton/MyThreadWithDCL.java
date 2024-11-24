package br.ufal.aracomp.poo.padroes.singleton;

public class MyThreadWithDCL implements Runnable {

	private int a;
	public MyThreadWithDCL(int a) {
		this.a = a;
	}
	
	@Override
	public void run() {
		
		MySingletonDCL s = MySingletonDCL.getInstance();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Eu sou thread " + a 
					+ " valor random = " + s.getRandomNumber() +
					" com endereco de memoria " + s);
		}
		
	}

}
