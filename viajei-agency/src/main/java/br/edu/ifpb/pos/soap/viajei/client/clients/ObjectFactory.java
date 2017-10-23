
package br.edu.ifpb.pos.soap.viajei.client.clients;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.edu.ifpb.pos.soap.viajei.client.clients package. 
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

    private final static QName _Remove_QNAME = new QName("http://ws.client.viajei.soap.pos.ifpb.edu.br/", "remove");
    private final static QName _Update_QNAME = new QName("http://ws.client.viajei.soap.pos.ifpb.edu.br/", "update");
    private final static QName _RemoveResponse_QNAME = new QName("http://ws.client.viajei.soap.pos.ifpb.edu.br/", "removeResponse");
    private final static QName _ListAllResponse_QNAME = new QName("http://ws.client.viajei.soap.pos.ifpb.edu.br/", "listAllResponse");
    private final static QName _AddResponse_QNAME = new QName("http://ws.client.viajei.soap.pos.ifpb.edu.br/", "addResponse");
    private final static QName _Add_QNAME = new QName("http://ws.client.viajei.soap.pos.ifpb.edu.br/", "add");
    private final static QName _FindByCpf_QNAME = new QName("http://ws.client.viajei.soap.pos.ifpb.edu.br/", "findByCpf");
    private final static QName _UpdateResponse_QNAME = new QName("http://ws.client.viajei.soap.pos.ifpb.edu.br/", "updateResponse");
    private final static QName _Client_QNAME = new QName("http://ws.client.viajei.soap.pos.ifpb.edu.br/", "client");
    private final static QName _ListAll_QNAME = new QName("http://ws.client.viajei.soap.pos.ifpb.edu.br/", "listAll");
    private final static QName _FindByCpfResponse_QNAME = new QName("http://ws.client.viajei.soap.pos.ifpb.edu.br/", "findByCpfResponse");
    private final static QName _FindById_QNAME = new QName("http://ws.client.viajei.soap.pos.ifpb.edu.br/", "findById");
    private final static QName _FindByIdResponse_QNAME = new QName("http://ws.client.viajei.soap.pos.ifpb.edu.br/", "findByIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.edu.ifpb.pos.soap.viajei.client.clients
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link FindByCpf }
     * 
     */
    public FindByCpf createFindByCpf() {
        return new FindByCpf();
    }

    /**
     * Create an instance of {@link ListAllResponse }
     * 
     */
    public ListAllResponse createListAllResponse() {
        return new ListAllResponse();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link RemoveResponse }
     * 
     */
    public RemoveResponse createRemoveResponse() {
        return new RemoveResponse();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link Remove }
     * 
     */
    public Remove createRemove() {
        return new Remove();
    }

    /**
     * Create an instance of {@link FindByCpfResponse }
     * 
     */
    public FindByCpfResponse createFindByCpfResponse() {
        return new FindByCpfResponse();
    }

    /**
     * Create an instance of {@link FindById }
     * 
     */
    public FindById createFindById() {
        return new FindById();
    }

    /**
     * Create an instance of {@link FindByIdResponse }
     * 
     */
    public FindByIdResponse createFindByIdResponse() {
        return new FindByIdResponse();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link ListAll }
     * 
     */
    public ListAll createListAll() {
        return new ListAll();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Remove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.client.viajei.soap.pos.ifpb.edu.br/", name = "remove")
    public JAXBElement<Remove> createRemove(Remove value) {
        return new JAXBElement<Remove>(_Remove_QNAME, Remove.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.client.viajei.soap.pos.ifpb.edu.br/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.client.viajei.soap.pos.ifpb.edu.br/", name = "removeResponse")
    public JAXBElement<RemoveResponse> createRemoveResponse(RemoveResponse value) {
        return new JAXBElement<RemoveResponse>(_RemoveResponse_QNAME, RemoveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.client.viajei.soap.pos.ifpb.edu.br/", name = "listAllResponse")
    public JAXBElement<ListAllResponse> createListAllResponse(ListAllResponse value) {
        return new JAXBElement<ListAllResponse>(_ListAllResponse_QNAME, ListAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.client.viajei.soap.pos.ifpb.edu.br/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.client.viajei.soap.pos.ifpb.edu.br/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByCpf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.client.viajei.soap.pos.ifpb.edu.br/", name = "findByCpf")
    public JAXBElement<FindByCpf> createFindByCpf(FindByCpf value) {
        return new JAXBElement<FindByCpf>(_FindByCpf_QNAME, FindByCpf.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.client.viajei.soap.pos.ifpb.edu.br/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Client }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.client.viajei.soap.pos.ifpb.edu.br/", name = "client")
    public JAXBElement<Client> createClient(Client value) {
        return new JAXBElement<Client>(_Client_QNAME, Client.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.client.viajei.soap.pos.ifpb.edu.br/", name = "listAll")
    public JAXBElement<ListAll> createListAll(ListAll value) {
        return new JAXBElement<ListAll>(_ListAll_QNAME, ListAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByCpfResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.client.viajei.soap.pos.ifpb.edu.br/", name = "findByCpfResponse")
    public JAXBElement<FindByCpfResponse> createFindByCpfResponse(FindByCpfResponse value) {
        return new JAXBElement<FindByCpfResponse>(_FindByCpfResponse_QNAME, FindByCpfResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.client.viajei.soap.pos.ifpb.edu.br/", name = "findById")
    public JAXBElement<FindById> createFindById(FindById value) {
        return new JAXBElement<FindById>(_FindById_QNAME, FindById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.client.viajei.soap.pos.ifpb.edu.br/", name = "findByIdResponse")
    public JAXBElement<FindByIdResponse> createFindByIdResponse(FindByIdResponse value) {
        return new JAXBElement<FindByIdResponse>(_FindByIdResponse_QNAME, FindByIdResponse.class, null, value);
    }

}
