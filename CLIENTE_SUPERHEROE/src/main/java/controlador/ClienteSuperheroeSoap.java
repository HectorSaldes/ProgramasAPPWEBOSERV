package controlador;

import utez.edu.mx.superheroes.servicios.web.ServicioHeroe;
import utez.edu.mx.superheroes.servicios.web.ServicioHeroeService;
import utez.edu.mx.superheroes.servicios.web.SuperheroeBean;
import utez.edu.mx.superheroes.servicios.web.SuperheroeBeanArray;

import java.util.Scanner;

public class ClienteSuperheroeSoap {

	private Scanner leer  = new Scanner(System.in);
	private ServicioHeroeService servicio = new ServicioHeroeService();
	private ServicioHeroe puerto = servicio.getServicioHeroePort();
	private SuperheroeBeanArray beans;

	public void menu(){
		int opc = 0;
		do{
			System.out.println("CRUD SUPERHEROES");
			System.out.println("1. ALTA");
			System.out.println("2. BAJA");
			System.out.println("3. MODIFICAR");
			System.out.println("4. CONSULTAR");
			System.out.println("5. CONSULTAR TODOS");
			System.out.println("6. SALIR");
			opc = leer.nextInt();
			switch (opc){
				case 1:
					break;
				case 2:
					System.out.println("DAME EL NOMBRE");
					if(puerto.eliminar(leer.next())){
						System.out.println("LO HIZO");
					}
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					beans =  puerto.consultarTodos();
					for (SuperheroeBean b: beans.getItem()) {
						System.out.println(b.getNombre());
						System.out.println(b.getPoder());
						System.out.println(b.getDebut());
						System.out.println();
					}
					break;
			}
		}while (opc!=6);
	}


}
