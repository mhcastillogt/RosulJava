
package gt.gob.banguat.variables.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="fechainit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechafin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="moneda" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "fechainit",
    "fechafin",
    "moneda"
})
@XmlRootElement(name = "TipoCambioRangoMoneda")
public class TipoCambioRangoMoneda {

    protected String fechainit;
    protected String fechafin;
    protected int moneda;

    /**
     * Gets the value of the fechainit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechainit() {
        return fechainit;
    }

    /**
     * Sets the value of the fechainit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechainit(String value) {
        this.fechainit = value;
    }

    /**
     * Gets the value of the fechafin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechafin() {
        return fechafin;
    }

    /**
     * Sets the value of the fechafin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechafin(String value) {
        this.fechafin = value;
    }

    /**
     * Gets the value of the moneda property.
     * 
     */
    public int getMoneda() {
        return moneda;
    }

    /**
     * Sets the value of the moneda property.
     * 
     */
    public void setMoneda(int value) {
        this.moneda = value;
    }

}
