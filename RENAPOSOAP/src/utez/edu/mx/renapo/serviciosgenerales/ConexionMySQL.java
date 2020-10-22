package utez.edu.mx.renapo.serviciosgenerales;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionMySQL {

	public static Connection getConexion() throws Exception {
		String ip = "localhost";
		String nombreBase = "renapo";
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

	public static void main(String[] args) {
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