package subes.gob.vista;

import org.apache.xmlrpc.XmlRpcException;
import subes.gob.consumo.servicios.renapo.ClienteRenapo;

import java.net.MalformedURLException;

public class Test {
	public static void main(String[] args) throws MalformedURLException, XmlRpcException {
		ClienteRenapo clienteRenapo = new ClienteRenapo();
		System.out.println(clienteRenapo.consultarCurpRenapo("Hector", "Saldaña", "Espinoza", 19, "Monterrey"));
	}
}
