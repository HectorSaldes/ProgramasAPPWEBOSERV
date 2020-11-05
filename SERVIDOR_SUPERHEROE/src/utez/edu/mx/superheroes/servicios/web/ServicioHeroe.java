package utez.edu.mx.superheroes.servicios.web;


import utez.edu.mx.superheroes.model.SuperheroeBean;
import utez.edu.mx.superheroes.model.SuperheroeDao;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;
import java.sql.SQLException;

@WebService(name="ServicioHeroe")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class ServicioHeroe {

	@WebMethod(operationName = "consultarUno")
	public SuperheroeBean consultarUno(@WebParam String nombre)  {
		SuperheroeDao dao = new SuperheroeDao();
		return dao.consultarUno(nombre);
	}

	@WebMethod(operationName = "consultarTodos")
	public SuperheroeBean[] consultarTodos() {
		SuperheroeDao dao = new SuperheroeDao();
		return dao.consultarTodos();
	}

	@WebMethod(operationName = "insertar")
	public boolean insertar(@WebParam String nombre, @WebParam String poder, @WebParam String debut)  {
		SuperheroeDao dao = new SuperheroeDao();
		SuperheroeBean bean = new SuperheroeBean(nombre, poder, debut);
		return dao.insertar(bean);
	}

	@WebMethod(operationName = "eliminar")
	public boolean eliminar(@WebParam String nombre) {
		SuperheroeDao dao = new SuperheroeDao();
		return dao.elimiar(nombre);
	}

	@WebMethod(operationName = "modificar")
	public boolean modificar(@WebParam String nombre, @WebParam String poder, @WebParam String debut)  {
		SuperheroeDao dao = new SuperheroeDao();
		SuperheroeBean bean = new SuperheroeBean(nombre, poder, debut);
		return dao.modificar(bean);
	}


	public static void main(String[] args) {
		System.out.println("INICIAND SERVIDOR...");
		Endpoint.publish("http://localhost:1300/ServicioHeroe",new ServicioHeroe());
		System.out.println("¡SERVIDOR INICIADO CORRECTAMENT!");
	}


}
