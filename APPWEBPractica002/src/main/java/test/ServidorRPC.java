package test;
/*
 * Aplicaciones Web Orientadas a Servicios
 * Saldaña Espinoza Hector
 * Desarrollo de Software Multiplataforma
 * 4C UTEZ
 */
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.server.PropertyHandlerMapping;
import org.apache.xmlrpc.webserver.WebServer;

import java.io.IOException;
/*

 */
public class ServidorRPC {
	public static void main(String[] args) throws XmlRpcException, IOException {
		System.out.println("Iniciando Servidor RPC....");
		PropertyHandlerMapping mapeo = new PropertyHandlerMapping();
		mapeo.addHandler("Funciones", Funciones.class);
		WebServer servidor = new WebServer(1300);
		servidor.getXmlRpcServer().setHandlerMapping(mapeo);
		servidor.start();
		System.out.println("!Servidor Correctamente Iniciado!");
		System.out.println("Esperando la petición");
	}
}
