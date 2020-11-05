package utez.edu.mx.superheroes.model;

public class SuperheroeBean {


	private int id;
	private String nombre;
	private String poder;
	private String debut;

	public SuperheroeBean() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public SuperheroeBean(int id, String nombre, String poder, String debut) {
		this.id = id;
		this.nombre = nombre;
		this.poder = poder;
		this.debut = debut;
	}

	public SuperheroeBean(String nombre, String poder, String debut) {
		this.nombre = nombre;
		this.poder = poder;
		this.debut = debut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}

	public String getDebut() {
		return debut;
	}

	public void setDebut(String debut) {
		this.debut = debut;
	}

	@Override
	public String toString() {
		return "SuperheroeBean{" +
				"nombre='" + nombre + '\'' +
				", poder='" + poder + '\'' +
				", debut='" + debut + '\'' +
				'}';
	}




}
