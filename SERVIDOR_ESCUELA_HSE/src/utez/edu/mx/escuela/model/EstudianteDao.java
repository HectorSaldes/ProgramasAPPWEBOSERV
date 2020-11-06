package utez.edu.mx.escuela.model;


import utez.edu.mx.escuela.serviciosgenerales.ConexionMySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EstudianteDao {

	private final String SQL_CONSULTAR_PROMEDIO = "SELECT AVG(calificacion) FROM calificaciones WHERE matricula = ?";
	private Connection con;
	private PreparedStatement pstm;
	private ResultSet rs;

	public double consultarPromedioEstudiante(EstudianteBean estudianteBean){
		double promedio = 0.0;
		try{
			con = ConexionMySQL.getConexion();
			pstm = con.prepareStatement(SQL_CONSULTAR_PROMEDIO);
			pstm.setString(1,estudianteBean.getMatricula());
			rs = pstm.executeQuery();
			if(rs.next())
				promedio = rs.getDouble("AVG(calificacion)");
		}catch (Exception e){
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstm.close();
				con.close();
			} catch (Exception e) {
				System.out.println("ERROR EN EL CIERRE DE CONEXIONES");
			}
		}
		return promedio;
	}

	// Probar
	/*public static void main(String[] args) {
		EstudianteDao dao = new EstudianteDao();
		EstudianteBean bean = new EstudianteBean();
		bean.setMatricula("20203ti003");
		System.out.println(dao.consultarPromedioEstudiante(bean));
	}*/



}

