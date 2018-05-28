
package introsde.project.adopter.recombee.soap;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "RecombeeInterface", targetNamespace = "http://soap.recombee.adopter.project.introsde/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface RecombeeInterface {


    /**
     * 
     * @param itemId
     * @param itemType
     * @param dbName
     * @param location
     * @return
     *     returns introsde.project.adopter.recombee.soap.ItemObject
     */
    @WebMethod
    @WebResult(name = "String", targetNamespace = "")
    @RequestWrapper(localName = "additem", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.Additem")
    @ResponseWrapper(localName = "additemResponse", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.AdditemResponse")
    @Action(input = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/additemRequest", output = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/additemResponse")
    public ItemObject additem(
        @WebParam(name = "dbName", targetNamespace = "")
        RecombeeDBType dbName,
        @WebParam(name = "itemId", targetNamespace = "")
        String itemId,
        @WebParam(name = "itemType", targetNamespace = "")
        String itemType,
        @WebParam(name = "location", targetNamespace = "")
        String location);

    /**
     * 
     * @param dbName
     * @param rating
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "boolean", targetNamespace = "")
    @RequestWrapper(localName = "addRating", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.AddRating")
    @ResponseWrapper(localName = "addRatingResponse", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.AddRatingResponse")
    @Action(input = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/addRatingRequest", output = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/addRatingResponse")
    public boolean addRating(
        @WebParam(name = "dbName", targetNamespace = "")
        RecombeeDBType dbName,
        @WebParam(name = "rating", targetNamespace = "")
        Evaluation rating);

    /**
     * 
     * @param dbName
     * @param rating
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "boolean", targetNamespace = "")
    @RequestWrapper(localName = "modifyRating", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.ModifyRating")
    @ResponseWrapper(localName = "modifyRatingResponse", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.ModifyRatingResponse")
    @Action(input = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/modifyRatingRequest", output = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/modifyRatingResponse")
    public boolean modifyRating(
        @WebParam(name = "dbName", targetNamespace = "")
        RecombeeDBType dbName,
        @WebParam(name = "rating", targetNamespace = "")
        Evaluation rating);

    /**
     * 
     * @param itemId
     * @param dbName
     * @return
     *     returns java.util.List<introsde.project.adopter.recombee.soap.Evaluation>
     */
    @WebMethod
    @WebResult(name = "ratingList", targetNamespace = "")
    @RequestWrapper(localName = "getItemRatings", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.GetItemRatings")
    @ResponseWrapper(localName = "getItemRatingsResponse", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.GetItemRatingsResponse")
    @Action(input = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/getItemRatingsRequest", output = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/getItemRatingsResponse")
    public List<Evaluation> getItemRatings(
        @WebParam(name = "dbName", targetNamespace = "")
        RecombeeDBType dbName,
        @WebParam(name = "itemId", targetNamespace = "")
        String itemId);

    /**
     * 
     * @param dbName
     * @param userId
     * @return
     *     returns java.util.List<introsde.project.adopter.recombee.soap.Evaluation>
     */
    @WebMethod
    @WebResult(name = "ratingList", targetNamespace = "")
    @RequestWrapper(localName = "getUserRatings", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.GetUserRatings")
    @ResponseWrapper(localName = "getUserRatingsResponse", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.GetUserRatingsResponse")
    @Action(input = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/getUserRatingsRequest", output = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/getUserRatingsResponse")
    public List<Evaluation> getUserRatings(
        @WebParam(name = "dbName", targetNamespace = "")
        RecombeeDBType dbName,
        @WebParam(name = "userId", targetNamespace = "")
        String userId);

    /**
     * 
     * @param quantity
     * @param dbName
     * @param userId
     * @return
     *     returns java.util.List<introsde.project.adopter.recombee.soap.ItemObject>
     */
    @WebMethod
    @WebResult(name = "recommendations", targetNamespace = "")
    @RequestWrapper(localName = "getRec4User", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.GetRec4User")
    @ResponseWrapper(localName = "getRec4UserResponse", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.GetRec4UserResponse")
    @Action(input = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/getRec4UserRequest", output = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/getRec4UserResponse")
    public List<ItemObject> getRec4User(
        @WebParam(name = "dbName", targetNamespace = "")
        RecombeeDBType dbName,
        @WebParam(name = "userId", targetNamespace = "")
        String userId,
        @WebParam(name = "quantity", targetNamespace = "")
        int quantity);

    /**
     * 
     * @param itemName
     * @param dbName
     * @return
     *     returns java.util.List<introsde.project.adopter.recombee.soap.ItemObject>
     */
    @WebMethod
    @WebResult(name = "StringList", targetNamespace = "")
    @RequestWrapper(localName = "getItemsByType", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.GetItemsByType")
    @ResponseWrapper(localName = "getItemsByTypeResponse", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.GetItemsByTypeResponse")
    @Action(input = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/getItemsByTypeRequest", output = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/getItemsByTypeResponse")
    public List<ItemObject> getItemsByType(
        @WebParam(name = "dbName", targetNamespace = "")
        RecombeeDBType dbName,
        @WebParam(name = "itemName", targetNamespace = "")
        String itemName);

    /**
     * 
     * @param dbName
     * @return
     *     returns java.util.List<introsde.project.adopter.recombee.soap.ItemObject>
     */
    @WebMethod
    @WebResult(name = "StringList", targetNamespace = "")
    @RequestWrapper(localName = "getAllItem", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.GetAllItem")
    @ResponseWrapper(localName = "getAllItemResponse", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.GetAllItemResponse")
    @Action(input = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/getAllItemRequest", output = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/getAllItemResponse")
    public List<ItemObject> getAllItem(
        @WebParam(name = "dbName", targetNamespace = "")
        RecombeeDBType dbName);

    /**
     * 
     * @param dbName
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "boolean", targetNamespace = "")
    @RequestWrapper(localName = "resetBD", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.ResetBD")
    @ResponseWrapper(localName = "resetBDResponse", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.ResetBDResponse")
    @Action(input = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/resetBDRequest", output = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/resetBDResponse")
    public boolean resetBD(
        @WebParam(name = "dbName", targetNamespace = "")
        RecombeeDBType dbName);

    /**
     * 
     * @param dbName
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "boolean", targetNamespace = "")
    @RequestWrapper(localName = "initBD", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.InitBD")
    @ResponseWrapper(localName = "initBDResponse", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.InitBDResponse")
    @Action(input = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/initBDRequest", output = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/initBDResponse")
    public boolean initBD(
        @WebParam(name = "dbName", targetNamespace = "")
        RecombeeDBType dbName);

    /**
     * 
     * @param itemName
     * @param dbName
     * @return
     *     returns introsde.project.adopter.recombee.soap.ItemObject
     */
    @WebMethod
    @WebResult(name = "ListOfPropertiesofItems", targetNamespace = "")
    @RequestWrapper(localName = "getItem", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.GetItem")
    @ResponseWrapper(localName = "getItemResponse", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.GetItemResponse")
    @Action(input = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/getItemRequest", output = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/getItemResponse")
    public ItemObject getItem(
        @WebParam(name = "dbName", targetNamespace = "")
        RecombeeDBType dbName,
        @WebParam(name = "itemName", targetNamespace = "")
        String itemName);

    /**
     * 
     * @param preitem
     * @param dbName
     * @param userId
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(name = "boolean", targetNamespace = "")
    @RequestWrapper(localName = "addUser", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.AddUser")
    @ResponseWrapper(localName = "addUserResponse", targetNamespace = "http://soap.recombee.adopter.project.introsde/", className = "introsde.project.adopter.recombee.soap.AddUserResponse")
    @Action(input = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/addUserRequest", output = "http://soap.recombee.adopter.project.introsde/RecombeeInterface/addUserResponse")
    public boolean addUser(
        @WebParam(name = "dbName", targetNamespace = "")
        RecombeeDBType dbName,
        @WebParam(name = "userId", targetNamespace = "")
        String userId,
        @WebParam(name = "preitem", targetNamespace = "")
        List<String> preitem);

}
