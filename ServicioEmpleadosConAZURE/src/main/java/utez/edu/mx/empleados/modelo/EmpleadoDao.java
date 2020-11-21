package utez.edu.mx.empleados.modelo;

import utez.edu.mx.empleados.servicios.generales.ConexionSQLServer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDao extends ConexionSQLServer {
    public final String SQL_CONSULTAR_EMPLEADOS = "SELECT * FROM EMPLEADO";
    private PreparedStatement pstm;
    private ResultSet rs;

    public List<EmpleadoBean> consultarEmpleados() {
        List<EmpleadoBean> lista = new ArrayList<>();
        try {
            pstm = crearConexion().prepareStatement(SQL_CONSULTAR_EMPLEADOS);
            rs = pstm.executeQuery();
            while (rs.next()) {
                lista.add(new EmpleadoBean(
                        rs.getInt("idEmpleado"),
                        rs.getString("nombre"),
                        rs.getString("primerApellido"),
                        rs.getString("segundoApellido"),
                        rs.getString("sexo"),
                        rs.getString("telefono"),
                        rs.getString("domicilio"),
                        rs.getDouble("sueldoMensual")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                rs.close();
                pstm.close();
                crearConexion().close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return lista;
    }

   /* public static void main(String[] args) {
        EmpleadoDao dao = new EmpleadoDao();
        List<EmpleadoBean>  lista = dao.consultarEmpleados();
        for (EmpleadoBean d: lista) {
            System.out.println(d);
        }
    }*/

}
