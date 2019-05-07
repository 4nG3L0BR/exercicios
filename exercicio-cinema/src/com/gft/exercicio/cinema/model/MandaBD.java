package com.gft.exercicio.cinema.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.gft.exercicio.cinema.exceptions.PoltronaException;

public class MandaBD implements ConexaoMySql {

	private Connection conexao;

	public MandaBD() throws SQLException {
		conexao = ConnectionMySql.getConnection();
	}
	@Override
	public void create(Cliente cliente, Poltrona poltrona) throws SQLException {
		String sql = "INSERT INTO CLIENTES (nome,idade,rg,num_poltrona) VALUES (?, ?, ?, ?);";
		PreparedStatement ps = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		ps.setString(1, cliente.getNome());
		ps.setInt(2, cliente.getIdade());
		ps.setString(3, cliente.getRg());
		ps.setInt(4, poltrona.getIdentificador());
		

		ps.execute();

	}

	public List<Poltrona> exibirPoltronasReservadas() throws SQLException, PoltronaException {
		String sql = "SELECT * FROM CLIENTES";
		PreparedStatement ps = conexao.prepareStatement(sql);
		ResultSet result = ps.executeQuery();
		List<Poltrona> poltList = new ArrayList<>();
		while (result.next()) {
			Integer idenfificador = result.getInt("num_poltrona");
			poltList.add(new Poltrona(null, idenfificador));
		}
		return poltList;
	}
}
