//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.06 at 08:47:27 AM PST 
//


package gov.noaa.pmel.oads.v_a0_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ph_sample_type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ph_sample_type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ncei.noaa.gov/oads_metadata}measured_variable">
 *       &lt;sequence>
 *         &lt;element name="phScale" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="measurementTemperature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="temperatureCorrection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phReportTemperature" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ph_sample_type", propOrder = {
    "phScale",
    "measurementTemperature",
    "temperatureCorrection",
    "phReportTemperature"
})
public class PhSampleType
    extends MeasuredVariable
{

    @XmlElement(required = true)
    protected String phScale;
    protected String measurementTemperature;
    protected String temperatureCorrection;
    @XmlElement(required = true)
    protected String phReportTemperature;

    /**
     * Gets the value of the phScale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhScale() {
        return phScale;
    }

    /**
     * Sets the value of the phScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhScale(String value) {
        this.phScale = value;
    }

    /**
     * Gets the value of the measurementTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementTemperature() {
        return measurementTemperature;
    }

    /**
     * Sets the value of the measurementTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementTemperature(String value) {
        this.measurementTemperature = value;
    }

    /**
     * Gets the value of the temperatureCorrection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemperatureCorrection() {
        return temperatureCorrection;
    }

    /**
     * Sets the value of the temperatureCorrection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemperatureCorrection(String value) {
        this.temperatureCorrection = value;
    }

    /**
     * Gets the value of the phReportTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhReportTemperature() {
        return phReportTemperature;
    }

    /**
     * Sets the value of the phReportTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhReportTemperature(String value) {
        this.phReportTemperature = value;
    }

}
