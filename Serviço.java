package Laboratório;

public class Serviço {
	
	private int id;
	private String nome;
	private double valor;
	private String descrição;
	
	public void setID (int id) {
		if (id > 0) {
			this.id = id;
		}
	}
	
	public void setNome (String nome) {
		if (nome.length() >= 5) {
			this.nome = nome;
		}
	}
	
	public void setValor (double valor) {
		if (valor > 0) {
			this.valor = valor;
		}
	}
	
	public void setDescrição (String descrição) {
		if (descrição.length() >= 10) {
			this.descrição = descrição;
		}
	}
	
	public int getID(){
		return this.id;
	}
	
	public String getNome () {
		return this.nome;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public String getDescrição () {
		return this.descrição;
	}
}
