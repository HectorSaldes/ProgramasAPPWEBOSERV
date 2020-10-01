package utez.edu.mx.renapo.controlador;

import utez.edu.mx.renapo.modelo.CurpBean;
import utez.edu.mx.renapo.modelo.CurpDao;

public class CurpAction {
	/*
	public static void main(String[] args) {
		CurpBean bean = new CurpBean();
		CurpDao dao = new CurpDao();
		bean.setNombre("Hector");
		bean.setPrimerApellido("Saldaña");
		bean.setSegundoApellido("Espinoza");
		bean.setEdad(19);
		bean.setEstado("Monterrey");
		String resultado = dao.servicioConsultarCurp(bean);

		if (resultado != null) {
			System.out.println("Tú CURP es: " + resultado);
		} else {
			System.out.println("No se encontraron resultados con los datos proporcionados");
		}

	}
	*/
	public String servicioConsultarCurp(String nombre, String primerApellido, String segundoApellido, int edad, String estado) {
		CurpBean objeto = new CurpBean();
		CurpDao objetoDao = new CurpDao();
		objeto.setNombre(nombre);
		objeto.setPrimerApellido(primerApellido);
		objeto.setSegundoApellido(segundoApellido);
		objeto.setEdad(edad);
		objeto.setEstado(estado);
		String resultadoCurp = objetoDao.consultarCurpDatos(objeto);
		if (resultadoCurp == null)
			return "No se encontraron resultados con los datos proporcionados";
		else
			return "Tu CURP es: " + resultadoCurp;
	}
}
