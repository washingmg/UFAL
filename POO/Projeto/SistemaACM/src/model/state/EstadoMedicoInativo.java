package model.state;

import java.util.Date;

import model.Medico;
import model.interfaces.IEstadoMedico;

public class EstadoMedicoInativo implements IEstadoMedico{

	@Override
	 public void marcarHorario(Medico medico, String hora, Date dataEscolhida) {
        System.out.println("Não é possível marcar horário. O médico está inativo.");
    }

    @Override
    public void liberarHorario(Medico medico, String hora) {
        System.out.println("Não é possível liberar horário. O médico está inativo.");
    }
 
    @Override
    public void ativar(Medico medico) {
        medico.setEstadoAtual(new EstadoMedicoAtivo());
        System.out.println("O médico foi ativado.");
    }

    @Override
    public void desativar(Medico medico) {
        System.out.println("O médico já está inativo.");
    }

}
