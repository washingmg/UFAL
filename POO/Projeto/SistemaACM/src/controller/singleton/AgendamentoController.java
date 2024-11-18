package controller.singleton;

import model.Medico;
import model.Paciente;
import model.interfaces.IAgenda;
import model.Horario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgendamentoController implements IAgenda {
    private static AgendamentoController instance;
    private List<Medico> medicos;
    private List<Paciente> pacientes;
    private List<String> agendamentos;

    private AgendamentoController() {
        medicos = new ArrayList<>();
        pacientes = new ArrayList<>();
        agendamentos = new ArrayList<>();

        // Criando o mapa de dias e horários
        Map<String, List<String>> diasEHorariosDrSilva = new HashMap<>();
        diasEHorariosDrSilva.put("01/12/2024", List.of("08:00 - 08:40", "09:00 - 09:40"));
        diasEHorariosDrSilva.put("02/12/2024", List.of("08:00 - 08:40", "09:00 - 09:40"));

        Map<String, List<String>> diasEHorariosDrCosta = new HashMap<>();
        diasEHorariosDrCosta.put("01/12/2024", List.of("10:00 - 10:40", "11:00 - 11:40"));
        diasEHorariosDrCosta.put("03/12/2024", List.of("10:00 - 10:40", "11:00 - 11:40"));

        Map<String, List<String>> diasEHorariosDrOliveira = new HashMap<>();
        diasEHorariosDrOliveira.put("02/12/2024", List.of("14:00 - 14:40", "15:00 - 15:40"));
        diasEHorariosDrOliveira.put("03/12/2024", List.of("14:00 - 14:40", "15:00 - 15:40"));

        Map<String, List<String>> diasEHorariosDrSantos = new HashMap<>();
        diasEHorariosDrSantos.put("02/12/2024", List.of("16:00 - 16:40"));
        diasEHorariosDrSantos.put("04/12/2024", List.of("16:00 - 16:40"));

        Map<String, List<String>> diasEHorariosDrFerreira = new HashMap<>();
        diasEHorariosDrFerreira.put("01/12/2024", List.of("08:00 - 08:40", "15:00 - 15:40"));
        diasEHorariosDrFerreira.put("04/12/2024", List.of("08:00 - 08:40", "15:00 - 15:40"));

        // Chamadas para adicionar médicos
        adicionarMedico("Dr. Silva", "11111111111", "Cardiologia", 300, diasEHorariosDrSilva);
        adicionarMedico("Dr. Costa", "22222222222", "Dermatologia", 250, diasEHorariosDrCosta);
        adicionarMedico("Dr. Oliveira", "33333333333", "Ortopedia", 400, diasEHorariosDrOliveira);
        adicionarMedico("Dr. Santos", "44444444444", "Pediatria", 150, diasEHorariosDrSantos);
        adicionarMedico("Dr. Ferreira", "55555555555", "Ginecologia", 290, diasEHorariosDrFerreira);

        // Instanciando pacientes
        adicionarPaciente("João", "12345678900");
        adicionarPaciente("Maria", "98765432100");
        adicionarPaciente("Carlos", "11223344556");
    }

    public static AgendamentoController getInstance() {
        if (instance == null) {
            instance = new AgendamentoController();
        }
        return instance;
    }

    public void adicionarMedico(String nome, String cpf, String especialidade, double valorConsulta, 
                            Map<String, List<String>> diasEHorarios) {
        Medico medico = new Medico(nome, cpf, especialidade, valorConsulta);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        for (Map.Entry<String, List<String>> entrada : diasEHorarios.entrySet()) {
            String dia = entrada.getKey();
            List<String> horarios = entrada.getValue();
            try {
                Date dataAtendimento = formato.parse(dia); // Converte o dia para o formato Date
                for (String horario : horarios) {
                    medico.adicionarHorario(dataAtendimento, horario); // Associa cada horário ao respectivo dia
                }
            } catch (ParseException e) {
                System.out.println("Erro ao parsear a data: " + dia);
            }
        }
        medicos.add(medico); 
    }

    // Método para adicionar pacientes
    public void adicionarPaciente(String nome, String cpf) {
        Paciente paciente = new Paciente(nome, cpf);
        pacientes.add(paciente);
    }

    // Método para listar médicos
    public List<Medico> listarMedicos() {
        return medicos;
    }
    
    // Método para listar pacientes
    public List<Paciente> listarPacientes() {
        return pacientes;
    }

    // Método para listar agendamentos
    public List<String> listarAgendamentos() {
        return agendamentos;
    };

    // Método para agendar consulta
    @Override
    public String agendarConsulta(String nomePaciente, String especialidade, Date dataEscolhida, 
                                String horarioEscolhido, String nomeMedico) {
        Medico medico = null;
        for (Medico m : medicos) {
            if (m.getNome().equals(nomeMedico) && m.getEspecialidade().equals(especialidade)) {
                medico = m;
                break;
            }
        }
        if (medico == null) {
            return "Médico não encontrado para a especialidade informada.";
        }

        // Verifica se o horário está disponível na data escolhida
        for (Horario horario : medico.getHorarios()) {
            if (horario.getData().equals(dataEscolhida) && horario.getHora().equals(horarioEscolhido) && !horario.isOcupado()) {
                medico.marcarHorario(horarioEscolhido, dataEscolhida); // Marca o horário como ocupado
                String agendamento = "Consulta agendada para " + nomePaciente + " com " + nomeMedico + " no dia "
                        + new SimpleDateFormat("dd/MM/yyyy").format(dataEscolhida) + " às " + horarioEscolhido + ".";
                agendamentos.add(agendamento); // Adiciona o agendamento à lista

                return agendamento; // Retorna a mensagem de sucesso
            }
        }
        return "Horário ou data indisponível.";
    }   

    // Método para cancelar agendamento
    @Override
    public String cancelarAgendamento(String nomePaciente, String nomeMedico, String horarioEscolhido, Date dataEscolhida) {
        Medico medico = null;
        for (Medico m : medicos) {
            if (m.getNome().equals(nomeMedico)) {
                medico = m;
                break;
            }
        }
        if (medico == null) {
            return "Médico não encontrado.";
        }

        // Verifica se o horário foi agendado e se o paciente é o correto
        for (Horario horario : medico.getHorarios()) {
            if (horario.getData().equals(dataEscolhida) && horario.getHora().equals(horarioEscolhido) && horario.isOcupado()) {
                horario.setOcupado(false); // Libera o horário
                // Remove o agendamento correspondente da lista de agendamentos
                String agendamentoRemovido = null;
                String dataFormatada = new SimpleDateFormat("dd/MM/yyyy").format(dataEscolhida);
                String agendamentoBusca = "Consulta agendada para " + nomePaciente + " com " + nomeMedico + " no dia "
                        + dataFormatada + " às " + horarioEscolhido + ".";
                for (String agendamento : agendamentos) {
                    if (agendamento.equals(agendamentoBusca)) {
                        agendamentoRemovido = agendamento;
                        break;
                    }
                }
                if (agendamentoRemovido != null) {
                    agendamentos.remove(agendamentoRemovido);
                }

                return "Agendamento cancelado para o paciente " + nomePaciente + " no dia "
                        + dataFormatada + " às " + horarioEscolhido + ".";
            }
        }
        return "Horário não encontrado ou já está disponível.";
    }
}
