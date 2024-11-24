package br.ufal.aracomp.poo.padroes.facade;

public interface ICoordenador {
	void matricular();
	void desmatricular();
	void trancarMatricula();
	void associarDocente();
	void gerarComprovante();
	void gerarHistorico();
	void consultarNota();
	void consultarPagela();
}
