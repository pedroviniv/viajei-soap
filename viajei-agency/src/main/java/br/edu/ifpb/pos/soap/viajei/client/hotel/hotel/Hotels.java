
package br.edu.ifpb.pos.soap.viajei.client.hotel.hotel;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.1
 * 
 */
@WebService(name = "Hotels", targetNamespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Hotels {


    /**
     * 
     * @param newHotel
     */
    @WebMethod
    @RequestWrapper(localName = "addHotel", targetNamespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.soap.viajei.client.hotel.hotel.AddHotel")
    @ResponseWrapper(localName = "addHotelResponse", targetNamespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.soap.viajei.client.hotel.hotel.AddHotelResponse")
    public void addHotel(
        @WebParam(name = "newHotel", targetNamespace = "")
        Hotel newHotel);

    /**
     * 
     * @param hotelId
     */
    @WebMethod
    @RequestWrapper(localName = "removeHotel", targetNamespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.soap.viajei.client.hotel.hotel.RemoveHotel")
    @ResponseWrapper(localName = "removeHotelResponse", targetNamespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.soap.viajei.client.hotel.hotel.RemoveHotelResponse")
    public void removeHotel(
        @WebParam(name = "hotelId", targetNamespace = "")
        Long hotelId);

    /**
     * 
     * @param updatedHotel
     */
    @WebMethod
    @RequestWrapper(localName = "updateHotel", targetNamespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.soap.viajei.client.hotel.hotel.UpdateHotel")
    @ResponseWrapper(localName = "updateHotelResponse", targetNamespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.soap.viajei.client.hotel.hotel.UpdateHotelResponse")
    public void updateHotel(
        @WebParam(name = "updatedHotel", targetNamespace = "")
        Hotel updatedHotel);

    /**
     * 
     * @param hotelId
     * @return
     *     returns br.edu.ifpb.pos.soap.viajei.client.hotel.hotel.Hotel
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findHotelById", targetNamespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.soap.viajei.client.hotel.hotel.FindHotelById")
    @ResponseWrapper(localName = "findHotelByIdResponse", targetNamespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.soap.viajei.client.hotel.hotel.FindHotelByIdResponse")
    public Hotel findHotelById(
        @WebParam(name = "hotelId", targetNamespace = "")
        Long hotelId);

    /**
     * 
     * @return
     *     returns java.util.List<br.edu.ifpb.pos.soap.viajei.client.hotel.hotel.Hotel>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listAllHotels", targetNamespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.soap.viajei.client.hotel.hotel.ListAllHotels")
    @ResponseWrapper(localName = "listAllHotelsResponse", targetNamespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.soap.viajei.client.hotel.hotel.ListAllHotelsResponse")
    public List<Hotel> listAllHotels();

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "bindRoom", targetNamespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.soap.viajei.client.hotel.hotel.BindRoom")
    @ResponseWrapper(localName = "bindRoomResponse", targetNamespace = "http://ws.hotel.viajei.soap.pos.ifpb.edu.br/", className = "br.edu.ifpb.pos.soap.viajei.client.hotel.hotel.BindRoomResponse")
    public void bindRoom(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Long arg1);

}
