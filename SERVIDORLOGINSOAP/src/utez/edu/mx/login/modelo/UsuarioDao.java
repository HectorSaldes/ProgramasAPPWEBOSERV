package utez.edu.mx.login.modelo;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDao {

	public boolean consultarLoginUsuario(String usuario, String contrasena) {
		boolean resultado  = false;
		UsuarioBean us1 = new UsuarioBean("Reynel", "Flores Brito", "reynel", "123");
		UsuarioBean us2 = new UsuarioBean("Angel", "Rivera Perez", "admin", "123");
		UsuarioBean us3 = new UsuarioBean("Jose", "Gomez Santillan", "elpepe", "123");
		List<UsuarioBean> lista = new ArrayList<UsuarioBean>();
		lista.add(us1);
		lista.add(us2);
		lista.add(us3);
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getUsuario().equals(usuario) && lista.get(i).getContrasena().equals(contrasena)){
				resultado = true;
				break;
			}
		}
		return resultado;
	}
}
