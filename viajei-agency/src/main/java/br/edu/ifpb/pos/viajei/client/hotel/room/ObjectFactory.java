
package br.edu.ifpb.pos.viajei.client.hotel.room;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.edu.ifpb.pos.viajei.client.hotel.room package. 
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

    private final static QName _ListAllRoomsResponse_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "listAllRoomsResponse");
    private final static QName _AddRoom_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "addRoom");
    private final static QName _RemoveRoom_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "removeRoom");
    private final static QName _RemoveRoomResponse_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "removeRoomResponse");
    private final static QName _UpdateRoom_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "updateRoom");
    private final static QName _Room_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "room");
    private final static QName _FindRoomByIdResponse_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "findRoomByIdResponse");
    private final static QName _AddRoomResponse_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "addRoomResponse");
    private final static QName _UpdateRoomResponse_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "updateRoomResponse");
    private final static QName _FindRoomById_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "findRoomById");
    private final static QName _ListAllRooms_QNAME = new QName("http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", "listAllRooms");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.ifpb.pos.viajei.client.hotel.room
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RemoveRoomResponse }
     * 
     */
    public RemoveRoomResponse createRemoveRoomResponse() {
        return new RemoveRoomResponse();
    }

    /**
     * Create an instance of {@link AddRoom }
     * 
     */
    public AddRoom createAddRoom() {
        return new AddRoom();
    }

    /**
     * Create an instance of {@link RemoveRoom }
     * 
     */
    public RemoveRoom createRemoveRoom() {
        return new RemoveRoom();
    }

    /**
     * Create an instance of {@link ListAllRoomsResponse }
     * 
     */
    public ListAllRoomsResponse createListAllRoomsResponse() {
        return new ListAllRoomsResponse();
    }

    /**
     * Create an instance of {@link FindRoomById }
     * 
     */
    public FindRoomById createFindRoomById() {
        return new FindRoomById();
    }

    /**
     * Create an instance of {@link ListAllRooms }
     * 
     */
    public ListAllRooms createListAllRooms() {
        return new ListAllRooms();
    }

    /**
     * Create an instance of {@link AddRoomResponse }
     * 
     */
    public AddRoomResponse createAddRoomResponse() {
        return new AddRoomResponse();
    }

    /**
     * Create an instance of {@link UpdateRoomResponse }
     * 
     */
    public UpdateRoomResponse createUpdateRoomResponse() {
        return new UpdateRoomResponse();
    }

    /**
     * Create an instance of {@link FindRoomByIdResponse }
     * 
     */
    public FindRoomByIdResponse createFindRoomByIdResponse() {
        return new FindRoomByIdResponse();
    }

    /**
     * Create an instance of {@link Room }
     * 
     */
    public Room createRoom() {
        return new Room();
    }

    /**
     * Create an instance of {@link UpdateRoom }
     * 
     */
    public UpdateRoom createUpdateRoom() {
        return new UpdateRoom();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllRoomsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "listAllRoomsResponse")
    public JAXBElement<ListAllRoomsResponse> createListAllRoomsResponse(ListAllRoomsResponse value) {
        return new JAXBElement<ListAllRoomsResponse>(_ListAllRoomsResponse_QNAME, ListAllRoomsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRoom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "addRoom")
    public JAXBElement<AddRoom> createAddRoom(AddRoom value) {
        return new JAXBElement<AddRoom>(_AddRoom_QNAME, AddRoom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveRoom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "removeRoom")
    public JAXBElement<RemoveRoom> createRemoveRoom(RemoveRoom value) {
        return new JAXBElement<RemoveRoom>(_RemoveRoom_QNAME, RemoveRoom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveRoomResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "removeRoomResponse")
    public JAXBElement<RemoveRoomResponse> createRemoveRoomResponse(RemoveRoomResponse value) {
        return new JAXBElement<RemoveRoomResponse>(_RemoveRoomResponse_QNAME, RemoveRoomResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRoom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "updateRoom")
    public JAXBElement<UpdateRoom> createUpdateRoom(UpdateRoom value) {
        return new JAXBElement<UpdateRoom>(_UpdateRoom_QNAME, UpdateRoom.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRoomByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "findRoomByIdResponse")
    public JAXBElement<FindRoomByIdResponse> createFindRoomByIdResponse(FindRoomByIdResponse value) {
        return new JAXBElement<FindRoomByIdResponse>(_FindRoomByIdResponse_QNAME, FindRoomByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRoomResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "addRoomResponse")
    public JAXBElement<AddRoomResponse> createAddRoomResponse(AddRoomResponse value) {
        return new JAXBElement<AddRoomResponse>(_AddRoomResponse_QNAME, AddRoomResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRoomResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "updateRoomResponse")
    public JAXBElement<UpdateRoomResponse> createUpdateRoomResponse(UpdateRoomResponse value) {
        return new JAXBElement<UpdateRoomResponse>(_UpdateRoomResponse_QNAME, UpdateRoomResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindRoomById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "findRoomById")
    public JAXBElement<FindRoomById> createFindRoomById(FindRoomById value) {
        return new JAXBElement<FindRoomById>(_FindRoomById_QNAME, FindRoomById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllRooms }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", name = "listAllRooms")
    public JAXBElement<ListAllRooms> createListAllRooms(ListAllRooms value) {
        return new JAXBElement<ListAllRooms>(_ListAllRooms_QNAME, ListAllRooms.class, null, value);
    }

}
