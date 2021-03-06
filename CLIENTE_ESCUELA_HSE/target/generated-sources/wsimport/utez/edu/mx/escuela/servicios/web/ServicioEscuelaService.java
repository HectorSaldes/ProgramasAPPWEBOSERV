
package utez.edu.mx.escuela.servicios.web;

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
@WebServiceClient(name = "ServicioEscuelaService", targetNamespace = "http://web.servicios.escuela.mx.edu.utez/", wsdlLocation = "http://localhost:1300/ServicioEscuela?wsdl")
public class ServicioEscuelaService
    extends Service
{

    private final static URL SERVICIOESCUELASERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVICIOESCUELASERVICE_EXCEPTION;
    private final static QName SERVICIOESCUELASERVICE_QNAME = new QName("http://web.servicios.escuela.mx.edu.utez/", "ServicioEscuelaService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:1300/ServicioEscuela?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIOESCUELASERVICE_WSDL_LOCATION = url;
        SERVICIOESCUELASERVICE_EXCEPTION = e;
    }

    public ServicioEscuelaService() {
        super(__getWsdlLocation(), SERVICIOESCUELASERVICE_QNAME);
    }

    public ServicioEscuelaService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIOESCUELASERVICE_QNAME, features);
    }

    public ServicioEscuelaService(URL wsdlLocation) {
        super(wsdlLocation, SERVICIOESCUELASERVICE_QNAME);
    }

    public ServicioEscuelaService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIOESCUELASERVICE_QNAME, features);
    }

    public ServicioEscuelaService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioEscuelaService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServicioEscuela
     */
    @WebEndpoint(name = "ServicioEscuelaPort")
    public ServicioEscuela getServicioEscuelaPort() {
        return super.getPort(new QName("http://web.servicios.escuela.mx.edu.utez/", "ServicioEscuelaPort"), ServicioEscuela.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicioEscuela
     */
    @WebEndpoint(name = "ServicioEscuelaPort")
    public ServicioEscuela getServicioEscuelaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://web.servicios.escuela.mx.edu.utez/", "ServicioEscuelaPort"), ServicioEscuela.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIOESCUELASERVICE_EXCEPTION!= null) {
            throw SERVICIOESCUELASERVICE_EXCEPTION;
        }
        return SERVICIOESCUELASERVICE_WSDL_LOCATION;
    }

}
