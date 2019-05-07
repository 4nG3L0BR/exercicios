package com.gft.exercicio.cinema.model;
import com.gft.exercicio.cinema.exceptions.NomException;;;

public class Cliente {
	private String nome;
	private Integer idade;
	private String rg;

	public Cliente(String nome, Integer idade, String rg) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getRg() {
		return rg;
	}

	public final void validaNome(Cliente cliente) throws NomException {
		if (!cliente.getNome().matches("[a-zà-úA-ZÀ-Ú\\s]*")) {
			throw new NomException();
		}
	}

}
