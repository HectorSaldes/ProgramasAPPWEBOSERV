package utez.edu.mx.subes.controlador;

import org.apache.xmlrpc.XmlRpcException;
import utez.edu.mx.subes.consumo.servicios.renapo.ClienteRenapo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.MalformedURLException;

@WebServlet("/CurpAction")
public class CurpAction extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		String respuestaServidor = "";
		String nombre = request.getParameter("nombre");
		String primerApellido = request.getParameter("primerApellido");
		String segundoApellido = request.getParameter("segundoApellido");
		int edad = Integer.parseInt(request.getParameter("edad"));
		String estado = request.getParameter("estado");

		ClienteRenapo cliente = new ClienteRenapo();
		try {
			respuestaServidor = cliente.consultarCurpRenapo(nombre, primerApellido, segundoApellido, edad, estado);
		} catch (XmlRpcException e) {
			e.printStackTrace();
		}finally {
			request.setAttribute("respuestaServidor", respuestaServidor);
			request.getRequestDispatcher("/ResultadoServidor.jsp").forward(request,response);
		}

	}

}
