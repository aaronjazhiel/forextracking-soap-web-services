//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.11.28 a las 01:20:34 PM CET 
//


package com.optimissa.totrade.forextracking.integration.estrategias;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="opcion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numestrat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "opcion",
    "numestrat"
})
@XmlRootElement(name = "GetEstrategiasRequest")
public class GetEstrategiasRequest {

    @XmlElement(required = true)
    protected String opcion;
    @XmlElement(required = true)
    protected String numestrat;

    /**
     * Obtiene el valor de la propiedad opcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpcion() {
        return opcion;
    }

    /**
     * Define el valor de la propiedad opcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpcion(String value) {
        this.opcion = value;
    }

    /**
     * Obtiene el valor de la propiedad numestrat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumestrat() {
        return numestrat;
    }

    /**
     * Define el valor de la propiedad numestrat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumestrat(String value) {
        this.numestrat = value;
    }

}
