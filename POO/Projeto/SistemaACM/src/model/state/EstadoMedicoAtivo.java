package model.state;

import java.util.Date;

import model.Medico;
import model.interfaces.IEstadoMedico;

public class EstadoMedicoAtivo implements IEstadoMedico {

	@Override
	public void marcarHorario(Medico medico, String hora, Date dataEscolhida) {
		medico.marcarHorario(hora, dataEscolhida);
	}

	@Override
	public void liberarHorario(Medico medico, String hora) {
		medico.liberarHorario(hora);	
	}

	@Override
	public void ativar(Medico medico) {
		System.out.println("O médico já está ativo.");
	}

	@Override
	public void desativar(Medico medico) {
		medico.setEstadoAtual(new EstadoMedicoInativo());
        System.out.println("O médico foi desativado.");
	}

}
