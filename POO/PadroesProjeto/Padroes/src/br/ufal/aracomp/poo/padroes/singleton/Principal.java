package br.ufal.aracomp.poo.padroes.singleton;

public class Principal {
	public static void main(String[] args) {
		MySingleton obj1 = MySingleton.getInstance();
		System.out.println(obj1.getRandomNumber());
		
		MySingleton obj2 = MySingleton.getInstance();
		System.out.println(obj2.getRandomNumber());
	}
}
