
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
 *         &lt;element name="TipoCambioFechaInicialResult" type="{http://www.banguat.gob.gt/variables/ws/}DataVariable" minOccurs="0"/&gt;
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
    "tipoCambioFechaInicialResult"
})
@XmlRootElement(name = "TipoCambioFechaInicialResponse")
public class TipoCambioFechaInicialResponse {

    @XmlElement(name = "TipoCambioFechaInicialResult")
    protected DataVariable tipoCambioFechaInicialResult;

    /**
     * Gets the value of the tipoCambioFechaInicialResult property.
     * 
     * @return
     *     possible object is
     *     {@link DataVariable }
     *     
     */
    public DataVariable getTipoCambioFechaInicialResult() {
        return tipoCambioFechaInicialResult;
    }

    /**
     * Sets the value of the tipoCambioFechaInicialResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataVariable }
     *     
     */
    public void setTipoCambioFechaInicialResult(DataVariable value) {
        this.tipoCambioFechaInicialResult = value;
    }

}
