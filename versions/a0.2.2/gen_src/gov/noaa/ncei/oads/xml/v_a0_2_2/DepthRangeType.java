//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.29 at 04:20:46 PM PDT 
//


package gov.noaa.ncei.oads.xml.v_a0_2_2;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for depth_range_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="depth_range_type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maxDepth" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="minDepth" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "depth_range_type", propOrder = {
    "maxDepth",
    "minDepth"
})
public class DepthRangeType implements Serializable
{

    private final static long serialVersionUID = 101L;
    @XmlElement(required = true)
    protected BigDecimal maxDepth;
    @XmlElement(required = true)
    protected BigDecimal minDepth;

    /**
     * Gets the value of the maxDepth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxDepth() {
        return maxDepth;
    }

    /**
     * Sets the value of the maxDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxDepth(BigDecimal value) {
        this.maxDepth = value;
    }

    public boolean isSetMaxDepth() {
        return (this.maxDepth!= null);
    }

    /**
     * Gets the value of the minDepth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinDepth() {
        return minDepth;
    }

    /**
     * Sets the value of the minDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinDepth(BigDecimal value) {
        this.minDepth = value;
    }

    public boolean isSetMinDepth() {
        return (this.minDepth!= null);
    }

}
