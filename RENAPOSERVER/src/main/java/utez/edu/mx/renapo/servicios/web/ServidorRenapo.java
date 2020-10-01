package utez.edu.mx.renapo.servicios.web;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.webserver.WebServer;
import utez.edu.mx.renapo.controlador.CurpAction;

import java.io.IOException;

public class ServidorRenapo {
	public static void main(String[] args) throws XmlRpcException, IOException {

		System.out.println("Iniciando Servidor de RENAPO...");
		PropertyHandlerMapping mapeo  = new PropertyHandlerMapping();
		mapeo.addHandler("servicioCurp", CurpAction.class);
		WebServer servidor  = new WebServer( 1300);
		servidor.getXmlRpcServer().setHandlerMapping(mapeo);
		servidor.start();
		System.out.println("¡Servidor Iniciado!...");


	}
}
