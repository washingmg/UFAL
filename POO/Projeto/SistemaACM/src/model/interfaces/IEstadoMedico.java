package model.interfaces;

import java.util.Date;

import model.Medico;

public interface IEstadoMedico {
	void marcarHorario(Medico medico, String hora, Date dataEscolhida);
    void liberarHorario(Medico medico, String hora);
    void ativar(Medico medico);
    void desativar(Medico medico);
}
