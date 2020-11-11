package utez.edu.mx.servicio.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/servicio")
public class ServiciosRest {

	//http://localhost:8080/REST002/servicio/saludar
	@GET
	@Path("/saludar")
	@Produces(MediaType.APPLICATION_JSON)
	public String saludar(){
		return ">>¡Hola!<<";
	}

	//PARA RECIBIR UN PARAMETRO CON PathParam
	//http://localhost:8080/REST002/servicio/saludar2/Hector
	@GET
	@Path("/saludar2/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public String saludar2(@PathParam("name") String nombre){
		return "Hola "+nombre;
	}

	//PARA RECIBIR 2 O MÁS PARAMETROS CON PathParam
	//http://localhost:8080/REST002/servicio/saludar3/Hector/2001
	@GET
	@Path("saludar3/{nombre}/{anioNacimiento}")
	@Produces(MediaType.APPLICATION_JSON)
	public String saludar3(@PathParam("nombre") String nombre,@PathParam("anioNacimiento") int anioNacimiento){
		return "Hola  "+ nombre + " para este 2020 tendrás "+(2020-anioNacimiento) + " años";

	}

	//PARA RECIBIR 2 O MÁS PARAMETROS CON QueryParam
	//http://localhost:8080/REST002/servicio/saludar4?nombre=Hector&anio=2001
	@GET
	@Path("/saludar4")
	@Produces(MediaType.APPLICATION_JSON)
	public String saludar4(@QueryParam("nombre") String nombre, @QueryParam("anio") int anio){
		return "Hola  "+ nombre + " para este 2020 tendrás "+(2020-anio) + " años";
	}
}
