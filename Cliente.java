package Laboratório;

public class Cliente {

	private int id;
	private String nome;
	private String cpf;
	
	public Cliente (String cpf) {
		this.cpf = cpf;
	}
	
	public void setID (int id) {
		if (id > 0) {
			this.id = id;
		}
	}
	
	public void setNome (String nome) {
		if (nome.length() > 2) {
			this.nome = nome;
		}
	}
	
	public void setCPF (String cpf) {
		if (cpf.length() > 0) {
			this.cpf = cpf;
		}
	}
	
	public int getID(){
		return this.id;
	}
	
	public String getNome () {
		return this.nome;
	}
	
	public String getCPF() {
		return this.cpf;
	}
}
