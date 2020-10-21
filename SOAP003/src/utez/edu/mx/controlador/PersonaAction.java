package utez.edu.mx.controlador;
/*
	Saldaña Espinoza Hector
	4C - UTEZ - DSM
	Aplicaciones Web Orientadas a Servicios
 */

import utez.edu.mx.persona.PersonaBean;

public class PersonaAction {

	public PersonaBean[] conultarPersona() {
		PersonaBean[] personas = new PersonaBean[3];
		personas[0] = new PersonaBean("Hector", "Saldaña Espinoza", 19, "Masculino", "7772003900", 1.75);
		personas[1] = new PersonaBean("Ma. Berenice", "Torres Tuco", 20, "Femenino", "7779999999", 1.70);
		personas[2] = new PersonaBean("Harumi", "Martinez", 19, "Femenino", "7778888888", 1.74);
		return personas;
	}
}
