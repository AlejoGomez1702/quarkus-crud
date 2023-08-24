package org.davivienda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TemperaturaService 
{
	private List<Temperatura> listado = new ArrayList<>();
	
	public void addTemperatura( Temperatura t )
	{
		this.listado.add(t);
	}
	
	public List<Temperatura> obtenerTemperaturas()
	{
		return Collections.unmodifiableList(this.listado);
	}

}
