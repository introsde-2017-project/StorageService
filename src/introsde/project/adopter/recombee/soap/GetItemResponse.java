
package introsde.project.adopter.recombee.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getItemResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getItemResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListOfPropertiesofItems" type="{http://soap.recombee.adopter.project.introsde/}itemObject" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getItemResponse", propOrder = {
    "listOfPropertiesofItems"
})
public class GetItemResponse {

    @XmlElement(name = "ListOfPropertiesofItems")
    protected ItemObject listOfPropertiesofItems;

    /**
     * Gets the value of the listOfPropertiesofItems property.
     * 
     * @return
     *     possible object is
     *     {@link ItemObject }
     *     
     */
    public ItemObject getListOfPropertiesofItems() {
        return listOfPropertiesofItems;
    }

    /**
     * Sets the value of the listOfPropertiesofItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemObject }
     *     
     */
    public void setListOfPropertiesofItems(ItemObject value) {
        this.listOfPropertiesofItems = value;
    }

}
