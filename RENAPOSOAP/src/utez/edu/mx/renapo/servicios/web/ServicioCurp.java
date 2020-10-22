package utez.edu.mx.renapo.servicios.web;

import utez.edu.mx.renapo.modelo.CurpBean;
import utez.edu.mx.renapo.modelo.CurpDao;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

@WebService(name="ServicioCurp")
@SOAPBinding(style = SOAPBinding.Style.RPC)

public class ServicioCurp {

	@WebMethod(operationName = "consultarCURPRenapo")
	public String consultarCURPRenapo(@WebParam String nombre,  @WebParam String primerApellido, @WebParam String segundoApellido,@WebParam String estado, @WebParam int edad){
		CurpBean curpBean = new CurpBean(nombre, primerApellido, segundoApellido, estado, edad);
		CurpDao curpDao = new CurpDao();
		String CURP = curpDao.consultarCurp(curpBean);
		return CURP;
	}

	public static void main(String[] args) {
		System.out.println("\n" +
				"▀█▀ ▒█▄░▒█ ▀█▀ ▒█▀▀█ ▀█▀ ░█▀▀█ ▒█▄░▒█ ▒█▀▀▄ ▒█▀▀▀█ 　 ▒█▀▀▀█ ▒█▀▀▀ ▒█▀▀█ ▒█░░▒█ ▀█▀ ▒█▀▀▄ ▒█▀▀▀█ ▒█▀▀█ \n" +
				"▒█░ ▒█▒█▒█ ▒█░ ▒█░░░ ▒█░ ▒█▄▄█ ▒█▒█▒█ ▒█░▒█ ▒█░░▒█ 　 ░▀▀▀▄▄ ▒█▀▀▀ ▒█▄▄▀ ░▒█▒█░ ▒█░ ▒█░▒█ ▒█░░▒█ ▒█▄▄▀ \n" +
				"▄█▄ ▒█░░▀█ ▄█▄ ▒█▄▄█ ▄█▄ ▒█░▒█ ▒█░░▀█ ▒█▄▄▀ ▒█▄▄▄█ 　 ▒█▄▄▄█ ▒█▄▄▄ ▒█░▒█ ░░▀▄▀░ ▄█▄ ▒█▄▄▀ ▒█▄▄▄█ ▒█░▒█ \n" +
				"\n" +
				"▒█▀▀█ ▒█▀▀▀ ▒█▄░▒█ ░█▀▀█ ▒█▀▀█ ▒█▀▀▀█ ░ ░ ░ \n" +
				"▒█▄▄▀ ▒█▀▀▀ ▒█▒█▒█ ▒█▄▄█ ▒█▄▄█ ▒█░░▒█ ▄ ▄ ▄ \n" +
				"▒█░▒█ ▒█▄▄▄ ▒█░░▀█ ▒█░▒█ ▒█░░░ ▒█▄▄▄█ █ █ █");
		Endpoint.publish("http://localhost:1300/ServicioCurp",new ServicioCurp());
		System.out.println("¡SERVIDOR INICIADO CORRECTAMENT!");
	}

	/*EN LOS ARGS DEL SoapUI
	EL ORDEN DEBE SER
		 <arg0>       {nombre}        </arg0>
         <arg1>    {primer apellido}  </arg1>
         <arg2>   {segundo apellido}  </arg2>
         <arg3>       {estado}        </arg3>
         <arg4>        {edad}         </arg4>

	 */

}
