package juntar;

import java.util.Date;

public class Medico extends Pessoa {
    private String crm;
    private Especialidade especialidade;
    private Agenda agenda;
    public Object cardiologia;

    public Medico(int id, String nome, String telefone, String email, String cpf, String crm, Especialidade especialidade) {
        super(id, nome, telefone, email, cpf); 
        this.crm = crm;
        this.especialidade = especialidade;
        this.agenda = new Agenda(id, this); 
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public void atenderPaciente(Paciente paciente, Date dia, Horario horario) {
        if (agenda.verificarDisponibilidade(dia, horario)) {
            Horario horarioReservado = agenda.reservarHorario(dia, horario);
            System.out.println("Médico " + getNome() + " está atendendo o paciente " + paciente.getNome());
            System.out.println("Horário reservado: " + horarioReservado.getInicio() + " - " + horarioReservado.getFim());
        } else {
            System.out.println("O médico " + getNome() + " não está disponível nesse horário.");
        }
    }
    
    public void adicionarHorario(Date dia, String inicio, String fim) {
        Horario horario = new Horario(inicio, fim);
        this.agenda.adicionarHorario(dia, horario);
    }
    
    public void liberarHorario(Date dia, String periodoInicio, String periodoFim) {
        agenda.liberarHorario(dia, periodoInicio, periodoFim);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Detalhes do Médico:");
        System.out.println("-----------------------------------------");
        super.exibirDetalhes();
        System.out.println("CRM: " + crm);
        System.out.println("Especialidade: " + especialidade.getNome());
        System.out.println("-----------------------------------------");
    }
}
