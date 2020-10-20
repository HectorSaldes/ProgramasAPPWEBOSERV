package servicioweb;

public class CalificacionesBean {
	private String[][] lista = {{"Reynel", "8"}, {"Hector", "10"}, {"Berenice", "9"}};

	public String buscarCalificacion(String nombre, String apellidos) {
		String respuesta = "No se encontraron resultados";
		for (int i = 0; i < lista.length; i++) {
			if (nombre.equals(lista[i][0])) {
				respuesta = nombre+" "+apellidos+" tu calificación -> " + lista[i][1];
				break;
			}
		}
		return respuesta;
	}

}
