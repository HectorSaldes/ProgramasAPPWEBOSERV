package consumo.servicios.soap;

import utez.edu.mx.servicios.soap.PersonaBeanArray;
import utez.edu.mx.servicios.soap.ServicioPersona;
import utez.edu.mx.servicios.soap.ServicioPersonaService;

public class ClienteSoap {
	public static void main(String[] args) {
		ServicioPersonaService servicio = new ServicioPersonaService();
		ServicioPersona puerto = servicio.getServicioPersonaPort();

		PersonaBeanArray personas = puerto.consultarPersona();

		for (int i = 0; i <personas.getItem().size() ; i++) {
			System.out.println(personas.getItem().get(i).getNombre());
			System.out.println(personas.getItem().get(i).getApellidos());
			System.out.println(personas.getItem().get(i).getEdad());
			System.out.println(personas.getItem().get(i).getSexo());
			System.out.println(personas.getItem().get(i).getTelefono());
			System.out.println(personas.getItem().get(i).getEstatura());
			System.out.println();
		}



	}
}
