package consumo.servicios.soap;

import servicio.soap.ServiciosGeneralesSoap;
import servicio.soap.ServiciosGeneralesSoapService;

public class ClienteSoap {

	public static void main(String[] args) {
		ServiciosGeneralesSoapService servicio = new ServiciosGeneralesSoapService();
		ServiciosGeneralesSoap puerto = servicio.getServiciosGeneralesSoapPort();

		double suma = puerto.sumar(5,5);
		System.out.println("Resultado de la suma es: " + suma);

		double resta = puerto.restar(5,8);
		System.out.println("Resultado de la resta es: " + resta);

		double multi = puerto.multiplicar(5,8);
		System.out.println("Resultado de la multi es: " + multi);

		double division = puerto.dividir(10,3);
		System.out.println("Resultado de la división es: " + division);

	}

}
