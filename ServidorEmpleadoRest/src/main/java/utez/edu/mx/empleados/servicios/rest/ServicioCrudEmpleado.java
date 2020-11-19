package utez.edu.mx.empleados.servicios.rest;

import utez.edu.mx.empleados.modelo.EmpleadoBean;
import utez.edu.mx.empleados.modelo.EmpleadoDao;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/servicioEmpleado")
public class ServicioCrudEmpleado {

    private final EmpleadoDao dao = new EmpleadoDao();

    /*
   TODO LO CORRECTO ES ASÍ
       @GET    -> Consultas
       @POST   -> Registro
       @PUT    -> Modificaciones
       @DELETE -> Eliminaciones
   */

    @GET
    @Path("/consultarTodos")
    @Produces(MediaType.APPLICATION_JSON)
    public List<EmpleadoBean> consultarTodos(){
        return dao.consultarEmpleados();
    }

    @POST
    @Path("/registrarUno")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON) //TODO SE CONSUME O SE ENVÍA ALGO, EL BEAN COMPLETO
    public boolean registrarUno(EmpleadoBean bean){
        return dao.insertarEmpleado(bean);
    }

    @DELETE
    @Path("/eliminarUno")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean eliminarUno(@QueryParam("idEmpleado") int idEmpleado){
        return dao.eliminarEmpleado(idEmpleado);
    }

    @PUT
    @Path("/modificarUno")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean modificarUno(EmpleadoBean bean){
        return dao.modificarEmpleado(bean);
    }

}
