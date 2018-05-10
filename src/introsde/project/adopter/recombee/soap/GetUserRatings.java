
package introsde.project.adopter.recombee.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getUserRatings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getUserRatings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dbName" type="{http://soap.recombee.adopter.project.introsde/}recombeeDBType" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserRatings", propOrder = {
    "dbName",
    "userId"
})
public class GetUserRatings {

    @XmlSchemaType(name = "string")
    protected RecombeeDBType dbName;
    protected String userId;

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
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

}
