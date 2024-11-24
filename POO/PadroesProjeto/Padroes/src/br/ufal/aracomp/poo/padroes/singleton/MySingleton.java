package br.ufal.aracomp.poo.padroes.singleton;

import java.util.Random;

public class MySingleton {
	private static MySingleton objeto;
	
	private int randomNumber;
	
	private MySingleton() {
		randomNumber = new Random().nextInt(1000);
	}
	
	public static MySingleton getInstance() {
		if (objeto == null)
			objeto = new MySingleton();
		
		return objeto;
	}
	
	public int getRandomNumber() {
		return randomNumber;
	}
	
}
