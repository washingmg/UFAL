package model.interfaces;

import java.util.Date;

public interface IAgenda {

	String agendarConsulta(String nomePaciente, String especialidade, Date dataEscolhida, String horarioEscolhido, String nomeMedico);

	String cancelarAgendamento(String nomePaciente, String nomeMedico, String horarioEscolhido, Date dataEscolhida);
	
}
