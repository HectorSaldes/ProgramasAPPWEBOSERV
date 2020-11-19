package utez.edu.mx.empleados.modelo;

import utez.edu.mx.empleados.servicios.generales.ConexionMySQL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDao extends ConexionMySQL {
    private PreparedStatement pstm;
    private ResultSet rs;
    private final String SQL_INSERTAR_EMPLEADO = "INSERT INTO empleado VALUES(null,?,?,?,?,?,?,?)";
    private final String SQL_ELIMINAR_EMPLEADO = "DELETE FROM empleado WHERE idEmpleado = ?";
    private final String SQL_CONSULTAR_EMPLEADOS = "SELECT * FROM empleado";
    private final String SQL_MODIFICAR_EMPLEADO = "UPDATE empleado SET nombre = ?, primerApellido = ?, segundoApellido = ?, sexo = ?, telefono = ?, domicilio = ?, sueldoMensual = ? WHERE idEmpleado = ?";


    public boolean insertarEmpleado(EmpleadoBean bean){
        boolean resultado = false;
        try  {
            pstm = crearConexion().prepareStatement(SQL_INSERTAR_EMPLEADO);
            pstm.setString(1, bean.getNombre());
            pstm.setString(2, bean.getPrimerApellido());
            pstm.setString(3, bean.getSegundoApellido());
            pstm.setString(4, bean.getSexo());
            pstm.setString(5, bean.getTelefono());
            pstm.setString(6, bean.getDomicilio());
            pstm.setDouble(7, bean.getSueldoMensual());
            resultado = pstm.executeUpdate() == 1;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                pstm.close();
                crearConexion().close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return resultado;
    }

    public boolean eliminarEmpleado( int idEmpleado){
        boolean resultado = false;
        try {
            pstm = crearConexion().prepareStatement(SQL_ELIMINAR_EMPLEADO);
            pstm.setInt(1, idEmpleado);
            resultado = pstm.executeUpdate() == 1;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                pstm.close();
                crearConexion().close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return resultado;
    }

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

    public boolean modificarEmpleado(EmpleadoBean bean) {
        boolean resultado = false;
        try  {
            pstm = crearConexion().prepareStatement(SQL_MODIFICAR_EMPLEADO);
            pstm.setString(1, bean.getNombre());
            pstm.setString(2, bean.getPrimerApellido());
            pstm.setString(3, bean.getSegundoApellido());
            pstm.setString(4, bean.getSexo());
            pstm.setString(5, bean.getTelefono());
            pstm.setString(6, bean.getDomicilio());
            pstm.setDouble(7, bean.getSueldoMensual());
            pstm.setDouble(8, bean.getIdEmpleado());
            resultado = pstm.executeUpdate() == 1 ;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                pstm.close();
                crearConexion().close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        EmpleadoDao dao = new EmpleadoDao();
        /*List<EmpleadoBean>  lista = dao.consultarEmpleados();
        for (EmpleadoBean d: lista) {
            System.out.println(d);
        }*/

        EmpleadoBean b = new EmpleadoBean( "Luis", "dfdf","dfdf","dfdfd","ddfd","fdf",58);
        System.out.println(dao.insertarEmpleado(b));
    }

}
