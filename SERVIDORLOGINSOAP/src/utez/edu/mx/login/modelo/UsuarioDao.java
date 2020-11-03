package utez.edu.mx.login.modelo;

import utez.edu.mx.serviciosgenerales.ConexionMySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDao {

	private final String SQL_SERVICIO_CONSULTAR_USUARIO= "SELECT nombre FROM USUARIOS WHERE usuario = ? AND contraseña = ?";
	private Connection con;
	private PreparedStatement pstm;
	private ResultSet rs;


	public boolean consultarLoginUsuario(UsuarioBean usuario){
		boolean resultado = false;
		try{
			con = ConexionMySQL.getConexion();
			pstm = con.prepareStatement(SQL_SERVICIO_CONSULTAR_USUARIO);
			pstm.setString(1,usuario.getUsuario());
			pstm.setString(2,usuario.getContrasena());
			rs = pstm.executeQuery();
			if(rs.next()){
				resultado = true;
			}
		}catch (Exception e){
			System.out.println("Error en el método consultarLoginUsuario() de la clase " + getClass().getSimpleName() + " " + e);
		}finally {
			try {
				rs.close();
				pstm.close();
				con.close();
			} catch (Exception e) {
				System.out.println("Error en el cierre de conexiones");
			}
		}
		return resultado;
	}
}
