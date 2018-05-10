
package introsde.project.adopter.recombee.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.project.adopter.recombee.soap package. 
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

    private final static QName _Evaluation_QNAME = new QName("http://soap.recombee.adopter.project.introsde/", "evaluation");
    private final static QName _ModifyRatingResponse_QNAME = new QName("http://soap.recombee.adopter.project.introsde/", "modifyRatingResponse");
    private final static QName _AddRating_QNAME = new QName("http://soap.recombee.adopter.project.introsde/", "addRating");
    private final static QName _GetItemRatingsResponse_QNAME = new QName("http://soap.recombee.adopter.project.introsde/", "getItemRatingsResponse");
    private final static QName _GetItemResponse_QNAME = new QName("http://soap.recombee.adopter.project.introsde/", "getItemResponse");
    private final static QName _AdditemResponse_QNAME = new QName("http://soap.recombee.adopter.project.introsde/", "additemResponse");
    private final static QName _GetRec4UserResponse_QNAME = new QName("http://soap.recombee.adopter.project.introsde/", "getRec4UserResponse");
    private final static QName _AddUserResponse_QNAME = new QName("http://soap.recombee.adopter.project.introsde/", "addUserResponse");
    private final static QName _RecombeeDBType_QNAME = new QName("http://soap.recombee.adopter.project.introsde/", "RecombeeDBType");
    private final static QName _ModifyRating_QNAME = new QName("http://soap.recombee.adopter.project.introsde/", "modifyRating");
    private final static QName _AddUser_QNAME = new QName("http://soap.recombee.adopter.project.introsde/", "addUser");
    private final static QName _Additem_QNAME = new QName("http://soap.recombee.adopter.project.introsde/", "additem");
    private final static QName _GetUserRatingsResponse_QNAME = new QName("http://soap.recombee.adopter.project.introsde/", "getUserRatingsResponse");
    private final static QName _GetItem_QNAME = new QName("http://soap.recombee.adopter.project.introsde/", "getItem");
    private final static QName _AddRatingResponse_QNAME = new QName("http://soap.recombee.adopter.project.introsde/", "addRatingResponse");
    private final static QName _GetUserRatings_QNAME = new QName("http://soap.recombee.adopter.project.introsde/", "getUserRatings");
    private final static QName _GetItemRatings_QNAME = new QName("http://soap.recombee.adopter.project.introsde/", "getItemRatings");
    private final static QName _GetRec4User_QNAME = new QName("http://soap.recombee.adopter.project.introsde/", "getRec4User");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.project.adopter.recombee.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ModifyRating }
     * 
     */
    public ModifyRating createModifyRating() {
        return new ModifyRating();
    }

    /**
     * Create an instance of {@link AddUser }
     * 
     */
    public AddUser createAddUser() {
        return new AddUser();
    }

    /**
     * Create an instance of {@link Additem }
     * 
     */
    public Additem createAdditem() {
        return new Additem();
    }

    /**
     * Create an instance of {@link GetUserRatingsResponse }
     * 
     */
    public GetUserRatingsResponse createGetUserRatingsResponse() {
        return new GetUserRatingsResponse();
    }

    /**
     * Create an instance of {@link GetItem }
     * 
     */
    public GetItem createGetItem() {
        return new GetItem();
    }

    /**
     * Create an instance of {@link AddRatingResponse }
     * 
     */
    public AddRatingResponse createAddRatingResponse() {
        return new AddRatingResponse();
    }

    /**
     * Create an instance of {@link GetUserRatings }
     * 
     */
    public GetUserRatings createGetUserRatings() {
        return new GetUserRatings();
    }

    /**
     * Create an instance of {@link GetItemRatings }
     * 
     */
    public GetItemRatings createGetItemRatings() {
        return new GetItemRatings();
    }

    /**
     * Create an instance of {@link GetRec4User }
     * 
     */
    public GetRec4User createGetRec4User() {
        return new GetRec4User();
    }

    /**
     * Create an instance of {@link Evaluation }
     * 
     */
    public Evaluation createEvaluation() {
        return new Evaluation();
    }

    /**
     * Create an instance of {@link ModifyRatingResponse }
     * 
     */
    public ModifyRatingResponse createModifyRatingResponse() {
        return new ModifyRatingResponse();
    }

    /**
     * Create an instance of {@link AddRating }
     * 
     */
    public AddRating createAddRating() {
        return new AddRating();
    }

    /**
     * Create an instance of {@link GetItemRatingsResponse }
     * 
     */
    public GetItemRatingsResponse createGetItemRatingsResponse() {
        return new GetItemRatingsResponse();
    }

    /**
     * Create an instance of {@link GetItemResponse }
     * 
     */
    public GetItemResponse createGetItemResponse() {
        return new GetItemResponse();
    }

    /**
     * Create an instance of {@link AdditemResponse }
     * 
     */
    public AdditemResponse createAdditemResponse() {
        return new AdditemResponse();
    }

    /**
     * Create an instance of {@link GetRec4UserResponse }
     * 
     */
    public GetRec4UserResponse createGetRec4UserResponse() {
        return new GetRec4UserResponse();
    }

    /**
     * Create an instance of {@link AddUserResponse }
     * 
     */
    public AddUserResponse createAddUserResponse() {
        return new AddUserResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Evaluation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.recombee.adopter.project.introsde/", name = "evaluation")
    public JAXBElement<Evaluation> createEvaluation(Evaluation value) {
        return new JAXBElement<Evaluation>(_Evaluation_QNAME, Evaluation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyRatingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.recombee.adopter.project.introsde/", name = "modifyRatingResponse")
    public JAXBElement<ModifyRatingResponse> createModifyRatingResponse(ModifyRatingResponse value) {
        return new JAXBElement<ModifyRatingResponse>(_ModifyRatingResponse_QNAME, ModifyRatingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRating }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.recombee.adopter.project.introsde/", name = "addRating")
    public JAXBElement<AddRating> createAddRating(AddRating value) {
        return new JAXBElement<AddRating>(_AddRating_QNAME, AddRating.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemRatingsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.recombee.adopter.project.introsde/", name = "getItemRatingsResponse")
    public JAXBElement<GetItemRatingsResponse> createGetItemRatingsResponse(GetItemRatingsResponse value) {
        return new JAXBElement<GetItemRatingsResponse>(_GetItemRatingsResponse_QNAME, GetItemRatingsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.recombee.adopter.project.introsde/", name = "getItemResponse")
    public JAXBElement<GetItemResponse> createGetItemResponse(GetItemResponse value) {
        return new JAXBElement<GetItemResponse>(_GetItemResponse_QNAME, GetItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.recombee.adopter.project.introsde/", name = "additemResponse")
    public JAXBElement<AdditemResponse> createAdditemResponse(AdditemResponse value) {
        return new JAXBElement<AdditemResponse>(_AdditemResponse_QNAME, AdditemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRec4UserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.recombee.adopter.project.introsde/", name = "getRec4UserResponse")
    public JAXBElement<GetRec4UserResponse> createGetRec4UserResponse(GetRec4UserResponse value) {
        return new JAXBElement<GetRec4UserResponse>(_GetRec4UserResponse_QNAME, GetRec4UserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.recombee.adopter.project.introsde/", name = "addUserResponse")
    public JAXBElement<AddUserResponse> createAddUserResponse(AddUserResponse value) {
        return new JAXBElement<AddUserResponse>(_AddUserResponse_QNAME, AddUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecombeeDBType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.recombee.adopter.project.introsde/", name = "RecombeeDBType")
    public JAXBElement<RecombeeDBType> createRecombeeDBType(RecombeeDBType value) {
        return new JAXBElement<RecombeeDBType>(_RecombeeDBType_QNAME, RecombeeDBType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifyRating }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.recombee.adopter.project.introsde/", name = "modifyRating")
    public JAXBElement<ModifyRating> createModifyRating(ModifyRating value) {
        return new JAXBElement<ModifyRating>(_ModifyRating_QNAME, ModifyRating.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.recombee.adopter.project.introsde/", name = "addUser")
    public JAXBElement<AddUser> createAddUser(AddUser value) {
        return new JAXBElement<AddUser>(_AddUser_QNAME, AddUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Additem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.recombee.adopter.project.introsde/", name = "additem")
    public JAXBElement<Additem> createAdditem(Additem value) {
        return new JAXBElement<Additem>(_Additem_QNAME, Additem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserRatingsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.recombee.adopter.project.introsde/", name = "getUserRatingsResponse")
    public JAXBElement<GetUserRatingsResponse> createGetUserRatingsResponse(GetUserRatingsResponse value) {
        return new JAXBElement<GetUserRatingsResponse>(_GetUserRatingsResponse_QNAME, GetUserRatingsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.recombee.adopter.project.introsde/", name = "getItem")
    public JAXBElement<GetItem> createGetItem(GetItem value) {
        return new JAXBElement<GetItem>(_GetItem_QNAME, GetItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRatingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.recombee.adopter.project.introsde/", name = "addRatingResponse")
    public JAXBElement<AddRatingResponse> createAddRatingResponse(AddRatingResponse value) {
        return new JAXBElement<AddRatingResponse>(_AddRatingResponse_QNAME, AddRatingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserRatings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.recombee.adopter.project.introsde/", name = "getUserRatings")
    public JAXBElement<GetUserRatings> createGetUserRatings(GetUserRatings value) {
        return new JAXBElement<GetUserRatings>(_GetUserRatings_QNAME, GetUserRatings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemRatings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.recombee.adopter.project.introsde/", name = "getItemRatings")
    public JAXBElement<GetItemRatings> createGetItemRatings(GetItemRatings value) {
        return new JAXBElement<GetItemRatings>(_GetItemRatings_QNAME, GetItemRatings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRec4User }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.recombee.adopter.project.introsde/", name = "getRec4User")
    public JAXBElement<GetRec4User> createGetRec4User(GetRec4User value) {
        return new JAXBElement<GetRec4User>(_GetRec4User_QNAME, GetRec4User.class, null, value);
    }

}
