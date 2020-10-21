package utez.edu.mx.servicios.soap;
/*
	Saldaña Espinoza Hector
	4C - UTEZ - DSM
	Aplicaciones Web Orientadas a Servicios
 */
import utez.edu.mx.controlador.PersonaAction;
import utez.edu.mx.persona.PersonaBean;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

@WebService(name="ServicioPersona")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class ServicioPersona {

	@WebMethod(operationName = "consultarPersona")
	public PersonaBean[] consultarPersona(){
		PersonaAction action = new PersonaAction();
		return  action.conultarPersona();
	}

	public static void main(String[] args) {
		System.out.println("¡Iniciando servidor!");
		Endpoint.publish("http://localhost:1300/ServicioPersona",new ServicioPersona());
		System.out.println("¡Servidor iniciado correctamente!");
	}

}
