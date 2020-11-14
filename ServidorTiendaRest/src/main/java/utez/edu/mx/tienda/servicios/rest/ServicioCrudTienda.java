package utez.edu.mx.tienda.servicios.rest;

import utez.edu.mx.tienda.modelo.ProductoBean;
import utez.edu.mx.tienda.modelo.ProductoDao;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/tienda")
public class ServicioCrudTienda {

    private ProductoDao dao = new ProductoDao();

    /*
        @GET    -> Consultas ♫
        @POST   -> Registro ♫
        @PUT    -> Modificaciones
        @DELETE -> Eliminaciones
    */

//    @PUT
//    @Path("modificarUno")
//    @Produces(MediaType.APPLICATION_JSON)
//    public boolean modificarUno(){
//
//    }

    @DELETE
    @Path("/eliminarUno")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean eliminarUno(@QueryParam("idProducto")int idProducto){
        return dao.eliminarProducto(idProducto);
    }

    @GET
    @Path("/consultaGeneral")
    @Produces(MediaType.APPLICATION_JSON)
    public List<ProductoBean> consultaGeneral(){
        return dao.consultarProductos();
    }

    @GET
    @Path("/consultarUno")
    @Produces(MediaType.APPLICATION_JSON)
    public ProductoBean consultarUno(@QueryParam("nombre") String nombre){
        return dao.consultarProductoNombre(nombre);
    }

    @POST
    @Path("/registrarUno")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean registrarUno(@QueryParam("nombre")String nombre,
                                @QueryParam("descripcion")String descripcion,
                                @QueryParam("precio")double precio,
                                @QueryParam("existencia")int existencia){
        ProductoBean bean = new ProductoBean(nombre,descripcion,precio,existencia);
        return dao.insertarProducto(bean);
    }


}
