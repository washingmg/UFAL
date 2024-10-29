import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import juntar.Especialidade;
import juntar.Medico;
import juntar.Paciente;
import juntar.Horario;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Criar pacientes
        List<Paciente> pacientes = new ArrayList<>();

        pacientes.add(new Paciente(1, "Ana Silva", "111222333", "ana@example.com", "111.222.333-44", "28/09/2004", 65.5f, 1.70f, "Feminino", "Nenhum", "Rua A, 123"));
        pacientes.add(new Paciente(2, "Washington", "111222333", "washington@example.com", "111.222.333-55", "28/09/2005", 65.5f, 1.70f, "Masculino", "Nenhum", "Rua A, 123"));

        // Escolha do paciente para o agendamento
        System.out.println("Escolha o paciente para o agendamento:");
        for (int i = 0; i < pacientes.size(); i++) {
            System.out.println((i + 1) + ". " + pacientes.get(i).getNome());
        }

        int escolhaPaciente = -1;
        while (escolhaPaciente < 1 || escolhaPaciente > pacientes.size()) {
            System.out.print("Digite o número correspondente ao paciente: ");
            try {
                escolhaPaciente = Integer.parseInt(scanner.nextLine());
                if (escolhaPaciente < 1 || escolhaPaciente > pacientes.size()) {
                    System.out.println("Escolha inválida. Por favor, escolha um número válido.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
            }
        }

        // Selecionar o paciente escolhido
        Paciente pacienteEscolhido = pacientes.get(escolhaPaciente - 1);

        // Criar especialidades
        Especialidade cardiologia = new Especialidade(1, "Cardiologia");
        Especialidade dermatologia = new Especialidade(2, "Dermatologia");

        // Criar médicos e suas agendas
        Medico medico1 = new Medico(1, "Dr. João", "123456789", "joao@example.com", "123.456.789-00", "CRM-1234", cardiologia);
        Medico medico2 = new Medico(2, "Dr. Maria", "987654321", "maria@example.com", "987.654.321-00", "CRM-5678", dermatologia);

        try {
            Date diaMedico1 = sdf.parse("01/11/2024");
            Date diaMedico2 = sdf.parse("02/11/2024");

            // Adicionando horários para os médicos
            medico1.adicionarHorario(diaMedico1, "09:00", "09:30");
            medico1.adicionarHorario(diaMedico1, "10:00", "10:30");
            medico1.adicionarHorario(diaMedico1, "10:30", "11:00");
            medico1.adicionarHorario(diaMedico1, "14:00", "14:30");

            // Liberar horário do médico
            medico1.liberarHorario(diaMedico1, "09:00", "09:30");
            
            medico2.adicionarHorario(diaMedico2, "09:00", "09:30");
            medico2.adicionarHorario(diaMedico2, "10:00", "10:30");
            medico2.adicionarHorario(diaMedico2, "15:00", "15:30");
            medico2.adicionarHorario(diaMedico2, "16:00", "16:30");
            
        } catch (ParseException e) {
            System.out.println("Erro ao analisar a data.");
        }
        
        // Adicionar médicos às especialidades
        cardiologia.adicionarMedico(medico1);
        dermatologia.adicionarMedico(medico2);
        
        // Inicialização das listas
        List<Especialidade> especialidades = new ArrayList<>();
        especialidades.add(cardiologia);
        especialidades.add(dermatologia);

        // Lista de agendamentos
        // List<Agendamento> agendamentos = new ArrayList<>();

        // Escolha da especialidade pelo paciente
        System.out.println("Escolha uma especialidade:");
        for (int i = 0; i < especialidades.size(); i++) {
            System.out.println((i + 1) + ". " + especialidades.get(i).getNome());
        }

        int escolhaEspecialidade = -1;
        while (escolhaEspecialidade < 1 || escolhaEspecialidade > especialidades.size()) {
            System.out.print("Digite o número correspondente à especialidade: ");
            try {
                escolhaEspecialidade = Integer.parseInt(scanner.nextLine());
                if (escolhaEspecialidade < 1 || escolhaEspecialidade > especialidades.size()) {
                    System.out.println("Escolha inválida. Por favor, escolha um número válido.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
            }
        }

        // Selecionar a especialidade escolhida
        Especialidade especialidadeEscolhida = especialidades.get(escolhaEspecialidade - 1);

        // Exibir médicos e horários disponíveis na especialidade escolhida
        System.out.println("Médicos e horários disponíveis para a especialidade " + especialidadeEscolhida.getNome() + ":");
        List<Medico> medicos = especialidadeEscolhida.listarMedicos();
        for (int i = 0; i < medicos.size(); i++) {
            Medico medico = medicos.get(i);
            System.out.println((i + 1) + ". " + medico.getNome() + " - Horários:");
            medico.getAgenda().getHorariosPorDia().forEach((dia, horarios) -> {
                System.out.println("   " + sdf.format(dia) + ": " + horarios);
            });
        }

        int escolhaMedico = -1;
        while (escolhaMedico < 1 || escolhaMedico > medicos.size()) {
            System.out.print("Digite o número correspondente ao médico: ");
            try {
                escolhaMedico = Integer.parseInt(scanner.nextLine());
                if (escolhaMedico < 1 || escolhaMedico > medicos.size()) {
                    System.out.println("Escolha inválida. Por favor, escolha um número válido.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
            }
        }

        // Selecionar o médico escolhido
        Medico medicoEscolhido = medicos.get(escolhaMedico - 1);

        // Exibir dias com horários disponíveis do médico escolhido
        System.out.println("Dias com horários disponíveis para o Dr(a). " + medicoEscolhido.getNome() + ":");
        medicoEscolhido.getAgenda().getHorariosPorDia().forEach((dia, horarios) -> {
            System.out.println("Data: " + sdf.format(dia));
            System.out.println("Horários: " + horarios);
        });

        // Escolha do dia para agendamento
        Date diaAgendamento = null;
        while (diaAgendamento == null) {
            System.out.println("Escolha a data para o agendamento (dd/MM/yyyy):");
            String dataEscolhida = scanner.nextLine();
            try {
                diaAgendamento = sdf.parse(dataEscolhida);
            } catch (ParseException e) {
                System.out.println("Data inválida. Por favor, use o formato dd/MM/yyyy.");
            }
        }

        // Exibir horários disponíveis do médico na data escolhida
        System.out.println("Horários disponíveis no dia " + sdf.format(diaAgendamento) + ":");
        List<Horario> horariosDisponiveis = medicoEscolhido.getAgenda().getHorariosPorDia().get(diaAgendamento);

        if (horariosDisponiveis == null || horariosDisponiveis.isEmpty()) {
            System.out.println("Não há horários disponíveis nesse dia.");
            scanner.close();
            return;
        }

        for (int i = 0; i < horariosDisponiveis.size(); i++) {
            System.out.println((i + 1) + ". " + horariosDisponiveis.get(i));
        }

        int escolhaHorario = -1;
        while (escolhaHorario < 1 || escolhaHorario > horariosDisponiveis.size()) {
            System.out.print("Escolha um horário: ");
            try {
                escolhaHorario = Integer.parseInt(scanner.nextLine());
                if (escolhaHorario < 1 || escolhaHorario > horariosDisponiveis.size()) {
                    System.out.println("Escolha inválida. Por favor, escolha um número válido.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
            }
        }

        // Reservar o horário escolhido
        Horario horarioEscolhido = horariosDisponiveis.get(escolhaHorario - 1);
        medicoEscolhido.getAgenda().reservarHorario(diaAgendamento, horarioEscolhido);

        // // Criar e adicionar o agendamento à lista
        // Agendamento novoAgendamento = new Agendamento(agendamentos.size() + 1, medicoEscolhido, pacienteEscolhido, diaAgendamento, horarioEscolhido, 100.0);
        // agendamentos.add(novoAgendamento);

        // Confirmação do agendamento
        System.out.println("Horário reservado com sucesso para o paciente: " + pacienteEscolhido.getNome());
        System.out.println("Médico: " + medicoEscolhido.getNome());
        System.out.println("Data: " + sdf.format(diaAgendamento));
        System.out.println("Horário: " + horarioEscolhido);
        scanner.close();
    }
}
