package Laboratório;

import java.util.Calendar;

public class Agendamento {

	private int id;
	private Calendar data;
	private Cliente cliente;
	private int hora;
	private int minuto;
	private Cabelereiro cabelereiro;
	
	public Agendamento (Cliente cliente, Cabelereiro cabelereiro) {
		this.cliente = cliente;
		this.cabelereiro = cabelereiro;
		this.data = Calendar.getInstance();
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public void setHora(int hora) {
		this.hora = hora;
	}
	
	public void setMinuto (int minuto) {
		this.minuto = minuto;
	}
	
	public int getID() {
		return id;
	}
	
	public int getHora() {
		return hora;
	}
	
	public int getMinuto() {
		return minuto;
	}
	
	public Calendar getData() {
		return data;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public Cabelereiro getCabelereiro() {
		return cabelereiro;
	}
}
