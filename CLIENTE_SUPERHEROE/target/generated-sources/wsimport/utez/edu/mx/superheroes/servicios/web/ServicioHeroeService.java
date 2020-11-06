
package utez.edu.mx.superheroes.servicios.web;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServicioHeroeService", targetNamespace = "http://web.servicios.superheroes.mx.edu.utez/", wsdlLocation = "http://localhost:1300/ServicioHeroe?wsdl")
public class ServicioHeroeService
    extends Service
{

    private final static URL SERVICIOHEROESERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVICIOHEROESERVICE_EXCEPTION;
    private final static QName SERVICIOHEROESERVICE_QNAME = new QName("http://web.servicios.superheroes.mx.edu.utez/", "ServicioHeroeService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:1300/ServicioHeroe?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIOHEROESERVICE_WSDL_LOCATION = url;
        SERVICIOHEROESERVICE_EXCEPTION = e;
    }

    public ServicioHeroeService() {
        super(__getWsdlLocation(), SERVICIOHEROESERVICE_QNAME);
    }

    public ServicioHeroeService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIOHEROESERVICE_QNAME, features);
    }

    public ServicioHeroeService(URL wsdlLocation) {
        super(wsdlLocation, SERVICIOHEROESERVICE_QNAME);
    }

    public ServicioHeroeService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIOHEROESERVICE_QNAME, features);
    }

    public ServicioHeroeService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioHeroeService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServicioHeroe
     */
    @WebEndpoint(name = "ServicioHeroePort")
    public ServicioHeroe getServicioHeroePort() {
        return super.getPort(new QName("http://web.servicios.superheroes.mx.edu.utez/", "ServicioHeroePort"), ServicioHeroe.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicioHeroe
     */
    @WebEndpoint(name = "ServicioHeroePort")
    public ServicioHeroe getServicioHeroePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://web.servicios.superheroes.mx.edu.utez/", "ServicioHeroePort"), ServicioHeroe.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIOHEROESERVICE_EXCEPTION!= null) {
            throw SERVICIOHEROESERVICE_EXCEPTION;
        }
        return SERVICIOHEROESERVICE_WSDL_LOCATION;
    }

}