package com.gft.exercicio.cinema.teste;

import java.sql.Connection;
import java.util.Scanner;
import com.gft.exercicio.cinema.model.Cliente;
import com.gft.exercicio.cinema.model.ConnectionMySql;
import com.gft.exercicio.cinema.model.Filme;
import com.gft.exercicio.cinema.model.Poltrona;

import com.gft.exercicio.cinema.model.SalaCinema;

public class TesteSalaCinema {
	public static void main(String[] args) throws Exception {

		Connection conexao = ConnectionMySql.getConnection();

		Filme ultimato = new Filme("Avengers: End Game", "Irmãos Russo", 12);
		SalaCinema sala1 = new SalaCinema(100, ultimato);
		Cliente cliente1 = new Cliente(null, null, null);
		Cliente angelo = new Cliente("Angelo", 15, "358741269");
		Poltrona polt1 = new Poltrona(null, null);
		Poltrona polt2 = new Poltrona(angelo, 76);
		Poltrona polt3 = new Poltrona(angelo, 58);
		Poltrona polt4 = new Poltrona(angelo, 79);
		Poltrona polt5 = new Poltrona(angelo, 15);
		Poltrona polt6 = new Poltrona(angelo, 35);
		String fim = "s";
		Scanner scan = new Scanner(System.in);
//		sala1.reservarPoltrona(polt2);
//		sala1.reservarPoltrona(polt3);
//		sala1.reservarPoltrona(polt4);
//		sala1.reservarPoltrona(polt5);
//		sala1.reservarPoltrona(polt6);
		try {
			System.out.println("BEM VINDO AO CINEMA");
			System.out.println("O filme que está passando no momento é: " + sala1.getFilme().getNome() + ".");
			System.out.println("No momento temos disponível para essa sessão um total de: "
					+ sala1.getQuantidadePoltrona() + " poltrona(s).");
			System.out.print("Qual o seu nome ? ");
			cliente1.setNome(scan.next());
			cliente1.validaNome(cliente1);

			System.out.print("Olá " + cliente1.getNome() + " , qual a sua idade?");
			cliente1.setIdade(scan.nextInt());
			sala1.validaFaixa(cliente1);
			polt1.setCliente(cliente1);
			while (fim.equals("s")){
				sala1.exibirPoltronasReservadas();
				System.out.print("Qual o número da poltrona deseja escolher? ");
				polt1.setIdentificador(scan.nextInt());
				sala1.validaPoltrona(polt1);
				sala1.reservarPoltrona(polt1);
				System.out.print("Deseja escolher outra poltrona? (s/n)");
				fim = scan.next();
			}
			System.out.println("Pode retirar seu ticket e boa sessão :)");	
				

		} catch (Exception e) {

		} finally {
			scan.close();
			conexao.close();
		}

	}
}
