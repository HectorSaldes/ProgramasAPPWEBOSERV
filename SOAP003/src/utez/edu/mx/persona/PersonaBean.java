package utez.edu.mx.persona;
/*
	Saldaña Espinoza Hector
	4C - UTEZ - DSM
	Aplicaciones Web Orientadas a Servicios
 */
public class PersonaBean {
	private String nombre;
	private String apellidos;
	private int edad;
	private String sexo;
	private String telefono;
	private double estatura;

	public PersonaBean() {
	}

	public PersonaBean(String nombre, String apellidos, int edad, String sexo, String telefono, double estatura) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.sexo = sexo;
		this.telefono = telefono;
		this.estatura = estatura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
}
