package utez.edu.mx.servicio;

import utez.edu.mx.login.controlador.LoginAction;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

@WebService(name = "ServidorLogin")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class ServidorLogin {

	@WebMethod (operationName = "login")
	public boolean login(@WebParam String usuario, @WebParam String contrasena){
		LoginAction action = new LoginAction();
		return action.login(usuario, contrasena);
	}

	public static void main(String[] args) {
		System.out.println("¡INICIANDO SERVIDOR...");
		Endpoint.publish("http://localhost:1300/ServidorLogin",new ServidorLogin());
		System.out.println("...SERVIDOR INICIADO!");
	}

}
