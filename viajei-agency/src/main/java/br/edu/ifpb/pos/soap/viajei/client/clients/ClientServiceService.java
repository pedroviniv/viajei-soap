
package br.edu.ifpb.pos.soap.viajei.client.clients;

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
@WebServiceClient(name = "ClientServiceService", targetNamespace = "http://ws.client.viajei.soap.pos.ifpb.edu.br/", wsdlLocation = "http://clients-web:8080/viajei-client/ClientServiceService?wsdl")
public class ClientServiceService
    extends Service
{

    private final static URL CLIENTSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException CLIENTSERVICESERVICE_EXCEPTION;
    private final static QName CLIENTSERVICESERVICE_QNAME = new QName("http://ws.client.viajei.soap.pos.ifpb.edu.br/", "ClientServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://clients-web:8080/viajei-client/ClientServiceService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CLIENTSERVICESERVICE_WSDL_LOCATION = url;
        CLIENTSERVICESERVICE_EXCEPTION = e;
    }

    public ClientServiceService() {
        super(__getWsdlLocation(), CLIENTSERVICESERVICE_QNAME);
    }

    public ClientServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns ClientService
     */
    @WebEndpoint(name = "ClientServicePort")
    public ClientService getClientServicePort() {
        return super.getPort(new QName("http://ws.client.viajei.soap.pos.ifpb.edu.br/", "ClientServicePort"), ClientService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ClientService
     */
    @WebEndpoint(name = "ClientServicePort")
    public ClientService getClientServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.client.viajei.soap.pos.ifpb.edu.br/", "ClientServicePort"), ClientService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CLIENTSERVICESERVICE_EXCEPTION!= null) {
            throw CLIENTSERVICESERVICE_EXCEPTION;
        }
        return CLIENTSERVICESERVICE_WSDL_LOCATION;
    }

}
