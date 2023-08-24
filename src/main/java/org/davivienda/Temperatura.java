package org.davivienda;

import java.util.Objects;

public class Temperatura 
{
	private String ciudad;
	private int temperaturaMinima;
	private int temperaturaMaxima;
	
	public Temperatura() {
		// TODO Auto-generated constructor stub
	}

	public Temperatura(String ciudad, int temperaturaMinima, int temperaturaMaxima) {
		super();
		this.ciudad = ciudad;
		this.temperaturaMinima = temperaturaMinima;
		this.temperaturaMaxima = temperaturaMaxima;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getTemperaturaMinima() {
		return temperaturaMinima;
	}

	public void setTemperaturaMinima(int temperaturaMinima) {
		this.temperaturaMinima = temperaturaMinima;
	}

	public int getTemperaturaMaxima() {
		return temperaturaMaxima;
	}

	public void setTemperaturaMaxima(int temperaturaMaxima) {
		this.temperaturaMaxima = temperaturaMaxima;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ciudad, temperaturaMaxima, temperaturaMinima);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Temperatura other = (Temperatura) obj;
		return Objects.equals(ciudad, other.ciudad) && temperaturaMaxima == other.temperaturaMaxima
				&& temperaturaMinima == other.temperaturaMinima;
	}

	@Override
	public String toString() {
		return "Temperatura [ciudad=" + ciudad + ", temperaturaMinima=" + temperaturaMinima + ", temperaturaMaxima="
				+ temperaturaMaxima + "]";
	}
}
