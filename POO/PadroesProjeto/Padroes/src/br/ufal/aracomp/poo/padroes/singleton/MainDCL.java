package br.ufal.aracomp.poo.padroes.singleton;

public class MainDCL {
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThreadWithDCL(1));
		Thread t2 = new Thread(new MyThreadWithDCL(2));
		Thread t3 = new Thread(new MyThreadWithDCL(3));
		Thread t4 = new Thread(new MyThreadWithDCL(4));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
	
}
