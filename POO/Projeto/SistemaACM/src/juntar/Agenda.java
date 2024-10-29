package juntar;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Agenda {
    private int id;
    private Map<Date, List<Horario>> horariosPorDia; 
    private Medico medico;
    
    private List<Horario> horariosDisponiveis;

    public Agenda(int id, Medico medico) {
        this.id = id;
        this.medico = medico;
        this.horariosPorDia = new HashMap<>(); 
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setHorariosPorDia(Map<Date, List<Horario>> horariosPorDia) {
        this.horariosPorDia = horariosPorDia;
    }

    public Map<Date, List<Horario>> getHorariosPorDia() {
        return horariosPorDia;
    }

    public void adicionarHorario(Date dia, Horario horario) {
        horariosPorDia.computeIfAbsent(dia, k -> new ArrayList<>()).add(horario);
    }

    public boolean verificarDisponibilidade(Date dia, Horario horario) {
        List<Horario> horarios = horariosPorDia.get(dia);
        if (horarios != null) {
            for (Horario h : horarios) {
                if (h.getInicio().equals(horario.getInicio()) || h.getFim().equals(horario.getFim())) {
                    return false; 
                }
            }
        }
        return true; 
    }

    public Horario reservarHorario(Date dia, Horario horario) {
        if (verificarDisponibilidade(dia, horario)) {
            adicionarHorario(dia, horario); 
            return horario; 
        }
        return null; 
    }

    public void liberarHorario(Date dia, String periodoInicio, String periodoFim) {
        List<Horario> horarios = horariosPorDia.get(dia);
        if (horarios != null) {
            Iterator<Horario> iterator = horarios.iterator();
            while (iterator.hasNext()) {
                Horario horario = iterator.next();
                if (horario.getInicio().equals(periodoInicio) && horario.getFim().equals(periodoFim)) {
                    iterator.remove();
                    System.out.println("Horário liberado: " + periodoInicio + " - " + periodoFim);
                    return;
                }
            }
        }
        System.out.println("Horário não encontrado para liberar.");
    }

    public List<Horario> getHorariosDisponiveis(Date dia) {
        List<Horario> horariosReservados = horariosPorDia.getOrDefault(dia, new ArrayList<>());
        List<Horario> horariosDisponiveisParaODia = new ArrayList<>(horariosDisponiveis); 
        for (Horario reservado : horariosReservados) {
            horariosDisponiveisParaODia.removeIf(h -> h.getInicio().equals(reservado.getInicio()) && h.getFim().equals(reservado.getFim()));
        }

        return horariosDisponiveisParaODia;
    }
}
