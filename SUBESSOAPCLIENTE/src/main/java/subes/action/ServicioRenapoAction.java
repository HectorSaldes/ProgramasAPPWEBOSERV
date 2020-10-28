package subes.action;

import subes.servicioweb.renapo.ClienteRenapo;

public class ServicioRenapoAction {

	private String resultado;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String estado;
	private int edad;


	public String consultarCurp(){
		ClienteRenapo cliente = new ClienteRenapo();
		resultado = cliente.consultarCurpRenapoServer(nombre, primerApellido, segundoApellido, estado, edad);
		return "success";
	}


	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
}
