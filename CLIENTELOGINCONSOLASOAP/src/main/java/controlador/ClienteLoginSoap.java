package controlador;

import utez.edu.mx.servicio.ServidorLogin;
import utez.edu.mx.servicio.ServidorLoginService;

public class ClienteLoginSoap {

	public boolean  login(String usuario, String contrasena){
		ServidorLoginService servicio = new ServidorLoginService();
		ServidorLogin puerto = servicio.getServidorLoginPort();
		return puerto.login(usuario, contrasena);
	}
}
