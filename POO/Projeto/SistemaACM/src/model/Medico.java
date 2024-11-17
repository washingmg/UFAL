package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.interfaces.IEstadoMedico;
import model.state.EstadoMedicoAtivo;

public class Medico extends Pessoa {
	private String especialidade;
	private double valorConsulta;
	private List<Horario> horarios;
	private IEstadoMedico estadoAtual;

	// Construtor
	public Medico(String nome, String cpf, String especialidade, double valorConsulta) {
		super(nome, cpf);
		this.especialidade = especialidade;
		this.valorConsulta = valorConsulta;
		this.horarios = new ArrayList<>();
		this.estadoAtual = new EstadoMedicoAtivo(); // Estado inicial
	}

	// Métodos delegando ao estado
	public void marcarHorario(String horarioEscolhido, Date dataEscolhida) {
		for (Horario h : horarios) {
			if (h.getData().equals(dataEscolhida) && h.getHora().equals(horarioEscolhido)) {
				h.setOcupado(true); // Marca o horário como ocupado
				break;
			}
		}
	}

	public void liberarHorario(String hora) {
		estadoAtual.liberarHorario(this, hora);
	}

	public void ativar() {
		estadoAtual.ativar(this);
	}

	public void desativar() {
		estadoAtual.desativar(this);
	}

	// Métodos internos para modificar horários
	protected void marcarHorarioInterno(String hora, Date dataEscolhida) {
		for (Horario horario : horarios) {
			if (horario.getHora().equals(hora) && !horario.isOcupado()) {
				horario.setOcupado(true);
				break;
			}
		}
	}

	protected void liberarHorarioInterno(String hora) {
		for (Horario horario : horarios) {
			if (horario.getHora().equals(hora) && horario.isOcupado()) {
				horario.setOcupado(false);
				break;
			}
		}
	}

	// Métodos adicionais
	public void adicionarHorario(Date data, String hora) {
		Horario horario = new Horario(data, hora, false);
		horarios.add(horario);
	}

	public List<Horario> getHorarios() {
		return horarios;
	}

	public void setEstadoAtual(IEstadoMedico novoEstado) {
		this.estadoAtual = novoEstado;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public double getValorConsulta() {
		return valorConsulta;
	}
}
