package utez.edu.mx.escuela.model;

public class EstudianteBean {
	
	private String matricula;
	private double promedio;

	public EstudianteBean() {
	}

	public EstudianteBean(String matricula) {
		this.matricula = matricula;
	}

	public EstudianteBean(String matricula, double promedio) {
		this.matricula = matricula;
		this.promedio = promedio;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
}
