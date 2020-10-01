package utez.edu.mx.github.controlador;

import utez.edu.mx.github.modelo.UsuarioBean;
import utez.edu.mx.github.modelo.UsuarioDao;

public class UsuarioAction {
	public String servicioConsultarUsuario(String usuario, String contraseña) {
		UsuarioBean bean = new UsuarioBean();
		UsuarioDao dao = new UsuarioDao();
		bean.setUsuario(usuario);
		bean.setContraseña(contraseña);
		String resultado = dao.consultarUsuario(bean);
		if(resultado!=null){
			return "\tInicio de Sesión Correctamente\n\tBienvenido: "+resultado;
		}else{
			return "\tInicio de Sesión Incorrectamente\n\tVerifique sus datos e intente de nuevo";
		}
	}
}
