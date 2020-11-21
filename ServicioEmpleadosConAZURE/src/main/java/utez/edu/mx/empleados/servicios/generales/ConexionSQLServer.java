package utez.edu.mx.empleados.servicios.generales;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQLServer {
    //ESTA CLASE SIRVE PARA CONECTARSE A LA DB DE AZURE

    // CON EL NOMBRE DE LA BASE
    // EL USUARIO @ NOMBRE DEL SERVIDOR (TU LO CREAS)
    //  CONTRASEÑA

    //SON LOS MISMOS PASOS PARA CREAR UNA APLICACION REST PERO AHORA ES CONECTADO A LA DB DE AZURE

    protected Connection crearConexion(){
        String nombre_db = "Restaurante";
        String usuario_db = "hct@miservicedb";
        String contrasena_db = "M1Password02";
        String connectionUrl = "jdbc:sqlserver://miservicedb.database.windows.net:1433;database="+nombre_db+";user="+usuario_db+";password="+contrasena_db+";encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
        Connection connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(connectionUrl);
        }
        catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return  connection;
    }

    public static void main(String[] args) {
        try {
            ConexionSQLServer c = new ConexionSQLServer();
            Connection con = c.crearConexion();
            System.out.println(con);
            System.out.println("(^_^) Connection successful ... ");
        } catch (Exception e) {
            System.out.println("(o_O) Conection error ... " + e);
        }
    }

}
