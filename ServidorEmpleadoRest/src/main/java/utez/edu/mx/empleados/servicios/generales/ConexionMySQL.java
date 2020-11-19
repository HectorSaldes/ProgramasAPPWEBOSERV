package utez.edu.mx.empleados.servicios.generales;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {
    public Connection crearConexion() throws SQLException {
        Connection con;
        String nombre_db = "tienda";
        String usuario_db = "root";
        String contrasena_db = "admin";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        }catch (Exception e){
            System.out.println(e);
        }
        con = DriverManager.getConnection("jdbc:mysql://localhost/"+nombre_db+"?user="+usuario_db+"&password="+contrasena_db+"&allowPublicKeyRetrieval=true&useSSL=false");
        return  con;
    }

    public static void main(String[] args) throws SQLException, Exception {
        try {
            ConexionMySQL c = new ConexionMySQL();
            Connection con = c.crearConexion();
            System.out.println(con);
            System.out.println("(^_^) Connection successful ... ");
        } catch (Exception e) {
            System.out.println("(o_O) Conection error ... " + e);
        }
    }
}
