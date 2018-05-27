
package introsde.project.adopter.recombee.soap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getItemsByTypeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getItemsByTypeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StringList" type="{http://soap.recombee.adopter.project.introsde/}itemObject" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getItemsByTypeResponse", propOrder = {
    "stringList"
})
public class GetItemsByTypeResponse {

    @XmlElement(name = "StringList")
    protected List<ItemObject> stringList;

    /**
     * Gets the value of the stringList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stringList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStringList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemObject }
     * 
     * 
     */
    public List<ItemObject> getStringList() {
        if (stringList == null) {
            stringList = new ArrayList<ItemObject>();
        }
        return this.stringList;
    }

}
