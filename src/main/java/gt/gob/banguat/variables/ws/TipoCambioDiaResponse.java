
package gt.gob.banguat.variables.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TipoCambioDiaResult" type="{http://www.banguat.gob.gt/variables/ws/}InfoVariable" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tipoCambioDiaResult"
})
@XmlRootElement(name = "TipoCambioDiaResponse")
public class TipoCambioDiaResponse {

    @XmlElement(name = "TipoCambioDiaResult")
    protected InfoVariable tipoCambioDiaResult;

    /**
     * Gets the value of the tipoCambioDiaResult property.
     * 
     * @return
     *     possible object is
     *     {@link InfoVariable }
     *     
     */
    public InfoVariable getTipoCambioDiaResult() {
        return tipoCambioDiaResult;
    }

    /**
     * Sets the value of the tipoCambioDiaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoVariable }
     *     
     */
    public void setTipoCambioDiaResult(InfoVariable value) {
        this.tipoCambioDiaResult = value;
    }

}
