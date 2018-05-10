
package introsde.project.data.local.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.project.data.local.soap package. 
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

    private final static QName _FoodType_QNAME = new QName("http://soap.local.data.project.introsde/", "food_Type");
    private final static QName _UpdatePerson_QNAME = new QName("http://soap.local.data.project.introsde/", "updatePerson");
    private final static QName _Person_QNAME = new QName("http://soap.local.data.project.introsde/", "Person");
    private final static QName _GetPerson_QNAME = new QName("http://soap.local.data.project.introsde/", "getPerson");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://soap.local.data.project.introsde/", "updatePersonResponse");
    private final static QName _GetFoodTypesResponse_QNAME = new QName("http://soap.local.data.project.introsde/", "getFoodTypesResponse");
    private final static QName _GetPersonResponse_QNAME = new QName("http://soap.local.data.project.introsde/", "getPersonResponse");
    private final static QName _MovieGen_QNAME = new QName("http://soap.local.data.project.introsde/", "movie_Gen");
    private final static QName _AddPerson_QNAME = new QName("http://soap.local.data.project.introsde/", "addPerson");
    private final static QName _GetMovieGens_QNAME = new QName("http://soap.local.data.project.introsde/", "getMovieGens");
    private final static QName _GetMovieGensResponse_QNAME = new QName("http://soap.local.data.project.introsde/", "getMovieGensResponse");
    private final static QName _AddPersonResponse_QNAME = new QName("http://soap.local.data.project.introsde/", "addPersonResponse");
    private final static QName _GetFoodTypes_QNAME = new QName("http://soap.local.data.project.introsde/", "getFoodTypes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.project.data.local.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddPersonResponse }
     * 
     */
    public AddPersonResponse createAddPersonResponse() {
        return new AddPersonResponse();
    }

    /**
     * Create an instance of {@link GetFoodTypes }
     * 
     */
    public GetFoodTypes createGetFoodTypes() {
        return new GetFoodTypes();
    }

    /**
     * Create an instance of {@link AddPerson }
     * 
     */
    public AddPerson createAddPerson() {
        return new AddPerson();
    }

    /**
     * Create an instance of {@link GetMovieGens }
     * 
     */
    public GetMovieGens createGetMovieGens() {
        return new GetMovieGens();
    }

    /**
     * Create an instance of {@link GetMovieGensResponse }
     * 
     */
    public GetMovieGensResponse createGetMovieGensResponse() {
        return new GetMovieGensResponse();
    }

    /**
     * Create an instance of {@link GetPerson }
     * 
     */
    public GetPerson createGetPerson() {
        return new GetPerson();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link GetFoodTypesResponse }
     * 
     */
    public GetFoodTypesResponse createGetFoodTypesResponse() {
        return new GetFoodTypesResponse();
    }

    /**
     * Create an instance of {@link GetPersonResponse }
     * 
     */
    public GetPersonResponse createGetPersonResponse() {
        return new GetPersonResponse();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FoodType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.local.data.project.introsde/", name = "food_Type")
    public JAXBElement<FoodType> createFoodType(FoodType value) {
        return new JAXBElement<FoodType>(_FoodType_QNAME, FoodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.local.data.project.introsde/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.local.data.project.introsde/", name = "Person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.local.data.project.introsde/", name = "getPerson")
    public JAXBElement<GetPerson> createGetPerson(GetPerson value) {
        return new JAXBElement<GetPerson>(_GetPerson_QNAME, GetPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.local.data.project.introsde/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFoodTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.local.data.project.introsde/", name = "getFoodTypesResponse")
    public JAXBElement<GetFoodTypesResponse> createGetFoodTypesResponse(GetFoodTypesResponse value) {
        return new JAXBElement<GetFoodTypesResponse>(_GetFoodTypesResponse_QNAME, GetFoodTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.local.data.project.introsde/", name = "getPersonResponse")
    public JAXBElement<GetPersonResponse> createGetPersonResponse(GetPersonResponse value) {
        return new JAXBElement<GetPersonResponse>(_GetPersonResponse_QNAME, GetPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MovieGen }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.local.data.project.introsde/", name = "movie_Gen")
    public JAXBElement<MovieGen> createMovieGen(MovieGen value) {
        return new JAXBElement<MovieGen>(_MovieGen_QNAME, MovieGen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.local.data.project.introsde/", name = "addPerson")
    public JAXBElement<AddPerson> createAddPerson(AddPerson value) {
        return new JAXBElement<AddPerson>(_AddPerson_QNAME, AddPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovieGens }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.local.data.project.introsde/", name = "getMovieGens")
    public JAXBElement<GetMovieGens> createGetMovieGens(GetMovieGens value) {
        return new JAXBElement<GetMovieGens>(_GetMovieGens_QNAME, GetMovieGens.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMovieGensResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.local.data.project.introsde/", name = "getMovieGensResponse")
    public JAXBElement<GetMovieGensResponse> createGetMovieGensResponse(GetMovieGensResponse value) {
        return new JAXBElement<GetMovieGensResponse>(_GetMovieGensResponse_QNAME, GetMovieGensResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.local.data.project.introsde/", name = "addPersonResponse")
    public JAXBElement<AddPersonResponse> createAddPersonResponse(AddPersonResponse value) {
        return new JAXBElement<AddPersonResponse>(_AddPersonResponse_QNAME, AddPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFoodTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.local.data.project.introsde/", name = "getFoodTypes")
    public JAXBElement<GetFoodTypes> createGetFoodTypes(GetFoodTypes value) {
        return new JAXBElement<GetFoodTypes>(_GetFoodTypes_QNAME, GetFoodTypes.class, null, value);
    }

}
