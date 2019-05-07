package com.gft.exercicio.cinema.model;

public class Filme {
	private String nome;
	private String diretor;
	private Integer faixaEtaria;

	public Filme(String nome, String diretor, Integer faixaEtaria) {
		super();
		this.nome = nome;
		this.diretor = diretor;
		this.faixaEtaria = faixaEtaria;
	}

	public String getNome() {
		return nome;
	}

	public Integer getFaixaEtaria() {
		return faixaEtaria;
	}

}
