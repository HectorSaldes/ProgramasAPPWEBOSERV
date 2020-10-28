package subes.servicioweb.renapo;

import utez.edu.mx.renapo.servicios.web.ServicioCurp;
import utez.edu.mx.renapo.servicios.web.ServicioCurpService;

public class ClienteRenapo {

	public String consultarCurpRenapoServer(String nombre,String primerApellido,String segundoApellido,String estado,int edad){
		ServicioCurpService servicio = new ServicioCurpService();
		ServicioCurp puerto = servicio.getServicioCurpPort();
		return puerto.consultarCURPRenapo(nombre, primerApellido, segundoApellido, estado, edad);
	}

}
