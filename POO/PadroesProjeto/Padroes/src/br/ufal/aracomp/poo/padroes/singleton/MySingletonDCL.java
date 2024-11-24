package br.ufal.aracomp.poo.padroes.singleton;

import java.util.Random;

public class MySingletonDCL {
	private volatile static MySingletonDCL singleton;
	private int randomNumber;
	
	private MySingletonDCL() {
		randomNumber = new Random().nextInt(1000);
	}
	
	public static MySingletonDCL getInstance() {
		if (singleton == null) {
			synchronized(MySingletonDCL.class) {
				if (singleton == null) {
					System.out.println("Criando obj...");
					singleton = new MySingletonDCL();
				}
			}
		}
			
		return singleton;
	}
	
	public int getRandomNumber() {
		return randomNumber;
	}
	
}
