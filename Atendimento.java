package Laboratório;

import java.util.Calendar;

public class Atendimento {

	private Cliente cliente;
	private Calendar data;
	private Serviço servico[];
	private Cabelereiro cabelereiro;
	
	public Atendimento (Cliente cliente) {
		this.cliente = cliente;
		this.data = Calendar.getInstance();
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public Calendar getData() {
		return data;
	}
	
	public Serviço[] getServico(){
		return servico;
	}
	
	public void setServico(Serviço[] servico) {
		this.servico = servico;
	}
	
	public Cabelereiro getCabelereiro() {
		return cabelereiro;
	}

	public void setCabelereiro(Cabelereiro cabelereiro) {
		this.cabelereiro = cabelereiro;
	}
}
