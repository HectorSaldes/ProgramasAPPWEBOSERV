package test;
/*
 * Aplicaciones Web Orientadas a Servicios
 * Saldaña Espinoza Hector
 * Desarrollo de Software Multiplataforma
 * 4C UTEZ
 */
import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ClienteRPC {
	public static void main(String[] args) throws MalformedURLException, XmlRpcException {
		Scanner leer = new Scanner(System.in);
		XmlRpcClientConfigImpl configuracion = new XmlRpcClientConfigImpl();
		configuracion.setServerURL(new URL("http://localhost:1300"));
		XmlRpcClient cliente = new XmlRpcClient();
		cliente.setConfig(configuracion);
		int opc;
		double num1 = 0, num2 = 0;
		String operacion = "";
		do {
			System.out.println("-------------------------------");
			System.out.println("MENÚ CALCULADOARA BÁSICA");
			System.out.println("\t1. SUMA");
			System.out.println("\t2. RESTA");
			System.out.println("\t3. MULTIPLICACIÓN");
			System.out.println("\t4. DIVISIÓN");
			System.out.println("\t5. SALIR");
			System.out.print("ELIGA: ");
			opc = leer.nextInt();
			if (opc == 1 || opc == 2 || opc == 3 || opc == 4) {
				System.out.print("Número 1: ");
				num1 = leer.nextInt();
				System.out.print("Número 2: ");
				num2 = leer.nextInt();
			}
			switch (opc) {
				case 1:
					operacion = "suma";
					break;
				case 2:
					operacion = "resta";
					break;
				case 3:
					operacion = "multiplicacion";
					break;
				case 4:
					operacion = "division";
					break;
				case 5:
					System.out.println("\tPROGRAMA TERMINADO");
					opc = 5;
					break;
				default:
					System.out.println("NO EXISTE ESA OPCIÓN");
			}
			if (opc == 1 || opc == 2 || opc == 3 || opc == 4) {
				Object[] numeros = {num1, num2};
				double resultado = (Double) cliente.execute("Funciones." + operacion, numeros);
				System.out.println("El resultado de la " + operacion + " es: " + resultado);
			}
		} while (opc != 5);
	}
}
