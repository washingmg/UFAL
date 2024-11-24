package view;

import java.util.List;
import java.util.Scanner;

//note que a VIEW não precisa conhecer a CLASSE do controller, apenas a INTERFACE
import controller.ISistemaAgenda;
import model.Agenda;
import model.Contato;

public class TelaTextual {

	private ISistemaAgenda sistemaAgenda;
	
	public TelaTextual(ISistemaAgenda sistemaAgenda) {
		this.sistemaAgenda = sistemaAgenda;
	}
	
	
	public void exibir(String mensagemErro) {
		this.limparTela();
		this.listarAgendas();
		this.mostrarMenu();
		if(mensagemErro != null) {
			System.err.println(mensagemErro);
		}
		String opcao = this.lerTeclado("Escolha uma opção: ");
		switch (opcao) {
		case "0":
			this.sair();
			break;
		case "1":
			System.err.println("Mostrar UMA Agenda:");
			String codigoAgStr = this.lerTeclado("Digite o código da agenda: ");
			int codigoAg = Integer.parseInt(codigoAgStr);
			Agenda agenda = this.sistemaAgenda.obterAgenda(codigoAg);
			this.detalharAgenda(agenda);
			break;
		case "2":
			System.err.println("Mostrar Contato da agenda:");
			codigoAgStr = this.lerTeclado("Digite o código da agenda: ");
			codigoAg = Integer.parseInt(codigoAgStr);
			String codigoContStr = this.lerTeclado("Digite o código do contato: ");
			int codigoCont = Integer.parseInt(codigoContStr);
			Contato contato = this.sistemaAgenda.obterContato(codigoAg, codigoCont);
			this.detalharContato(contato);
			break;
		case "3":
			System.err.println("Criar NOVA Agenda:");
			codigoAgStr = this.lerTeclado("Digite o código da agenda: ");
			String nomeAgStr = this.lerTeclado("Digite o nome da agenda: ");
			codigoAg = Integer.parseInt(codigoAgStr);
			this.sistemaAgenda.adicionarOuReiniciarAgenda(codigoAg, nomeAgStr);
			break;
			
		case "4":
			System.err.println("REMOVER Agenda:");
			codigoAgStr = this.lerTeclado("Digite o código da agenda: ");
			codigoAg = Integer.parseInt(codigoAgStr);
			this.sistemaAgenda.apagarAgenda(codigoAg);
			break;
		case "5":
			System.err.println("Adicionar CONTATO na agenda:");
			codigoAgStr = this.lerTeclado("Digite o código da agenda: ");
			codigoAg = Integer.parseInt(codigoAgStr);
			codigoContStr = this.lerTeclado("Digite o código do CONTATO: ");
			codigoCont = Integer.parseInt(codigoContStr);
			String nomeContStr = this.lerTeclado("Digite o NOME do contato: ");
			String foneContStr = this.lerTeclado("Digite o TELEFONE do contato: ");
			String emailContStr = this.lerTeclado("Digite o EMAIL do contato: ");
			Contato novoContato = new Contato(codigoCont, nomeContStr, foneContStr, emailContStr);
			this.sistemaAgenda.adicionarOuAtualizarContato(codigoAg, novoContato);
			break;
		case "6":
			System.err.println("Remover CONTATO da agenda:");
			codigoAgStr = this.lerTeclado("Digite o código da agenda: ");
			codigoAg = Integer.parseInt(codigoAgStr);
			codigoContStr = this.lerTeclado("Digite o código do contato: ");
			codigoCont = Integer.parseInt(codigoContStr);
			this.sistemaAgenda.removerContato(codigoAg, codigoCont);
			break;

		default:
			exibir("Opção indisponível! Favor escolher outra opção.");
			break;
		}
		System.err.println("Pressione ENTER para continuar");
		this.lerTeclado(null);
		exibir(null);
	}
	
	
	
	private void mostrarMenu() {
		System.err.println("-----------------------");
		System.out.println("MENU DO SISTEMA:");
		System.err.println("-----------------------");
		System.out.println("0-SAIR");
		System.out.println("1-Mostrar UMA agenda");
		System.out.println("2-Mostrar Contato da agenda");
		System.out.println("3-Criar NOVA agenda");
		System.out.println("4-REMOVER agenda");
		System.out.println("5-Adicionar CONTATO na agenda");
		System.out.println("6-Remover CONTATO da agenda");
		System.err.println("-----------------------");
	}
	
	private String lerTeclado(String mensagem) {
		Scanner input = new Scanner(System.in);
		if(mensagem != null)
		System.out.println(mensagem);
		String textoLido = input.nextLine();
		input.close();
		
		return textoLido;
	}
	
	private void sair() {
		this.limparTela();
		System.out.println("Até a próxima!");
		System.exit(0);
	}
	
	private void limparTela(){
		for(int i = 0; i <= 20; i++){
            System.out.println();
		}
	}
	
	private void listarAgendas() {
		List<Agenda> agendas = this.sistemaAgenda.obterAgendas();
		if(agendas != null  &&  agendas.size()>0) {
			System.err.println("AGENDAS CADASTRADAS:");
			for(Agenda agenda : agendas) {
				System.out.println("    " + agenda.getCodigo() + " => " + agenda.getNome() + " (" + agenda.getContatos().size() + " contatos)");
			}
		}
		else {
			System.err.println("Não há agendas cadastradas:");
		}
	}
	
	private void detalharAgenda(Agenda agenda) {
		if(agenda == null) {
			System.err.println("Agenda INVÁLIDA!");
		}
		else {
			System.out.println("AGENDA: " + agenda.getCodigo() + " => " + agenda.getNome() + " (" + agenda.getContatos().size() + " contatos):");
			if(agenda.getContatos()!=null  &&  agenda.getContatos().size()>0) {
				for(Contato contato: agenda.getContatos()) {
					System.out.println("    " + contato.getCodigo() + " => " + contato.getNome());
				}
			}
		}
	}
	
	private void detalharContato(Contato contato) {
		if(contato == null) {
			System.err.println("Contato INVÁLIDO!");
		}
		else {
			System.out.println("CONTATO: " + contato.getCodigo() + " => " + contato.getNome()+":");
			System.out.println("   "+contato.getTelefone());
			System.out.println("   "+contato.getEmail());
		}
	}
}
