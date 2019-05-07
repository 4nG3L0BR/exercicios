package com.gft.exercicio.cinema.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMySql {
	private static final String URL = "jdbc:mysql://localhost:3306/cinema?useTimezone=true&serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASS = "root";

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASS);
	}

}