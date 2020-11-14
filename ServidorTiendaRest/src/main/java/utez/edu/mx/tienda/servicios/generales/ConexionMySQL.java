package utez.edu.mx.tienda.servicios.generales;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {
    public Connection crearConexion() throws SQLException {
        Connection con;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        }catch (Exception e){
            System.out.println(e);
        }
        con = DriverManager.getConnection("jdbc:mysql://localhost/tienda?user=root&password=admin&allowPublicKeyRetrieval=true&useSSL=false");
        return  con;
    }
}
