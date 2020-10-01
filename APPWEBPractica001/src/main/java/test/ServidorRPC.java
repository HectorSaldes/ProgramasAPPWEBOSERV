package test;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.webserver.WebServer;
import java.io.IOException;


public class ServidorRPC {
	public static void main(String[] args) throws XmlRpcException, IOException {
		System.out.print("Iniciando Servidor RPC....");

		//Mapea las clases que se ocupan
		//Mapear: Unir, hacer un puente o enlace
		PropertyHandlerMapping mapeo = new PropertyHandlerMapping();
		mapeo.addHandler("Funciones", Funciones.class);

		//Dar un numero que este es un puerto
		WebServer servidor = new WebServer(1300);
		//Le enviamos nuestra clase mapeada o enlace para importar la clase
		servidor.getXmlRpcServer().setHandlerMapping(mapeo);
		servidor.start();

		//Lo de esperando peticion literalmente es lo que hace un servidor, queda esperando una respuesta
		// y el programa no se termina
		System.out.println("Servidor Correctamente Iniciado!");
		System.out.println("Esperando petición...");
	}
}
