package utez.edu.mx.servicio.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//http://localhost:8080/MiPrimerApp_REST_war/serviciorest/saludar   asi quedaria para que jale

// accederemos con este nombre ne la URL a esta clase y sus métodos
@Path("/serviciorest") //no es necesarioq que se llame como la clase
public class ServicioRest {


	//ARRIBA DEL METODO AGREGAR ESTAS 3 @
	@GET //porque metodo GET o POST
	@Path("/saludar") //no es necesarioq que se llame como el metodo
	@Produces(MediaType.APPLICATION_JSON) // decirle el tipo por el cual regresara la respuesta JSON
	public String holaMundoRest(){
		return "Hola Mundo REST";
	}

	@GET
	@Path("/sumar")
	@Produces(MediaType.APPLICATION_JSON)
	public double suma(){
		return (20.5+2.5);
	}

}
