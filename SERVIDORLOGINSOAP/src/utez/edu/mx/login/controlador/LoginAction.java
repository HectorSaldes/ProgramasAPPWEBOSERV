package utez.edu.mx.login.controlador;

import utez.edu.mx.login.modelo.UsuarioBean;
import utez.edu.mx.login.modelo.UsuarioDao;

public class LoginAction {

	public boolean login(String usuario, String contrasena){
		UsuarioDao dao = new UsuarioDao();
		UsuarioBean bean = new UsuarioBean(usuario, contrasena);
		return dao.consultarLoginUsuario(bean);
	}

}
