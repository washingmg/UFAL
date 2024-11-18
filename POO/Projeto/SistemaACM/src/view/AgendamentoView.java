package view;

import model.Horario;
import model.Medico;
import model.Paciente;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import controller.singleton.AgendamentoController;

public class AgendamentoView {
    private AgendamentoController controller;
    private Scanner scanner;

    public AgendamentoView(AgendamentoController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("[1]. Agendar consulta");
            System.out.println("[2]. Adicionar médico");
            System.out.println("[3]. Adicionar paciente");
            System.out.println("[4]. Listar médicos");
            System.out.println("[5]. Listar pacientes");
            System.out.println("[6]. Cancelar agendamento");
            System.out.println("[7]. Listar agendamentos");
            System.out.println("[8]. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    agendarConsulta();
                    break;
                case 2:
                    adicionarMedico();
                    break;
                case 3:
                    adicionarPaciente();
                    break;
                case 4:
                    listarMedicos();
                    break;
                case 5:
                    listarPacientes();
                    break;
                case 6:
                    cancelarAgendamento();
                    break;
                case 7:
                    listarAgendamentos();
                    break;
                case 8:
                    System.out.println("Sistema encerrado.");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private void adicionarMedico() {
        System.out.print("Digite o nome do médico: ");
        String nomeMedico = scanner.nextLine();
    
        System.out.print("Digite o CPF do médico: ");
        String cpfMedico = scanner.nextLine();
    
        System.out.print("Digite a especialidade do médico: ");
        String especialidade = scanner.nextLine();
    
        System.out.print("Digite o valor da consulta: ");
        double valorConsulta = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha
    
        // Pergunta o número de dias
        System.out.print("Quantos dias de atendimento deseja adicionar? ");
        int numDias = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha
    
        // Mapa para associar cada dia com seus horários
        Map<String, List<String>> diasEHorarios = new HashMap<>();
    
        for (int i = 1; i <= numDias; i++) {
            System.out.printf("Digite o dia %d no formato dd/MM/aaaa: ", i);
            String dia = scanner.nextLine();
    
            List<String> horarios = new ArrayList<>();
            System.out.println("Digite os horários para este dia (exemplo: 08:00 - 08:40). Digite 'fim' para terminar.");
            while (true) {
                String horario = scanner.nextLine();
                if (horario.equalsIgnoreCase("fim")) {
                    break;
                }
                horarios.add(horario); // Adiciona os horários à lista
            }
    
            diasEHorarios.put(dia, horarios); // Associa o dia à lista de horários
        }
    
        // Chama o método do controlador (assumindo que foi modificado para aceitar o mapa)
        AgendamentoController.getInstance().adicionarMedico(nomeMedico, cpfMedico, especialidade, valorConsulta, diasEHorarios);
        System.out.println("Médico adicionado com sucesso!");
    }
    
    

    private void listarMedicos() {
        List<Medico> medicos = controller.listarMedicos();
        if (medicos != null && !medicos.isEmpty()) {
            for (Medico medico : medicos) {
                System.out.println("\nMédico: " + medico.getNome() + 
                                ", Especialidade: " + medico.getEspecialidade() + 
                                ", Valor consulta: " + medico.getValorConsulta() + "\n");
                
                // Agrupando horários por data
                Map<String, List<String>> horariosPorDia = new HashMap<>();
                
                for (Horario horario : medico.getHorarios()) {
                    if (!horario.isOcupado()) {
                        String dataFormatada = horario.getFormattedDate(); // Obtém a data formatada
                        if (!horariosPorDia.containsKey(dataFormatada)) {
                            horariosPorDia.put(dataFormatada, new ArrayList<>());
                        }
                        horariosPorDia.get(dataFormatada).add(horario.getHora());
                    }
                }

                // Exibindo os horários agrupados por data
                for (Map.Entry<String, List<String>> entry : horariosPorDia.entrySet()) {
                    System.out.println("\tDia: " + entry.getKey());
                    for (String hora : entry.getValue()) {
                        System.out.println("\t\tHorário: " + hora);
                    }
                }
            }
        } else {
            System.out.println("Lista de médicos está vazia ou nula.");
        }
    }

    private void listarPacientes() {
        List<Paciente> pacientes = controller.listarPacientes();
        if (pacientes != null && !pacientes.isEmpty()) {
            for (Paciente paciente : pacientes) {
                System.out.println("Paciente: " + paciente.getNome() + ", CPF: " + paciente.getCpf());
            }
        } else {
            System.out.println("Lista de pacientes está vazia ou nula");
        }
    }

    private void adicionarPaciente() {
        System.out.print("Digite o nome do paciente: ");
        String nomePaciente = scanner.nextLine();

        System.out.print("Digite o CPF do paciente: ");
        String cpfPaciente = scanner.nextLine();

        controller.adicionarPaciente(nomePaciente, cpfPaciente);
        System.out.println("Paciente adicionado com sucesso!");
    }

    private void agendarConsulta() {
        listarPacientes();
        System.out.print("Digite o nome do paciente: ");
        String nomePaciente = scanner.nextLine();

        listarMedicos();
        System.out.print("Digite o nome do médico: ");
        String nomeMedico = scanner.nextLine();

        System.out.print("Digite a especialidade desejada: ");
        String especialidade = scanner.nextLine();

        // Adicionando a solicitação de data
        System.out.print("Digite a data desejada (dd/MM/yyyy): ");
        String dataEscolhida = scanner.nextLine();

        // Verificando se a data tem o formato correto
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date data = null;
        try {
            data = sdf.parse(dataEscolhida); // Convertendo a string para um objeto Date
        } catch (ParseException e) {
            System.out.println("Data inválida. Por favor, use o formato dd/MM/yyyy.");
            return; // Retorna e interrompe o método em caso de erro
        }

        System.out.print("Digite o horário desejado (HH:mm - HH:mm): ");
        String horarioEscolhido = scanner.nextLine();

        // Agora passando a data e o horário no agendamento
        String resultadoAgendamento = controller.agendarConsulta(nomePaciente, especialidade, data, horarioEscolhido, nomeMedico);
        System.out.println(resultadoAgendamento);
    }

    private void cancelarAgendamento() {
        
        listarAgendamentos();
        
        System.out.print("Digite o nome do paciente: ");
        String nomePaciente = scanner.nextLine();

        System.out.print("Digite o nome do médico: ");
        String nomeMedico = scanner.nextLine();

        System.out.print("Digite a data do agendamento a ser cancelado (dd/MM/yyyy): ");
        String dataEscolhida = scanner.nextLine();
        
        System.out.print("Digite o horário do agendamento a ser cancelado (HH:mm): ");
        String horarioEscolhido = scanner.nextLine();
        
        
        Date data = null;
        try {
        	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            data = sdf.parse(dataEscolhida); 
        } catch (ParseException e) {
            System.out.println("Data inválida. Por favor, use o formato dd/MM/yyyy.");
            return; // Retorna e interrompe o método em caso de erro
        }
        
        String resultado = controller.cancelarAgendamento(nomePaciente, nomeMedico, horarioEscolhido, data);
        System.out.println(resultado);
    }

    public void listarAgendamentos() {
        List<String> agendamentos = controller.listarAgendamentos();  
        if (agendamentos.isEmpty()) {
            System.out.println("\nNão há agendamentos realizados." + "\n");

        } else {
            System.out.println("Lista de agendamentos:");
            for (String agendamento : agendamentos) {
                System.out.println(agendamento);
            }
        }
    }
}
