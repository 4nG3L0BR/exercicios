package com.gft.exercicio.cinema.model;
import java.sql.SQLException;
import java.util.List;

import com.gft.exercicio.cinema.exceptions.PoltronaException;

public interface ConexaoMySql {

	public void create(Cliente cliente, Poltrona poltrona) throws SQLException;
	public List<Poltrona> exibirPoltronasReservadas() throws SQLException, PoltronaException;
}
