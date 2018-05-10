
package introsde.project.adopter.recombee.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for additem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="additem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dbName" type="{http://soap.recombee.adopter.project.introsde/}recombeeDBType" minOccurs="0"/>
 *         &lt;element name="itemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "additem", propOrder = {
    "dbName",
    "itemId",
    "itemType",
    "location"
})
public class Additem {

    @XmlSchemaType(name = "string")
    protected RecombeeDBType dbName;
    protected String itemId;
    protected String itemType;
    protected String location;

    /**
     * Gets the value of the dbName property.
     * 
     * @return
     *     possible object is
     *     {@link RecombeeDBType }
     *     
     */
    public RecombeeDBType getDbName() {
        return dbName;
    }

    /**
     * Sets the value of the dbName property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecombeeDBType }
     *     
     */
    public void setDbName(RecombeeDBType value) {
        this.dbName = value;
    }

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemId(String value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the itemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * Sets the value of the itemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemType(String value) {
        this.itemType = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

}
