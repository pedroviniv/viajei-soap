
package br.edu.ifpb.pos.viajei.client.transports.routes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.edu.ifpb.pos.viajei.client.transports.routes package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Address_QNAME = new QName("http://ws.transport.viajei.soap.pos.ifpb.edu.br/", "address");
    private final static QName _Route_QNAME = new QName("http://ws.transport.viajei.soap.pos.ifpb.edu.br/", "route");
    private final static QName _Horary_QNAME = new QName("http://ws.transport.viajei.soap.pos.ifpb.edu.br/", "horary");
    private final static QName _FindRouteByIdResponse_QNAME = new QName("http://ws.transport.viajei.soap.pos.ifpb.edu.br/", "findRouteByIdResponse");
    private final static QName _FindRouteById_QNAME = new QName("http://ws.transport.viajei.soap.pos.ifpb.edu.br/", "findRouteById");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.ifpb.pos.viajei.client.transports.routes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link Route }
     * 
     */
    public Route createRoute() {
        return new Route();
    }

    /**
     * Create an instance of {@link Horary }
     * 
     */
    public Horary createHorary() {
        return new Horary();
    }

    /**
     * Create an instance of {@link FindRouteByIdResponse }
     * 
     */
    public FindRouteByIdResponse createFindRouteByIdResponse() {
        return new FindRouteByIdResponse();
    }

    /**
     * Create an instance of {@link FindRouteById }
     * 
     */
    public FindRouteById createFindRouteById() {
        return new FindRouteById();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Address }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.transport.viajei.soap.pos.ifpb.edu.br/", name = "address")
    public JAXBElement<Address> createAddress(Address value) {
        return new JAXBElement<Address>(_Address_QNAME, Address.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Route }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.transport.viajei.soap.pos.ifpb.edu.br/", name = "route")
    public JAXBElement<Route> createRoute(Route value) {
        return new JAXBElement<Route>(_Route_QNAME, Route.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Horary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.transport.viajei.soap.pos.ifpb.edu.br/", name = "horary")
    public JAXBElement<Horary> createHorary(Horary value) {
        return new JAXBElement<Horary>(_Horary_QNAME, Horary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRouteByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.transport.viajei.soap.pos.ifpb.edu.br/", name = "findRouteByIdResponse")
    public JAXBElement<FindRouteByIdResponse> createFindRouteByIdResponse(FindRouteByIdResponse value) {
        return new JAXBElement<FindRouteByIdResponse>(_FindRouteByIdResponse_QNAME, FindRouteByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRouteById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.transport.viajei.soap.pos.ifpb.edu.br/", name = "findRouteById")
    public JAXBElement<FindRouteById> createFindRouteById(FindRouteById value) {
        return new JAXBElement<FindRouteById>(_FindRouteById_QNAME, FindRouteById.class, null, value);
    }

}
