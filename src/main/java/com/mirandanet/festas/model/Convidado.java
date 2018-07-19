package com.mirandanet.festas.model;

public class Convidado {

	private String nome;
	private Integer quantidadeConvidado;
	
	public Convidado() {
		
	}

	public Convidado(String nome, Integer quantidadeConvidado) {
		this.nome = nome;
		this.quantidadeConvidado = quantidadeConvidado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidadeConvidado() {
		return quantidadeConvidado;
	}

	public void setQuantidadeConvidado(Integer quantidadeConvidado) {
		this.quantidadeConvidado = quantidadeConvidado;
	}
	
	
}
