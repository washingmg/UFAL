package br.ufal.aracomp.poo.padroes.facade;

// import java.util.ArrayList;
// import java.util.List;

public class AcademicoController implements IAcademico {
	private IAluno aluCont;
	private IProfessor profCont;
	private ICoordenador coordCont;
	
	public AcademicoController(IAluno aluCont, IProfessor profCont, ICoordenador coordCont) {
		this.aluCont = aluCont;
		this.profCont = profCont;
		this.coordCont = coordCont;
	}

	@Override
	public void matricular() {
		this.aluCont.matricular();
	}

	@Override
	public void gerarComprovante() {
		this.aluCont.gerarComprovante();
	}

	@Override
	public void gerarHistorico() {
		this.aluCont.gerarHistorico();
	}

	@Override
	public void consultarNota() {
		this.aluCont.consultarNota();
	}

	@Override
	public void consultarPagela() {
		this.aluCont.consultarPagela();
	}

	@Override
	public void atualizarNota() {
		this.profCont.atualizarNota();
	}

	@Override
	public void atualizarFaltas() {
		this.profCont.atualizarFaltas();
	}

	@Override
	public void atualizarPagela() {
		this.profCont.atualizarPagela();
	}

	@Override
	public void desmatricular() {
		this.coordCont.desmatricular();
	}

	@Override
	public void trancarMatricula() {
		this.coordCont.trancarMatricula();
	}

	@Override
	public void associarDocente() {
		this.coordCont.associarDocente();
	}

}
