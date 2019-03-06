//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.06 at 08:47:27 AM PST 
//


package gov.noaa.pmel.oads.v_a0_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for co2_atonomous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="co2_atonomous">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ncei.noaa.gov/oads_metadata}co2_base">
 *       &lt;sequence>
 *         &lt;element name="locationSeawaterIntake" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="depthSeawaterIntake" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="equilibrator" type="{http://ncei.noaa.gov/oads_metadata}equilibrator_type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "co2_atonomous", propOrder = {
    "locationSeawaterIntake",
    "depthSeawaterIntake",
    "equilibrator"
})
public class Co2Atonomous
    extends Co2Base
{

    protected String locationSeawaterIntake;
    protected String depthSeawaterIntake;
    protected EquilibratorType equilibrator;

    /**
     * Gets the value of the locationSeawaterIntake property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationSeawaterIntake() {
        return locationSeawaterIntake;
    }

    /**
     * Sets the value of the locationSeawaterIntake property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationSeawaterIntake(String value) {
        this.locationSeawaterIntake = value;
    }

    /**
     * Gets the value of the depthSeawaterIntake property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepthSeawaterIntake() {
        return depthSeawaterIntake;
    }

    /**
     * Sets the value of the depthSeawaterIntake property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepthSeawaterIntake(String value) {
        this.depthSeawaterIntake = value;
    }

    /**
     * Gets the value of the equilibrator property.
     * 
     * @return
     *     possible object is
     *     {@link EquilibratorType }
     *     
     */
    public EquilibratorType getEquilibrator() {
        return equilibrator;
    }

    /**
     * Sets the value of the equilibrator property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquilibratorType }
     *     
     */
    public void setEquilibrator(EquilibratorType value) {
        this.equilibrator = value;
    }

}
