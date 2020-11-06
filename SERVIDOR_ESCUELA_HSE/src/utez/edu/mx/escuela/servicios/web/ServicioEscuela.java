package utez.edu.mx.escuela.servicios.web;

import utez.edu.mx.escuela.model.EstudianteBean;
import utez.edu.mx.escuela.model.EstudianteDao;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

@WebService(name="ServicioEscuela")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class ServicioEscuela {

	@WebMethod(operationName = "conultarPromedio")
	public double conultarPromedio(@WebParam String matricula){
		EstudianteDao dao = new EstudianteDao();
		EstudianteBean bean = new EstudianteBean(matricula);
		return dao.consultarPromedioEstudiante(bean);
	}

	public static void main(String[] args) {
		System.out.println("INICIAND SERVIDOR ESCUELA");
		Endpoint.publish("http://localhost:1300/ServicioEscuela",new ServicioEscuela());
		System.out.println("¡SERVIDOR INICIADO CORRECTAMENTE!");
	}
}
