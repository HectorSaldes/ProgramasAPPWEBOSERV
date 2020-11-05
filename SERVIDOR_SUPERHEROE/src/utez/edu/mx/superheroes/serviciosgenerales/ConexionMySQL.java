package utez.edu.mx.superheroes.serviciosgenerales;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {

	public static Connection getConexion() throws Exception {
		String ip = "localhost";
		String nombreBase = "REPASO";
		String usuario = "root";
		String password = "admin";
		Connection con;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		con = DriverManager.getConnection("jdbc:mysql://" + ip + "/" + nombreBase + "?user=" + usuario + "&password=" + password + "&useSSL=false");
		return con;
	}

	public static void main(String[] args) throws SQLException, Exception {
		try {
			ConexionMySQL c = new ConexionMySQL();
			Connection con = c.getConexion();
			System.out.println(con);
			System.out.println("(^_^) Connection successful ... ");
		} catch (Exception e) {
			System.out.println("(o_O) Conection error ... " + e);
		}
	}

}