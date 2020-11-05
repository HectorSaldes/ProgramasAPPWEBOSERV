
package utez.edu.mx.servicio;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServidorLogin", targetNamespace = "http://servicio.mx.edu.utez/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface ServidorLogin {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://servicio.mx.edu.utez/ServidorLogin/loginRequest", output = "http://servicio.mx.edu.utez/ServidorLogin/loginResponse")
    public boolean login(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0,
        @WebParam(name = "arg1", partName = "arg1")
        String arg1);

}