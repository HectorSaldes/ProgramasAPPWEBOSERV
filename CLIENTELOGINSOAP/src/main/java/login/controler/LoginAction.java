package login.controler;

import login.soap.cliente.ClienteLogin;

public class LoginAction {

//	ESTA CLASE ES LLAMADA EN EL STRUTS.XML PARA EL FORM, DEBEN TENER LOS MISMOS NAME DEL FORM

	private String usuario;
	private String contrasena;
	private String resultado;

	public String login(){
//		ESTE METODO ES LLAMADO EN EL STRUTS.XML, Y ESTE CONSULTA A CLIENTELOGIN PARA VERIFICAR SI EXISTE
		boolean sesion;
		ClienteLogin cliente = new ClienteLogin();
		sesion = cliente.loginCliente(usuario,contrasena);
		if(sesion) {
			resultado = "¡Bienvenido(a)!";
			return "success";
		}else{
			resultado = "Usuario y/o contraseña incorrectos...";
			return "error";
		}

	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
}
