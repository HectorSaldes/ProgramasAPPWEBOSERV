package utez.edu.mx.tienda.servicios.rest;

import utez.edu.mx.tienda.modelo.ProductoBean;
import utez.edu.mx.tienda.modelo.ProductoDao;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/tienda")
public class ServicioCrudTienda {

     /*
    TODO LO CORRECTO ES ASÍ
        @GET    -> Consultas
        @POST   -> Registro
        @PUT    -> Modificaciones
        @DELETE -> Eliminaciones
    */

    private final ProductoDao dao = new ProductoDao();

    @GET
    @Path("/consultaGeneral")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ProductoBean> consultaGeneral(){
        return dao.consultarProductos();
    }

    @GET
    @Path("/consultarUno")
    @Produces(MediaType.APPLICATION_JSON)
    public ProductoBean consultarUno(@QueryParam("nombre") String nombre){ return dao.consultarProductoNombre(nombre); }

    @POST
    @Path("/registrarUno")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON) //TODO SE CONSUME O SE ENVÍA ALGO, EL BEAN COMPLETO
    public boolean registrarUno(ProductoBean bean){
        return dao.insertarProducto(bean);
    }

    @PUT
    @Path("/modificarUno")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public boolean modificarUno(ProductoBean bean){
        return dao.modificarProducto(bean);
    }

    @DELETE
    @Path("/eliminarUno/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean eliminarUno(@PathParam("id") int id){
        return dao.eliminarProducto(id);
    }

    @GET
    @Path("/consultarPorCoincidencia")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ProductoBean> consultarPorCoincidencia(@QueryParam("coincidencia") String coincidencia){
        return dao.consultarProductoCoincidencia(coincidencia);
    }

    @GET
    @Path("/consultarParaCompra")
    @Produces(MediaType.APPLICATION_JSON)
    public String consultarCompra(@QueryParam("nombre")String nombre,@QueryParam("cantidad")int cantidad){
       return dao.consultarCompra(nombre, cantidad);
    }


}
