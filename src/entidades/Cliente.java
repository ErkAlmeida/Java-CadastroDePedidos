package entidades;

import java.util.Date;

public class Cliente {

	private String nome;
	private String email;
	private Date nascData;

	public Cliente() {

	}

	public Cliente(String nome, String email, Date nascData) {
		this.nome = nome;
		this.email = email;
		this.nascData = nascData;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getNascData() {
		return nascData;
	}

	public void setNascData(Date nascData) {
		this.nascData = nascData;
	}

}
