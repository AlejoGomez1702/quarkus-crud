package org.davivienda;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/temperaturas")
public class TemperaturasResource 
{
	
	private TemperaturaService temperaturaService;
	
	@Inject
	public TemperaturasResource( TemperaturaService temperaturaService ) 
	{
		this.temperaturaService = temperaturaService;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Temperatura> list()
	{
		return this.temperaturaService.obtenerTemperaturas();
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Temperatura saveTemperatura( Temperatura temperatura )
	{
		this.temperaturaService.addTemperatura(temperatura);
		return temperatura;
	}
		
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("one")
	public Temperatura medicion()
	{
		return new Temperatura("Malga", 18, 28);
	}
	
	@GET
	@Path("/isEmpty")
	@Produces(MediaType.TEXT_PLAIN)
	public Response isEmpty()
	{
		boolean isEmpty = this.temperaturaService.obtenerTemperaturas().isEmpty();
		
		if(isEmpty)
		{
			return Response.status(404).entity("No hay temperaturas").build();
		}
		
		return Response.ok("Si hay temperaturas").header("x-message", "message").build();
	}

}
