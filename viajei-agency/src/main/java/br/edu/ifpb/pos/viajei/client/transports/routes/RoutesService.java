
package br.edu.ifpb.pos.viajei.client.transports.routes;

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
 * JAX-WS RI 2.2.8
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "RoutesService", targetNamespace = "http://ws.transport.viajei.soap.pos.ifpb.edu.br/", wsdlLocation = "http://localhost:8082/viajei-transport/RoutesService?wsdl")
public class RoutesService
    extends Service
{

    private final static URL ROUTESSERVICE_WSDL_LOCATION;
    private final static WebServiceException ROUTESSERVICE_EXCEPTION;
    private final static QName ROUTESSERVICE_QNAME = new QName("http://ws.transport.viajei.soap.pos.ifpb.edu.br/", "RoutesService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8082/viajei-transport/RoutesService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ROUTESSERVICE_WSDL_LOCATION = url;
        ROUTESSERVICE_EXCEPTION = e;
    }

    public RoutesService() {
        super(__getWsdlLocation(), ROUTESSERVICE_QNAME);
    }

    public RoutesService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns Routes
     */
    @WebEndpoint(name = "RoutesPort")
    public Routes getRoutesPort() {
        return super.getPort(new QName("http://ws.transport.viajei.soap.pos.ifpb.edu.br/", "RoutesPort"), Routes.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Routes
     */
    @WebEndpoint(name = "RoutesPort")
    public Routes getRoutesPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.transport.viajei.soap.pos.ifpb.edu.br/", "RoutesPort"), Routes.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ROUTESSERVICE_EXCEPTION!= null) {
            throw ROUTESSERVICE_EXCEPTION;
        }
        return ROUTESSERVICE_WSDL_LOCATION;
    }

}
