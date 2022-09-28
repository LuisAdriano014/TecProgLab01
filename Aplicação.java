package Laboratório;

import java.util.Scanner;

public class Aplicação {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("06051785230");
		Cliente c2 = new Cliente("06051785042");
		Cliente c3 = new Cliente("08563205287");
		
		Cabelereiro cab1 = new Cabelereiro("75841632920", "Joaquim");
		Cabelereiro cab2 = new Cabelereiro("06005245042", "Junim");
		Cabelereiro cab3 = new Cabelereiro("08545244287", "Pedro");
		
		Serviço servico1 = new Serviço();
		Serviço servico2 = new Serviço();
		Serviço servico3 = new Serviço();
		
		Atendimento atendimento1 = new Atendimento (c1);
		Atendimento atendimento2 = new Atendimento (c2);
		Atendimento atendimento3 = new Atendimento (c3);
		
		Agendamento agendamento1 = new Agendamento (c1, cab1);
		Agendamento agendamento2 = new Agendamento (c2, cab2);
		Agendamento agendamento3 = new Agendamento (c3, cab3);
		
		System.out.println("------------ REGISTRAR CLIENTE ------------");
		
		Cliente clientemain = cadastrarCliente();
		
		System.out.println("------------ REGISTRAR CABELEREIRO ------------");
		
		Cabelereiro cabelereiromain = cadastrarCabelereiro();
		
		System.out.println("------------ REGISTRAR SERVIÇO ------------");
		
		Serviço servicomain = cadastrarServiço();
		
		System.out.println("------------ REGISTRAR AGENDAMENTO ------------");
		
		Agendamento agendamentomain = cadastrarAgendamento(clientemain, cabelereiromain);
		
		System.out.println("------------ REGISTRAR AGENDAMENTO ------------");
		
		Atendimento atendimentomain = cadastrarAtendimento(clientemain, cabelereiromain);
		
		System.out.println("------------ INFORMAÇÕES DO CLIENTE ------------");
		
		System.out.println("ID do cliente: " + clientemain.getID());
		System.out.println("Nome do cliente: " + clientemain.getNome());
		System.out.println("CPF do cliente: " + clientemain.getCPF());
		
		System.out.println("------------ INFORMAÇÕES DO CABELEREIRO ------------");
		
		System.out.println("ID do cabelereiro: " + cabelereiromain.getID());
		System.out.println("Nome do cabelereiro: " + cabelereiromain.getNome());
		System.out.println("CPF do cabelereiro: " + cabelereiromain.getCPF());
		
		System.out.println("------------ INFORMAÇÕES DO SERVIÇO ------------");
		
		System.out.println("Id do Serviço:" + servicomain.getID());
		System.out.println("Nome do Serviço:" + servicomain.getNome());
		System.out.println("Descrição do Serviço:" + servicomain.getDescrição());
		System.out.println("Valor do Serviço:" + servicomain.getValor());
		
		System.out.println("------------ INFORMAÇÕES DE AGENDAMENTO ------------");
		
		System.out.println("Id do Agendamento:" + agendamentomain.getID());
		System.out.println("Data do Agendamento:" + agendamentomain.getData());
		System.out.println("Hora do Agendamento:" + agendamentomain.getHora());
		System.out.println("Minuto do Agendamento:" + agendamentomain.getMinuto());
		System.out.println("Id do Cliente:" + agendamentomain.getCliente().getID());
		System.out.println("Nome do Cliente:" + agendamentomain.getCliente().getNome());
		System.out.println("CPF do Cliente:" + agendamentomain.getCliente().getCPF());
		System.out.println("Id do Cabeleireiro:" + agendamentomain.getCabelereiro().getID());
		System.out.println("Nome do Cabeleireiro:" + agendamentomain.getCabelereiro().getNome());
		System.out.println("CPF do Cabeleireiro:" + agendamentomain.getCabelereiro().getCPF());
		
		System.out.println("------------ INFORMAÇÕES DE ATENDIMENTO ------------");
		
		System.out.println("Data do Agendamento:" + atendimentomain.getData());
		System.out.println("Id do Cliente:" + atendimentomain.getCliente().getID());
		System.out.println("Nome do Cliente:" + atendimentomain.getCliente().getNome());
		System.out.println("CPF do Cliente:" + atendimentomain.getCliente().getCPF());
		System.out.println("Id do Cabeleireiro:" + atendimentomain.getCabelereiro().getID());
		System.out.println("Nome do Cabeleireiro:" + atendimentomain.getCabelereiro().getNome());
		System.out.println("CPF do Cabeleireiro:" + atendimentomain.getCabelereiro().getCPF());
		for (int i = 0; i < atendimentomain.getServico().length; i++) {
			System.out.println("Id do Serviço:" + atendimentomain.getServico()[i].getID());
			System.out.println("Nome do Serviço:" + atendimentomain.getServico()[i].getNome());
			System.out.println("Descrição do Serviço:" + atendimentomain.getServico()[i].getDescrição());
			System.out.println("Valor do Serviço:" + atendimentomain.getServico()[i].getValor());
		}
	}
	
	// Dúvidas na aplicação da Data
	// Dúvidas na lista de Atendimento
	
	public static Cliente cadastrarCliente() {
		
		Scanner cliente = new Scanner (System.in);
		
		System.out.println("Informe o CPF do cliente");
		String setCPF = cliente.nextLine();
		
		Cliente cliente0 = new Cliente (setCPF);
		
		System.out.println("Informe o nome do cliente");
		cliente0.setNome(cliente.nextLine());
		
		System.out.println("Informe o ID do cliente");
		cliente0.setID(cliente.nextInt());
		
		return cliente0;
	}

	public static Cabelereiro cadastrarCabelereiro() {
		
		Scanner cabelereiro = new Scanner (System.in);
		
		System.out.println("Informe o CPF do cliente");
		String setCPF = cabelereiro.nextLine();
		
		System.out.println("Informe o nome do cliente");
		String setNome = cabelereiro.nextLine();
		
		Cabelereiro cabelereiro0 = new Cabelereiro (setCPF, setNome);
		
		System.out.println("Informe o ID do cliente");
		cabelereiro0.setID(cabelereiro.nextInt());
		
		return cabelereiro0;
	}
	
	public static Serviço cadastrarServiço() {
		
		Scanner servico = new Scanner(System.in);
		
		Serviço servico0 = new Serviço();
		
		System.out.println("Informe o id do Serviço:");
		servico0.setID(servico.nextInt());
		
		System.out.println("Informe o nome do Serviço:");
		servico0.setNome(servico.nextLine());
		
		System.out.println("Informe a descrição do Serviço:");
		servico0.setDescrição(servico.nextLine());
		
		System.out.println("Informe o valor do Serviço(formato:0.00)");
		servico0.setValor(servico.nextDouble());
		
		return servico0;
	}

	public static Agendamento cadastrarAgendamento(Cliente cliente0, Cabelereiro cabelereiro0) {
			
		Scanner agendamento = new Scanner(System.in);
		
		Agendamento agendamento0 = new Agendamento(cliente0,cabelereiro0);
		
		System.out.println("Informe o ID do Agendamento:");
		agendamento0.setID(agendamento.nextInt());
		
		System.out.println("Informe a hora do Agendamento(apenas a hora):");
		agendamento0.setHora(agendamento.nextInt());
		
		System.out.println("Informe os minutos do Agendamento(apenas os minutos):");
		agendamento0.setMinuto(agendamento.nextInt());
		
		return agendamento0;
	}
	
	public static Atendimento cadastrarAtendimento(Cliente cliente0, Cabelereiro cabelereiro0) {
		
		Atendimento atendimento0 = new Atendimento(cliente0);
		
		atendimento0.setCabelereiro(cabelereiro0);
		
		return atendimento0;
		
	}
}
