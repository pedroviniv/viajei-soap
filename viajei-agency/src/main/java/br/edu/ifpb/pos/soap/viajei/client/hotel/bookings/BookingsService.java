
package br.edu.ifpb.pos.soap.viajei.client.hotel.bookings;

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
@WebServiceClient(name = "BookingsService", targetNamespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", wsdlLocation = "http://localhost:8084/viajei-hotel/BookingsService?wsdl")
public class BookingsService
    extends Service
{

    private final static URL BOOKINGSSERVICE_WSDL_LOCATION;
    private final static WebServiceException BOOKINGSSERVICE_EXCEPTION;
    private final static QName BOOKINGSSERVICE_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "BookingsService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8084/viajei-hotel/BookingsService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BOOKINGSSERVICE_WSDL_LOCATION = url;
        BOOKINGSSERVICE_EXCEPTION = e;
    }

    public BookingsService() {
        super(__getWsdlLocation(), BOOKINGSSERVICE_QNAME);
    }

    public BookingsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns Bookings
     */
    @WebEndpoint(name = "BookingsPort")
    public Bookings getBookingsPort() {
        return super.getPort(new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "BookingsPort"), Bookings.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Bookings
     */
    @WebEndpoint(name = "BookingsPort")
    public Bookings getBookingsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "BookingsPort"), Bookings.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BOOKINGSSERVICE_EXCEPTION!= null) {
            throw BOOKINGSSERVICE_EXCEPTION;
        }
        return BOOKINGSSERVICE_WSDL_LOCATION;
    }

}