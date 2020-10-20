package servicioweb;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

//SE LE DICE QUE ES O SERÁ SERVICIO WEB Y SE LE COLOCA EL MISMO NOMBRE DE LA CLASE
@WebService(name = "ServicioCalificaciones")

//DECIRLE QUE ESTILO SERÁ EL SERVICIO, EN QUE MANERA SERA LA RESPUESTA ( DOCUMENT O XML(RPC) )
@SOAPBinding (style = SOAPBinding.Style.RPC)

public class ServicioCalificaciones {
	//@WebMethod: AL QUE SE VA ACCEDER CUANDO SE CONSUMA EL SERVICIO

	//operationName: ES COMO SE LLAMARA NUESTRO METODO
	@WebMethod (operationName = "consultarCalificacion")


	public String consultarCalificacion(@WebParam String nombre, @WebParam String apellidos){ //@WebParam SERÁ UN PARÁMETRO DEL SERVICIO WEB QUE SE ENVIARÁ, SI HAY MAS SE COLOCA @WebParam
		CalificacionesBean bean = new CalificacionesBean();
		String respuesta = bean.buscarCalificacion(nombre,apellidos);
		return respuesta;
	}


	public static void main(String[] args) {
		System.out.println("Iniciando servidor SOAP...");
		//PUBLICA NUESTRO SERVICIO EN LA DIR IP QUE LE COLOCAMOS, Y QUE SERVICIO SERA @WebService name
		Endpoint.publish("http://localhost:1300/ServicioCalificaciones", new ServicioCalificaciones());
		System.out.println("Servidor iniciado!");

		// http://localhost:1300/ServicioCalificaciones?WSDL -> se prueba en SoapUI
		//Y POR CADA @WebParam, se crean diferentes argumentos para que sean enviados

	}
}
