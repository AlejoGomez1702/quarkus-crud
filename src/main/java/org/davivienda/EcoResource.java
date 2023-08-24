 package org.davivienda;

import java.util.Optional;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;

@Path("/saludar")
public class EcoResource 
{
	@GET
	public String saludar( @QueryParam("message")String message )
	{
		return Optional.ofNullable(message)
					   .map(m -> "> " + m)
					   .orElse("No se paso message");
	}
	
	@GET
	@Path("/{nombre}")
	public String saludo( @PathParam("nombre") String nombre )
	{
		return "Hola " + nombre;
	}
	
	@GET
	@Path("/{nombre}/gritar")
	public String gritar( @PathParam("nombre") String nombre )
	{
		return "Hola " + nombre.toUpperCase();
	}
}
