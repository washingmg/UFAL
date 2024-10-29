package juntar;

public class Agendamento {
    private int id;
    private StatusAgendamento status;
    private Medico medico;
    private Paciente paciente;
    private String pagamento;
    private String dia;
    private String horario;
    private double valor;

    public Agendamento(int id, Medico medico, Paciente paciente, String pagamento, String dia, String horario, double valor) {
        this.id = id;
        this.medico = medico;
        this.paciente = paciente;
        this.pagamento = pagamento;
        this.dia = dia;
        this.horario = horario;
        this.valor = valor;
        this.status = StatusAgendamento.PENDENTE; 
    }   


    public int getId() {
        return id;
    }
    
    
    public void setId(int id) {
        this.id = id;
    }
    
    
    public StatusAgendamento getStatus() {
        return status;
    }
    
    
    public void setStatus(StatusAgendamento status) {
        this.status = status;
    }
    
    
    public Medico getMedico() {
        return medico;
    }
    
    
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
    
    public Paciente getPaciente() {
        return paciente;
    }
    
    
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    
    public String getPagamento() {
        return pagamento;
    }
    
    
    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    
    public String getDia() {
        return dia;
    }
    
    
    public void setDia(String dia) {
        this.dia = dia;
    }
    
    
    public String getHorario() {
        return horario;
    }
    
    
    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
    public double getValor() {
        return valor;
    }
    
    
    public void setValor(double valor) {
        this.valor = valor;
    }


    public void confirmarAgendamento() {
        this.status = StatusAgendamento.CONFIRMADO;
    }

    public void cancelarAgendamento() {
        this.status = StatusAgendamento.CANCELADO;
    }
}