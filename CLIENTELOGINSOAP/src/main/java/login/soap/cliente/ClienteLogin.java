package login.soap.cliente;

import utez.edu.mx.servicio.ServidorLogin;
import utez.edu.mx.servicio.ServidorLoginService;

public class ClienteLogin {
	public boolean loginCliente(String usuario, String contrasena) {
		ServidorLoginService servicio = new ServidorLoginService();
		ServidorLogin puerto = servicio.getServidorLoginPort();
		return puerto.login(usuario, contrasena);
	}
}
