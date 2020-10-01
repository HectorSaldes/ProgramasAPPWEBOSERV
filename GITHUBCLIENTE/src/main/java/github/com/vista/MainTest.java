package github.com.vista;

import github.com.consumo.servicios.github.ClienteGithub;
import org.apache.xmlrpc.XmlRpcException;
import java.net.MalformedURLException;
import java.util.Scanner;

public class MainTest {
	public static void main(String[] args)throws MalformedURLException, XmlRpcException {
		ClienteGithub clienteGithub = new ClienteGithub();
		Scanner leer = new Scanner(System.in);
		leer.useDelimiter("\n");
		String usuario, contraseña;
		System.out.println("\n" +
				"\t░██████╗░██╗████████╗██╗░░██╗██╗░░░██╗██████╗░\n" +
				"\t██╔════╝░██║╚══██╔══╝██║░░██║██║░░░██║██╔══██╗\n" +
				"\t██║░░██╗░██║░░░██║░░░███████║██║░░░██║██████╦╝\n" +
				"\t██║░░╚██╗██║░░░██║░░░██╔══██║██║░░░██║██╔══██╗\n" +
				"\t╚██████╔╝██║░░░██║░░░██║░░██║╚██████╔╝██████╦╝\n" +
				"\t░╚═════╝░╚═╝░░░╚═╝░░░╚═╝░░╚═╝░╚═════╝░╚═════╝░");
		System.out.println("\t\t\t\tI⃨N⃨I⃨C⃨I⃨O⃨ D⃨E⃨ S⃨E⃨S⃨I⃨Ó⃨N⃨\n");
		System.out.print("Ingrese su usuario: ");
		usuario = leer.next();
		System.out.print("Ingrese su contraseña: ");
		contraseña = leer.next();
		System.out.println("\n"+clienteGithub.consultarUsuario(usuario,contraseña));
	}

}
