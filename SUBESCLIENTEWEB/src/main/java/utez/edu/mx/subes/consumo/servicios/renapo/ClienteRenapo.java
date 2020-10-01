package utez.edu.mx.subes.consumo.servicios.renapo;
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;

public class ClienteRenapo {
	public String consultarCurpRenapo(String nombre, String primerApellido, String segundoApellido, int edad, String estado) throws MalformedURLException, XmlRpcException {

		XmlRpcClientConfigImpl configuracion = new XmlRpcClientConfigImpl();
		configuracion.setServerURL(new URL("http://192.168.1.2:1300"));
		XmlRpcClient client = new XmlRpcClient();
		client.setConfig(configuracion);
		Object[] datos = {nombre, primerApellido, segundoApellido, edad, estado};
		return (String) client.execute("servicioCurp.servicioConsultarCurp", datos);
	}
}
