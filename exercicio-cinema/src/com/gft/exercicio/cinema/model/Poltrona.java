package com.gft.exercicio.cinema.model;
import com.gft.exercicio.cinema.exceptions.PoltronaException;;

public class Poltrona {
	private Cliente cliente;
	private Integer identificador;

	public Poltrona(Cliente cliente, Integer identificador) throws PoltronaException {
		super();
		this.cliente = cliente;
		this.identificador = identificador;
	}

	public Integer getIdentificador() {
		return identificador;
	}

	public Cliente getCliente() {
		return cliente;
	}

	@Override
	public String toString() {
		return "Poltrona " + identificador;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Poltrona other = (Poltrona) obj;
		if (identificador == null) {
			if (other.identificador != null)
				return false;
		} else if (!identificador.equals(other.identificador))
			return false;
		return true;
	}

}
