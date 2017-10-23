
package br.edu.ifpb.pos.soap.viajei.client.hotel.hotel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.edu.ifpb.pos.soap.viajei.client.hotel.hotel package. 
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

    private final static QName _BindRoom_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "bindRoom");
    private final static QName _UpdateHotelResponse_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "updateHotelResponse");
    private final static QName _AddHotel_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "addHotel");
    private final static QName _UpdateHotel_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "updateHotel");
    private final static QName _FindHotelByIdResponse_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "findHotelByIdResponse");
    private final static QName _Room_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "room");
    private final static QName _FindHotelById_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "findHotelById");
    private final static QName _RemoveHotel_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "removeHotel");
    private final static QName _BindRoomResponse_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "bindRoomResponse");
    private final static QName _ListAllHotels_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "listAllHotels");
    private final static QName _ListAllHotelsResponse_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "listAllHotelsResponse");
    private final static QName _RemoveHotelResponse_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "removeHotelResponse");
    private final static QName _AddHotelResponse_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "addHotelResponse");
    private final static QName _Hotel_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "hotel");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.ifpb.pos.soap.viajei.client.hotel.hotel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateHotel }
     * 
     */
    public UpdateHotel createUpdateHotel() {
        return new UpdateHotel();
    }

    /**
     * Create an instance of {@link AddHotel }
     * 
     */
    public AddHotel createAddHotel() {
        return new AddHotel();
    }

    /**
     * Create an instance of {@link UpdateHotelResponse }
     * 
     */
    public UpdateHotelResponse createUpdateHotelResponse() {
        return new UpdateHotelResponse();
    }

    /**
     * Create an instance of {@link BindRoom }
     * 
     */
    public BindRoom createBindRoom() {
        return new BindRoom();
    }

    /**
     * Create an instance of {@link RemoveHotel }
     * 
     */
    public RemoveHotel createRemoveHotel() {
        return new RemoveHotel();
    }

    /**
     * Create an instance of {@link FindHotelById }
     * 
     */
    public FindHotelById createFindHotelById() {
        return new FindHotelById();
    }

    /**
     * Create an instance of {@link Room }
     * 
     */
    public Room createRoom() {
        return new Room();
    }

    /**
     * Create an instance of {@link FindHotelByIdResponse }
     * 
     */
    public FindHotelByIdResponse createFindHotelByIdResponse() {
        return new FindHotelByIdResponse();
    }

    /**
     * Create an instance of {@link BindRoomResponse }
     * 
     */
    public BindRoomResponse createBindRoomResponse() {
        return new BindRoomResponse();
    }

    /**
     * Create an instance of {@link ListAllHotels }
     * 
     */
    public ListAllHotels createListAllHotels() {
        return new ListAllHotels();
    }

    /**
     * Create an instance of {@link Hotel }
     * 
     */
    public Hotel createHotel() {
        return new Hotel();
    }

    /**
     * Create an instance of {@link AddHotelResponse }
     * 
     */
    public AddHotelResponse createAddHotelResponse() {
        return new AddHotelResponse();
    }

    /**
     * Create an instance of {@link ListAllHotelsResponse }
     * 
     */
    public ListAllHotelsResponse createListAllHotelsResponse() {
        return new ListAllHotelsResponse();
    }

    /**
     * Create an instance of {@link RemoveHotelResponse }
     * 
     */
    public RemoveHotelResponse createRemoveHotelResponse() {
        return new RemoveHotelResponse();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BindRoom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "bindRoom")
    public JAXBElement<BindRoom> createBindRoom(BindRoom value) {
        return new JAXBElement<BindRoom>(_BindRoom_QNAME, BindRoom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateHotelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "updateHotelResponse")
    public JAXBElement<UpdateHotelResponse> createUpdateHotelResponse(UpdateHotelResponse value) {
        return new JAXBElement<UpdateHotelResponse>(_UpdateHotelResponse_QNAME, UpdateHotelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddHotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "addHotel")
    public JAXBElement<AddHotel> createAddHotel(AddHotel value) {
        return new JAXBElement<AddHotel>(_AddHotel_QNAME, AddHotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateHotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "updateHotel")
    public JAXBElement<UpdateHotel> createUpdateHotel(UpdateHotel value) {
        return new JAXBElement<UpdateHotel>(_UpdateHotel_QNAME, UpdateHotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindHotelByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "findHotelByIdResponse")
    public JAXBElement<FindHotelByIdResponse> createFindHotelByIdResponse(FindHotelByIdResponse value) {
        return new JAXBElement<FindHotelByIdResponse>(_FindHotelByIdResponse_QNAME, FindHotelByIdResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FindHotelById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "findHotelById")
    public JAXBElement<FindHotelById> createFindHotelById(FindHotelById value) {
        return new JAXBElement<FindHotelById>(_FindHotelById_QNAME, FindHotelById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveHotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "removeHotel")
    public JAXBElement<RemoveHotel> createRemoveHotel(RemoveHotel value) {
        return new JAXBElement<RemoveHotel>(_RemoveHotel_QNAME, RemoveHotel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BindRoomResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "bindRoomResponse")
    public JAXBElement<BindRoomResponse> createBindRoomResponse(BindRoomResponse value) {
        return new JAXBElement<BindRoomResponse>(_BindRoomResponse_QNAME, BindRoomResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllHotels }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "listAllHotels")
    public JAXBElement<ListAllHotels> createListAllHotels(ListAllHotels value) {
        return new JAXBElement<ListAllHotels>(_ListAllHotels_QNAME, ListAllHotels.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllHotelsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "listAllHotelsResponse")
    public JAXBElement<ListAllHotelsResponse> createListAllHotelsResponse(ListAllHotelsResponse value) {
        return new JAXBElement<ListAllHotelsResponse>(_ListAllHotelsResponse_QNAME, ListAllHotelsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveHotelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "removeHotelResponse")
    public JAXBElement<RemoveHotelResponse> createRemoveHotelResponse(RemoveHotelResponse value) {
        return new JAXBElement<RemoveHotelResponse>(_RemoveHotelResponse_QNAME, RemoveHotelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddHotelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "addHotelResponse")
    public JAXBElement<AddHotelResponse> createAddHotelResponse(AddHotelResponse value) {
        return new JAXBElement<AddHotelResponse>(_AddHotelResponse_QNAME, AddHotelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hotel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "hotel")
    public JAXBElement<Hotel> createHotel(Hotel value) {
        return new JAXBElement<Hotel>(_Hotel_QNAME, Hotel.class, null, value);
    }

}
