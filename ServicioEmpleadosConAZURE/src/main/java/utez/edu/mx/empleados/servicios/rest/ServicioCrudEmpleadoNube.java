package utez.edu.mx.empleados.servicios.rest;

import utez.edu.mx.empleados.modelo.EmpleadoBean;
import utez.edu.mx.empleados.modelo.EmpleadoDao;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/Empleados")
public class ServicioCrudEmpleadoNube {
    private EmpleadoDao dao = new EmpleadoDao();

    @GET
    @Path("/consultarTodos")
    @Produces(MediaType.APPLICATION_JSON)
    public List<EmpleadoBean> consultarTodos(){
        return dao.consultarEmpleados();
    }
    //http://localhost:8080/ServicioEmpleadosConAZURE/Empleados/consultarTodos
}
