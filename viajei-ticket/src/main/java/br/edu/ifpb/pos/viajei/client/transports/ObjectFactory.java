
package br.edu.ifpb.pos.viajei.client.transports;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.edu.ifpb.pos.viajei.client.transports package. 
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
    private final static QName _AddTransport_QNAME = new QName("http://ws.transport.viajei.soap.pos.ifpb.edu.br/", "addTransport");
    private final static QName _ListAllTransports_QNAME = new QName("http://ws.transport.viajei.soap.pos.ifpb.edu.br/", "listAllTransports");
    private final static QName _SearchTransportsBy_QNAME = new QName("http://ws.transport.viajei.soap.pos.ifpb.edu.br/", "searchTransportsBy");
    private final static QName _Transport_QNAME = new QName("http://ws.transport.viajei.soap.pos.ifpb.edu.br/", "transport");
    private final static QName _AddTransportResponse_QNAME = new QName("http://ws.transport.viajei.soap.pos.ifpb.edu.br/", "addTransportResponse");
    private final static QName _AddRouteResponse_QNAME = new QName("http://ws.transport.viajei.soap.pos.ifpb.edu.br/", "addRouteResponse");
    private final static QName _Route_QNAME = new QName("http://ws.transport.viajei.soap.pos.ifpb.edu.br/", "route");
    private final static QName _AddRoute_QNAME = new QName("http://ws.transport.viajei.soap.pos.ifpb.edu.br/", "addRoute");
    private final static QName _ListAllTransportsResponse_QNAME = new QName("http://ws.transport.viajei.soap.pos.ifpb.edu.br/", "listAllTransportsResponse");
    private final static QName _Horary_QNAME = new QName("http://ws.transport.viajei.soap.pos.ifpb.edu.br/", "horary");
    private final static QName _FindTransportByIdResponse_QNAME = new QName("http://ws.transport.viajei.soap.pos.ifpb.edu.br/", "findTransportByIdResponse");
    private final static QName _SearchTransportsByResponse_QNAME = new QName("http://ws.transport.viajei.soap.pos.ifpb.edu.br/", "searchTransportsByResponse");
    private final static QName _FindTransportById_QNAME = new QName("http://ws.transport.viajei.soap.pos.ifpb.edu.br/", "findTransportById");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.ifpb.pos.viajei.client.transports
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListAllTransports }
     * 
     */
    public ListAllTransports createListAllTransports() {
        return new ListAllTransports();
    }

    /**
     * Create an instance of {@link AddTransport }
     * 
     */
    public AddTransport createAddTransport() {
        return new AddTransport();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link SearchTransportsBy }
     * 
     */
    public SearchTransportsBy createSearchTransportsBy() {
        return new SearchTransportsBy();
    }

    /**
     * Create an instance of {@link Transport }
     * 
     */
    public Transport createTransport() {
        return new Transport();
    }

    /**
     * Create an instance of {@link AddTransportResponse }
     * 
     */
    public AddTransportResponse createAddTransportResponse() {
        return new AddTransportResponse();
    }

    /**
     * Create an instance of {@link AddRouteResponse }
     * 
     */
    public AddRouteResponse createAddRouteResponse() {
        return new AddRouteResponse();
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
     * Create an instance of {@link AddRoute }
     * 
     */
    public AddRoute createAddRoute() {
        return new AddRoute();
    }

    /**
     * Create an instance of {@link ListAllTransportsResponse }
     * 
     */
    public ListAllTransportsResponse createListAllTransportsResponse() {
        return new ListAllTransportsResponse();
    }

    /**
     * Create an instance of {@link FindTransportByIdResponse }
     * 
     */
    public FindTransportByIdResponse createFindTransportByIdResponse() {
        return new FindTransportByIdResponse();
    }

    /**
     * Create an instance of {@link SearchTransportsByResponse }
     * 
     */
    public SearchTransportsByResponse createSearchTransportsByResponse() {
        return new SearchTransportsByResponse();
    }

    /**
     * Create an instance of {@link FindTransportById }
     * 
     */
    public FindTransportById createFindTransportById() {
        return new FindTransportById();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTransport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.transport.viajei.soap.pos.ifpb.edu.br/", name = "addTransport")
    public JAXBElement<AddTransport> createAddTransport(AddTransport value) {
        return new JAXBElement<AddTransport>(_AddTransport_QNAME, AddTransport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllTransports }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.transport.viajei.soap.pos.ifpb.edu.br/", name = "listAllTransports")
    public JAXBElement<ListAllTransports> createListAllTransports(ListAllTransports value) {
        return new JAXBElement<ListAllTransports>(_ListAllTransports_QNAME, ListAllTransports.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTransportsBy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.transport.viajei.soap.pos.ifpb.edu.br/", name = "searchTransportsBy")
    public JAXBElement<SearchTransportsBy> createSearchTransportsBy(SearchTransportsBy value) {
        return new JAXBElement<SearchTransportsBy>(_SearchTransportsBy_QNAME, SearchTransportsBy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Transport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.transport.viajei.soap.pos.ifpb.edu.br/", name = "transport")
    public JAXBElement<Transport> createTransport(Transport value) {
        return new JAXBElement<Transport>(_Transport_QNAME, Transport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTransportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.transport.viajei.soap.pos.ifpb.edu.br/", name = "addTransportResponse")
    public JAXBElement<AddTransportResponse> createAddTransportResponse(AddTransportResponse value) {
        return new JAXBElement<AddTransportResponse>(_AddTransportResponse_QNAME, AddTransportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRouteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.transport.viajei.soap.pos.ifpb.edu.br/", name = "addRouteResponse")
    public JAXBElement<AddRouteResponse> createAddRouteResponse(AddRouteResponse value) {
        return new JAXBElement<AddRouteResponse>(_AddRouteResponse_QNAME, AddRouteResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRoute }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.transport.viajei.soap.pos.ifpb.edu.br/", name = "addRoute")
    public JAXBElement<AddRoute> createAddRoute(AddRoute value) {
        return new JAXBElement<AddRoute>(_AddRoute_QNAME, AddRoute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllTransportsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.transport.viajei.soap.pos.ifpb.edu.br/", name = "listAllTransportsResponse")
    public JAXBElement<ListAllTransportsResponse> createListAllTransportsResponse(ListAllTransportsResponse value) {
        return new JAXBElement<ListAllTransportsResponse>(_ListAllTransportsResponse_QNAME, ListAllTransportsResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FindTransportByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.transport.viajei.soap.pos.ifpb.edu.br/", name = "findTransportByIdResponse")
    public JAXBElement<FindTransportByIdResponse> createFindTransportByIdResponse(FindTransportByIdResponse value) {
        return new JAXBElement<FindTransportByIdResponse>(_FindTransportByIdResponse_QNAME, FindTransportByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchTransportsByResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.transport.viajei.soap.pos.ifpb.edu.br/", name = "searchTransportsByResponse")
    public JAXBElement<SearchTransportsByResponse> createSearchTransportsByResponse(SearchTransportsByResponse value) {
        return new JAXBElement<SearchTransportsByResponse>(_SearchTransportsByResponse_QNAME, SearchTransportsByResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindTransportById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.transport.viajei.soap.pos.ifpb.edu.br/", name = "findTransportById")
    public JAXBElement<FindTransportById> createFindTransportById(FindTransportById value) {
        return new JAXBElement<FindTransportById>(_FindTransportById_QNAME, FindTransportById.class, null, value);
    }

}
