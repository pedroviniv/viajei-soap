
package br.edu.ifpb.pos.viajei.client.hotel.bookings;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.edu.ifpb.pos.viajei.client.hotel.bookings package. 
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

    private final static QName _Book_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "book");
    private final static QName _BookResponse_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "bookResponse");
    private final static QName _Booking_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "booking");
    private final static QName _FindBookingByIdResponse_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "findBookingByIdResponse");
    private final static QName _ListAllBookings_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "listAllBookings");
    private final static QName _FindBookingById_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "findBookingById");
    private final static QName _Room_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "room");
    private final static QName _ListAllBookingsResponse_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "listAllBookingsResponse");
    private final static QName _Client_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "client");
    private final static QName _Hotel_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "hotel");
    private final static QName _RemoveBooking_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "removeBooking");
    private final static QName _RemoveBookingResponse_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "removeBookingResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.ifpb.pos.viajei.client.hotel.bookings
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Booking }
     * 
     */
    public Booking createBooking() {
        return new Booking();
    }

    /**
     * Create an instance of {@link FindBookingByIdResponse }
     * 
     */
    public FindBookingByIdResponse createFindBookingByIdResponse() {
        return new FindBookingByIdResponse();
    }

    /**
     * Create an instance of {@link ListAllBookings }
     * 
     */
    public ListAllBookings createListAllBookings() {
        return new ListAllBookings();
    }

    /**
     * Create an instance of {@link BookResponse }
     * 
     */
    public BookResponse createBookResponse() {
        return new BookResponse();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link RemoveBookingResponse }
     * 
     */
    public RemoveBookingResponse createRemoveBookingResponse() {
        return new RemoveBookingResponse();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link Hotel }
     * 
     */
    public Hotel createHotel() {
        return new Hotel();
    }

    /**
     * Create an instance of {@link RemoveBooking }
     * 
     */
    public RemoveBooking createRemoveBooking() {
        return new RemoveBooking();
    }

    /**
     * Create an instance of {@link ListAllBookingsResponse }
     * 
     */
    public ListAllBookingsResponse createListAllBookingsResponse() {
        return new ListAllBookingsResponse();
    }

    /**
     * Create an instance of {@link FindBookingById }
     * 
     */
    public FindBookingById createFindBookingById() {
        return new FindBookingById();
    }

    /**
     * Create an instance of {@link Room }
     * 
     */
    public Room createRoom() {
        return new Room();
    }

    /**
     * Create an instance of {@link LocalDateTime }
     * 
     */
    public LocalDateTime createLocalDateTime() {
        return new LocalDateTime();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Book }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "book")
    public JAXBElement<Book> createBook(Book value) {
        return new JAXBElement<Book>(_Book_QNAME, Book.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "bookResponse")
    public JAXBElement<BookResponse> createBookResponse(BookResponse value) {
        return new JAXBElement<BookResponse>(_BookResponse_QNAME, BookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Booking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "booking")
    public JAXBElement<Booking> createBooking(Booking value) {
        return new JAXBElement<Booking>(_Booking_QNAME, Booking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBookingByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "findBookingByIdResponse")
    public JAXBElement<FindBookingByIdResponse> createFindBookingByIdResponse(FindBookingByIdResponse value) {
        return new JAXBElement<FindBookingByIdResponse>(_FindBookingByIdResponse_QNAME, FindBookingByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllBookings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "listAllBookings")
    public JAXBElement<ListAllBookings> createListAllBookings(ListAllBookings value) {
        return new JAXBElement<ListAllBookings>(_ListAllBookings_QNAME, ListAllBookings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindBookingById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "findBookingById")
    public JAXBElement<FindBookingById> createFindBookingById(FindBookingById value) {
        return new JAXBElement<FindBookingById>(_FindBookingById_QNAME, FindBookingById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Room }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "room")
    public JAXBElement<Room> createRoom(Room value) {
        return new JAXBElement<Room>(_Room_QNAME, Room.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllBookingsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "listAllBookingsResponse")
    public JAXBElement<ListAllBookingsResponse> createListAllBookingsResponse(ListAllBookingsResponse value) {
        return new JAXBElement<ListAllBookingsResponse>(_ListAllBookingsResponse_QNAME, ListAllBookingsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Client }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "client")
    public JAXBElement<Client> createClient(Client value) {
        return new JAXBElement<Client>(_Client_QNAME, Client.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "hotel")
    public JAXBElement<Hotel> createHotel(Hotel value) {
        return new JAXBElement<Hotel>(_Hotel_QNAME, Hotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveBooking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "removeBooking")
    public JAXBElement<RemoveBooking> createRemoveBooking(RemoveBooking value) {
        return new JAXBElement<RemoveBooking>(_RemoveBooking_QNAME, RemoveBooking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveBookingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "removeBookingResponse")
    public JAXBElement<RemoveBookingResponse> createRemoveBookingResponse(RemoveBookingResponse value) {
        return new JAXBElement<RemoveBookingResponse>(_RemoveBookingResponse_QNAME, RemoveBookingResponse.class, null, value);
    }

}
