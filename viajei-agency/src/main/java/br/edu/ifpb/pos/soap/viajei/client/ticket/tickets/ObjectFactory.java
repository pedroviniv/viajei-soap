
package br.edu.ifpb.pos.soap.viajei.client.ticket.tickets;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.edu.ifpb.pos.soap.viajei.client.ticket.tickets package. 
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

    private final static QName _Client_QNAME = new QName("http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", "client");
    private final static QName _ListAllTickets_QNAME = new QName("http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", "listAllTickets");
    private final static QName _UpdateTicket_QNAME = new QName("http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", "updateTicket");
    private final static QName _FindTicketByIdResponse_QNAME = new QName("http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", "findTicketByIdResponse");
    private final static QName _Route_QNAME = new QName("http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", "route");
    private final static QName _UpdateTicketResponse_QNAME = new QName("http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", "updateTicketResponse");
    private final static QName _FindTicketById_QNAME = new QName("http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", "findTicketById");
    private final static QName _Transport_QNAME = new QName("http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", "transport");
    private final static QName _AddTicket_QNAME = new QName("http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", "addTicket");
    private final static QName _ListAllTicketsResponse_QNAME = new QName("http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", "listAllTicketsResponse");
    private final static QName _RemoveTicket_QNAME = new QName("http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", "removeTicket");
    private final static QName _Ticket_QNAME = new QName("http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", "ticket");
    private final static QName _RemoveTicketResponse_QNAME = new QName("http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", "removeTicketResponse");
    private final static QName _AddTicketResponse_QNAME = new QName("http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", "addTicketResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.ifpb.pos.soap.viajei.client.ticket.tickets
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RemoveTicket }
     * 
     */
    public RemoveTicket createRemoveTicket() {
        return new RemoveTicket();
    }

    /**
     * Create an instance of {@link Ticket }
     * 
     */
    public Ticket createTicket() {
        return new Ticket();
    }

    /**
     * Create an instance of {@link ListAllTicketsResponse }
     * 
     */
    public ListAllTicketsResponse createListAllTicketsResponse() {
        return new ListAllTicketsResponse();
    }

    /**
     * Create an instance of {@link AddTicketResponse }
     * 
     */
    public AddTicketResponse createAddTicketResponse() {
        return new AddTicketResponse();
    }

    /**
     * Create an instance of {@link RemoveTicketResponse }
     * 
     */
    public RemoveTicketResponse createRemoveTicketResponse() {
        return new RemoveTicketResponse();
    }

    /**
     * Create an instance of {@link UpdateTicketResponse }
     * 
     */
    public UpdateTicketResponse createUpdateTicketResponse() {
        return new UpdateTicketResponse();
    }

    /**
     * Create an instance of {@link FindTicketById }
     * 
     */
    public FindTicketById createFindTicketById() {
        return new FindTicketById();
    }

    /**
     * Create an instance of {@link Transport }
     * 
     */
    public Transport createTransport() {
        return new Transport();
    }

    /**
     * Create an instance of {@link AddTicket }
     * 
     */
    public AddTicket createAddTicket() {
        return new AddTicket();
    }

    /**
     * Create an instance of {@link FindTicketByIdResponse }
     * 
     */
    public FindTicketByIdResponse createFindTicketByIdResponse() {
        return new FindTicketByIdResponse();
    }

    /**
     * Create an instance of {@link Route }
     * 
     */
    public Route createRoute() {
        return new Route();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link ListAllTickets }
     * 
     */
    public ListAllTickets createListAllTickets() {
        return new ListAllTickets();
    }

    /**
     * Create an instance of {@link UpdateTicket }
     * 
     */
    public UpdateTicket createUpdateTicket() {
        return new UpdateTicket();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Client }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", name = "client")
    public JAXBElement<Client> createClient(Client value) {
        return new JAXBElement<Client>(_Client_QNAME, Client.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllTickets }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", name = "listAllTickets")
    public JAXBElement<ListAllTickets> createListAllTickets(ListAllTickets value) {
        return new JAXBElement<ListAllTickets>(_ListAllTickets_QNAME, ListAllTickets.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", name = "updateTicket")
    public JAXBElement<UpdateTicket> createUpdateTicket(UpdateTicket value) {
        return new JAXBElement<UpdateTicket>(_UpdateTicket_QNAME, UpdateTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindTicketByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", name = "findTicketByIdResponse")
    public JAXBElement<FindTicketByIdResponse> createFindTicketByIdResponse(FindTicketByIdResponse value) {
        return new JAXBElement<FindTicketByIdResponse>(_FindTicketByIdResponse_QNAME, FindTicketByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Route }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", name = "route")
    public JAXBElement<Route> createRoute(Route value) {
        return new JAXBElement<Route>(_Route_QNAME, Route.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", name = "updateTicketResponse")
    public JAXBElement<UpdateTicketResponse> createUpdateTicketResponse(UpdateTicketResponse value) {
        return new JAXBElement<UpdateTicketResponse>(_UpdateTicketResponse_QNAME, UpdateTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindTicketById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", name = "findTicketById")
    public JAXBElement<FindTicketById> createFindTicketById(FindTicketById value) {
        return new JAXBElement<FindTicketById>(_FindTicketById_QNAME, FindTicketById.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", name = "addTicket")
    public JAXBElement<AddTicket> createAddTicket(AddTicket value) {
        return new JAXBElement<AddTicket>(_AddTicket_QNAME, AddTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllTicketsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", name = "listAllTicketsResponse")
    public JAXBElement<ListAllTicketsResponse> createListAllTicketsResponse(ListAllTicketsResponse value) {
        return new JAXBElement<ListAllTicketsResponse>(_ListAllTicketsResponse_QNAME, ListAllTicketsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveTicket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", name = "removeTicket")
    public JAXBElement<RemoveTicket> createRemoveTicket(RemoveTicket value) {
        return new JAXBElement<RemoveTicket>(_RemoveTicket_QNAME, RemoveTicket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ticket }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", name = "ticket")
    public JAXBElement<Ticket> createTicket(Ticket value) {
        return new JAXBElement<Ticket>(_Ticket_QNAME, Ticket.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", name = "removeTicketResponse")
    public JAXBElement<RemoveTicketResponse> createRemoveTicketResponse(RemoveTicketResponse value) {
        return new JAXBElement<RemoveTicketResponse>(_RemoveTicketResponse_QNAME, RemoveTicketResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTicketResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ticket.viajei.soap.pos.ifpb.edu.br/", name = "addTicketResponse")
    public JAXBElement<AddTicketResponse> createAddTicketResponse(AddTicketResponse value) {
        return new JAXBElement<AddTicketResponse>(_AddTicketResponse_QNAME, AddTicketResponse.class, null, value);
    }

}
