package br.com.lojaabc.modelo;

import br.com.lojaabc.lib.PadraoPessoas;

public class Cliente implements PadraoPessoas{
	private String nome;
	private String email;
	private String fone;
	
	
	public Cliente() {
		super();
	}

	public Cliente(String nome, String email, String fone) {
		super();
		this.nome = nome;
		this.email = email;
		this.fone = fone;
	}
	
	public void setAll(String nome, String email, String fone) {
		this.nome = nome;
		this.email = email;
		this.fone = fone;
	}
	
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public String getFone() {
		return fone;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + ", fone=" + fone + "]";
	}

	@Override
	public String getResumo() {
		return nome;
	}
	
	public String exibirDocumentacoes() {
		return null;
	}
	
	
	

}
