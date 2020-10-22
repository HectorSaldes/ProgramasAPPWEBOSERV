package utez.edu.mx.renapo.modelo;

import utez.edu.mx.renapo.serviciosgenerales.ConexionMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CurpDao {

	private final String SQL_SERVICIO_CONSULTAR_CURP = "SELECT curp FROM curp WHERE nombre = ? AND primerApellido = ? AND segundoApellido = ? AND edad = ? AND estado = ?";
	private Connection con;
	private PreparedStatement pstm;
	private ResultSet rs;

	public String consultarCurp(CurpBean bean) {
		String resultado = "No se encontró la CURP";
		try {
			con = ConexionMySQL.getConexion();
			pstm = con.prepareStatement(SQL_SERVICIO_CONSULTAR_CURP);
			pstm.setString(1, bean.getNombre());
			pstm.setString(2, bean.getPrimerApellido());
			pstm.setString(3, bean.getSegundoApellido());
			pstm.setInt(4, bean.getEdad());
			pstm.setString(5, bean.getEstado());
			rs = pstm.executeQuery();
			if (rs.next()) {
				resultado = "La CURP ES: "+ rs.getString("curp");
			}
		} catch (Exception e) {
			System.out.println("Error en el método servicioConsultarCurp() de la clase " + getClass().getSimpleName() + " " + e);
		} finally {
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
