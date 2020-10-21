package servicio.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

@WebService(name ="ServiciosGeneralesSoap")
@SOAPBinding(style =SOAPBinding.Style.RPC)
public class ServiciosGeneralesSoap {

	@WebMethod(operationName ="sumar")
	public double sumar(@WebParam double numero1, @WebParam double numero2){
		return numero1+numero2;
	}

	@WebMethod(operationName = "restar")
	public double restar(@WebParam double numero1, @WebParam double numero2){
		return numero1-numero2;
	}

	@WebMethod(operationName = "multiplicar")
	public double multiplicar(@WebParam double numero1, @WebParam double numero2){
		return numero1*numero2;
	}

	@WebMethod(operationName = "dividir")
	public double dividir(@WebParam double numero1, @WebParam double numero2){
		return numero1/numero2;
	}

	public static void main(String[] args) {
		System.out.println("Iniciando Servidor SOAP");
		Endpoint.publish("http://localhost:1300/ServiciosGeneralesSoap",new ServiciosGeneralesSoap());
		System.out.println("¡Se ha iniciado coorectamente el servidor SOAP!");
	}
}
