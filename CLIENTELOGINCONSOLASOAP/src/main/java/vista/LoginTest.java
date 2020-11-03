package vista;

import controlador.ClienteLoginSoap;

import java.util.Scanner;

public class LoginTest {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		ClienteLoginSoap cliente = new ClienteLoginSoap();
		String usuario="", contrasena="";
		System.out.println("\n" +
				"\t░██████╗░██╗████████╗██╗░░██╗██╗░░░██╗██████╗░\n" +
				"\t██╔════╝░██║╚══██╔══╝██║░░██║██║░░░██║██╔══██╗\n" +
				"\t██║░░██╗░██║░░░██║░░░███████║██║░░░██║██████╦╝\n" +
				"\t██║░░╚██╗██║░░░██║░░░██╔══██║██║░░░██║██╔══██╗\n" +
				"\t╚██████╔╝██║░░░██║░░░██║░░██║╚██████╔╝██████╦╝\n" +
				"\t░╚═════╝░╚═╝░░░╚═╝░░░╚═╝░░╚═╝░╚═════╝░╚═════╝░");
		System.out.println("\t\t\t\tI⃨N⃨I⃨C⃨I⃨O⃨ D⃨E⃨ S⃨E⃨S⃨I⃨Ó⃨N⃨\n");
		System.out.print("Ingresa tu nombre de usuario: ");
		usuario = leer.next();
		System.out.print("Ingresa tu contraseña: ");
		contrasena = leer.next();
		boolean resultado = cliente.login(usuario,contrasena);
		if(resultado)
			System.out.println("\tBienvenido");
		else
			System.out.println("\tUsuario y/o contraseña incorrectos");
	}
}
