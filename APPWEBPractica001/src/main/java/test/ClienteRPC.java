package test;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;

public class ClienteRPC {

	public static void main(String[] args) throws MalformedURLException, XmlRpcException {
		//Sirve para la configuracion del objeto para conexion del servidor
		XmlRpcClientConfigImpl configuracion = new XmlRpcClientConfigImpl();
		//Le damos la ip para conexion
		configuracion.setServerURL(new URL("http://localhost:1300"));

		//esto es un comantario

		XmlRpcClient cliente = new XmlRpcClient();
		//Le damos al cliente la ip
		cliente.setConfig(configuracion);
		//Le damos los valores
		Object[] numeros = {55, 85};
		//Le decimos a que funcion de la clase Funciones se debe ir y mandarle el objeto (pKey: Funciones, la variable de ServidorRPC)
		int resultado = (Integer) cliente.execute("Funciones.suma", numeros);
		System.out.println("El resultado es: " + resultado);
	}
}
