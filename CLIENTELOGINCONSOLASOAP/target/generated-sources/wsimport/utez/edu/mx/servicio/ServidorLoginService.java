
package utez.edu.mx.servicio;

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
@WebServiceClient(name = "ServidorLoginService", targetNamespace = "http://servicio.mx.edu.utez/", wsdlLocation = "http://localhost:1300/ServidorLogin?wsdl")
public class ServidorLoginService
    extends Service
{

    private final static URL SERVIDORLOGINSERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVIDORLOGINSERVICE_EXCEPTION;
    private final static QName SERVIDORLOGINSERVICE_QNAME = new QName("http://servicio.mx.edu.utez/", "ServidorLoginService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:1300/ServidorLogin?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVIDORLOGINSERVICE_WSDL_LOCATION = url;
        SERVIDORLOGINSERVICE_EXCEPTION = e;
    }

    public ServidorLoginService() {
        super(__getWsdlLocation(), SERVIDORLOGINSERVICE_QNAME);
    }

    public ServidorLoginService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVIDORLOGINSERVICE_QNAME, features);
    }

    public ServidorLoginService(URL wsdlLocation) {
        super(wsdlLocation, SERVIDORLOGINSERVICE_QNAME);
    }

    public ServidorLoginService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVIDORLOGINSERVICE_QNAME, features);
    }

    public ServidorLoginService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServidorLoginService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServidorLogin
     */
    @WebEndpoint(name = "ServidorLoginPort")
    public ServidorLogin getServidorLoginPort() {
        return super.getPort(new QName("http://servicio.mx.edu.utez/", "ServidorLoginPort"), ServidorLogin.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServidorLogin
     */
    @WebEndpoint(name = "ServidorLoginPort")
    public ServidorLogin getServidorLoginPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://servicio.mx.edu.utez/", "ServidorLoginPort"), ServidorLogin.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVIDORLOGINSERVICE_EXCEPTION!= null) {
            throw SERVIDORLOGINSERVICE_EXCEPTION;
        }
        return SERVIDORLOGINSERVICE_WSDL_LOCATION;
    }

}
