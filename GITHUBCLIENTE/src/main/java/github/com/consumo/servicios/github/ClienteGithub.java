package github.com.consumo.servicios.github;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
public class ClienteGithub {

	public String consultarUsuario(String usuario, String contraseña) throws MalformedURLException, XmlRpcException {

		XmlRpcClientConfigImpl configuracion = new XmlRpcClientConfigImpl();
		configuracion.setServerURL(new URL("http://192.168.1.2:1300"));
		XmlRpcClient client = new XmlRpcClient();
		client.setConfig(configuracion);
		Object[] datos = {usuario, contraseña};
		return (String) client.execute("servicioUsuario.servicioConsultarUsuario", datos);
	}
}
