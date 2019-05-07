package com.gft.exercicio.cinema.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.gft.exercicio.cinema.exceptions.*;

public class SalaCinema {

	private Integer quantidadePoltrona;
	private Filme filme;
	List<Poltrona> poltronasReservadas = new ArrayList<Poltrona>();

	public SalaCinema(Integer quantidadePoltrona, Filme filme) {
		this.quantidadePoltrona = quantidadePoltrona;
		this.filme = filme;

	}

	public final void reservarPoltrona(Poltrona p) throws SQLException {
		MandaBD dao = new MandaBD();
		quantidadePoltrona--;
		poltronasReservadas.add(p);
		dao.create(p.getCliente(), p);
	}

	public final void exibirPoltronasReservadas() throws SQLException, PoltronaException{
		MandaBD dao = new MandaBD();
		System.out.println("===================================");

		poltronasReservadas = dao.exibirPoltronasReservadas();
		System.out.println("POLTRONAS JÁ RESERVADAS\n");
		for (Poltrona p : poltronasReservadas) {
			System.out.println(p);
		}
		System.out.println("===================================");

	}

	public Integer getQuantidadePoltrona() {
		return quantidadePoltrona;
	}

	public Filme getFilme() {
		return filme;
	}

	public List<Poltrona> getPoltronasReservadas() {
		return poltronasReservadas;
	}

	public void validaPoltrona(Poltrona p) throws PoltronaException {

		if (p.getIdentificador() < 0 || p.getIdentificador() > quantidadePoltrona || poltronasReservadas.contains(p)) {
			throw new PoltronaException();
		}

	}

	public void validaFaixa(Cliente cliente) throws IdadException {
		if (cliente.getIdade() < this.filme.getFaixaEtaria()) {
			throw new IdadException();
		} else if (this.filme.getFaixaEtaria() != 0) {
			Scanner ler = new Scanner(System.in);
			System.out.println("POR FAVOR ENTRE COM O SEU RG: ");
			cliente.setRg(ler.next());

		}

	}

}
