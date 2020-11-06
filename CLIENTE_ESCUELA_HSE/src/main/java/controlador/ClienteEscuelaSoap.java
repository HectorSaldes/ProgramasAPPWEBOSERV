package controlador;

import utez.edu.mx.escuela.servicios.web.ServicioEscuela;
import utez.edu.mx.escuela.servicios.web.ServicioEscuelaService;

public class ClienteEscuelaSoap {
	ServicioEscuelaService servidor = new ServicioEscuelaService();
	ServicioEscuela puerto = servidor.getServicioEscuelaPort();

	public String consultarPromedioEstudiante(String matricula){
		String resultado = "\tNO SE ENCONTRÓ EL ALUMNO CON MATRÍCULA: "+matricula;
		try{
			double promedio = puerto.conultarPromedio(matricula);
			if(promedio != 0.0){
				resultado = "\tEL PROMEDIO DE LA MATRÍCULA: "+matricula+" ES: "+promedio;
			}
			return resultado;
		}catch (Exception e){
			System.out.println("EL SERVICIO NO ESTÁ DISPONIBLE");
		}
		return  resultado;
	}
}
