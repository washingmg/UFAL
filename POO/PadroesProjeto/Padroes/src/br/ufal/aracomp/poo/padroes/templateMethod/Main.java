package br.ufal.aracomp.poo.padroes.templateMethod;

public class Main {
	public static void main(String[] args) {
		BebidaQuente cf1 = new Cafe();
		BebidaQuente ch1 = new Cha();
		
		cf1.prepararBebida();
		ch1.prepararBebida();
	}
}
