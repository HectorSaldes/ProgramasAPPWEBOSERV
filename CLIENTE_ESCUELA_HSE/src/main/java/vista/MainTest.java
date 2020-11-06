package vista;

import controlador.ClienteEscuelaSoap;

import java.util.Scanner;

public class MainTest {
	private static Scanner leer = new Scanner(System.in);
	public static void main(String[] args) {
		String resultado = "", matricula;
		int opc = 0;
		System.out.println("\n" +
				"\t██╗░░░██╗████████╗███████╗███████╗\n" +
				"\t██║░░░██║╚══██╔══╝██╔════╝╚════██║\n" +
				"\t██║░░░██║░░░██║░░░█████╗░░░░███╔═╝\n" +
				"\t██║░░░██║░░░██║░░░██╔══╝░░██╔══╝░░\n" +
				"\t╚██████╔╝░░░██║░░░███████╗███████╗\n" +
				"\t░╚═════╝░░░░╚═╝░░░╚══════╝╚══════╝");
		do{
			System.out.println("\t    CONSULTA TU PROMEDIO");
			System.out.println("1. CONSULTAR");
			System.out.println("2. SALIR");
			opc = validarNumero();
			switch (opc){
				case 1:
					System.out.print("INGRESE LA MATRÍCULA: ");
					matricula = leer.next();
					resultado = new ClienteEscuelaSoap().consultarPromedioEstudiante(matricula);
					System.out.println(resultado);
					break;
				case 2:
					opc = 2;
					break;
				default:
					System.out.println("ELIGE UNA OPCIÓN VÁLIDA");
			}
			System.out.println();
		}while (opc!=2);
	}

	public static int validarNumero(){
		boolean flag = false;
		int opc = 0;
		do{
			try{
				System.out.print("ELIGE: ");
				opc = leer.nextInt();
				flag = true;
			}catch (Exception e){
				System.out.println("SOLO INGRESAR NÚMEROS");
				System.out.println();
				leer.next();
			}
		}while (!flag);
		return opc;
	}

}
