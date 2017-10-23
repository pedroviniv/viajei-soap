
package br.edu.ifpb.pos.viajei.client.ticket.transports;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.edu.ifpb.pos.viajei.client.ticket.transports package. 
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

    private final static QName _UpdateTransportResponse_QNAME = new QName("http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", "updateTransportResponse");
    private final static QName _FindTransportByIdResponse_QNAME = new QName("http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", "findTransportByIdResponse");
    private final static QName _Transport_QNAME = new QName("http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", "transport");
    private final static QName _RemoveTransport_QNAME = new QName("http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", "removeTransport");
    private final static QName _AddTransportResponse_QNAME = new QName("http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", "addTransportResponse");
    private final static QName _UpdateTransport_QNAME = new QName("http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", "updateTransport");
    private final static QName _FindTransportById_QNAME = new QName("http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", "findTransportById");
    private final static QName _ListAllTransports_QNAME = new QName("http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", "listAllTransports");
    private final static QName _AddTransport_QNAME = new QName("http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", "addTransport");
    private final static QName _RemoveTransportResponse_QNAME = new QName("http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", "removeTransportResponse");
    private final static QName _ListAllTransportsResponse_QNAME = new QName("http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", "listAllTransportsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.ifpb.pos.viajei.client.ticket.transports
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
     * Create an instance of {@link RemoveTransportResponse }
     * 
     */
    public RemoveTransportResponse createRemoveTransportResponse() {
        return new RemoveTransportResponse();
    }

    /**
     * Create an instance of {@link ListAllTransportsResponse }
     * 
     */
    public ListAllTransportsResponse createListAllTransportsResponse() {
        return new ListAllTransportsResponse();
    }

    /**
     * Create an instance of {@link UpdateTransportResponse }
     * 
     */
    public UpdateTransportResponse createUpdateTransportResponse() {
        return new UpdateTransportResponse();
    }

    /**
     * Create an instance of {@link RemoveTransport }
     * 
     */
    public RemoveTransport createRemoveTransport() {
        return new RemoveTransport();
    }

    /**
     * Create an instance of {@link FindTransportByIdResponse }
     * 
     */
    public FindTransportByIdResponse createFindTransportByIdResponse() {
        return new FindTransportByIdResponse();
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
     * Create an instance of {@link UpdateTransport }
     * 
     */
    public UpdateTransport createUpdateTransport() {
        return new UpdateTransport();
    }

    /**
     * Create an instance of {@link FindTransportById }
     * 
     */
    public FindTransportById createFindTransportById() {
        return new FindTransportById();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTransportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", name = "updateTransportResponse")
    public JAXBElement<UpdateTransportResponse> createUpdateTransportResponse(UpdateTransportResponse value) {
        return new JAXBElement<UpdateTransportResponse>(_UpdateTransportResponse_QNAME, UpdateTransportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindTransportByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", name = "findTransportByIdResponse")
    public JAXBElement<FindTransportByIdResponse> createFindTransportByIdResponse(FindTransportByIdResponse value) {
        return new JAXBElement<FindTransportByIdResponse>(_FindTransportByIdResponse_QNAME, FindTransportByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Transport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", name = "transport")
    public JAXBElement<Transport> createTransport(Transport value) {
        return new JAXBElement<Transport>(_Transport_QNAME, Transport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveTransport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", name = "removeTransport")
    public JAXBElement<RemoveTransport> createRemoveTransport(RemoveTransport value) {
        return new JAXBElement<RemoveTransport>(_RemoveTransport_QNAME, RemoveTransport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTransportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", name = "addTransportResponse")
    public JAXBElement<AddTransportResponse> createAddTransportResponse(AddTransportResponse value) {
        return new JAXBElement<AddTransportResponse>(_AddTransportResponse_QNAME, AddTransportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTransport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", name = "updateTransport")
    public JAXBElement<UpdateTransport> createUpdateTransport(UpdateTransport value) {
        return new JAXBElement<UpdateTransport>(_UpdateTransport_QNAME, UpdateTransport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindTransportById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", name = "findTransportById")
    public JAXBElement<FindTransportById> createFindTransportById(FindTransportById value) {
        return new JAXBElement<FindTransportById>(_FindTransportById_QNAME, FindTransportById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllTransports }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", name = "listAllTransports")
    public JAXBElement<ListAllTransports> createListAllTransports(ListAllTransports value) {
        return new JAXBElement<ListAllTransports>(_ListAllTransports_QNAME, ListAllTransports.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTransport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", name = "addTransport")
    public JAXBElement<AddTransport> createAddTransport(AddTransport value) {
        return new JAXBElement<AddTransport>(_AddTransport_QNAME, AddTransport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveTransportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", name = "removeTransportResponse")
    public JAXBElement<RemoveTransportResponse> createRemoveTransportResponse(RemoveTransportResponse value) {
        return new JAXBElement<RemoveTransportResponse>(_RemoveTransportResponse_QNAME, RemoveTransportResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllTransportsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", name = "listAllTransportsResponse")
    public JAXBElement<ListAllTransportsResponse> createListAllTransportsResponse(ListAllTransportsResponse value) {
        return new JAXBElement<ListAllTransportsResponse>(_ListAllTransportsResponse_QNAME, ListAllTransportsResponse.class, null, value);
    }

}
