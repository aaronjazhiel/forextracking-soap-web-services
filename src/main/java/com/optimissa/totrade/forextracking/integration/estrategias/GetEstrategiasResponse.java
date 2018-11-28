//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2018.11.27 a las 04:59:48 PM CET 
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
 *         &lt;element name="StudentDetails" type="{http://integration.forextracking.totrade.optimissa.com/estrategias}StudentDetails"/>
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
    "tg7066O"
})
@XmlRootElement(name = "GetEstrategiasResponse")
public class GetEstrategiasResponse {

    @XmlElement(name = "TG7066O", required = true)
    protected TG7066O tg7066O;

    public TG7066O getTg7066O() {
        return tg7066O;
    }

    public void setTg7066O(TG7066O tg7066O) {
        this.tg7066O = tg7066O;
    }
}
