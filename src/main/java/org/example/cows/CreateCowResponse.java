//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.09.18 a las 03:18:58 PM ART 
//


package org.example.cows;

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
 *         &lt;element name="cow" type="{http://www.example.org/cows/}cow"/>
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
    "cow"
})
@XmlRootElement(name = "createCowResponse")
public class CreateCowResponse {

    @XmlElement(required = true)
    protected Cow cow;

    /**
     * Obtiene el valor de la propiedad cow.
     * 
     * @return
     *     possible object is
     *     {@link Cow }
     *     
     */
    public Cow getCow() {
        return cow;
    }

    /**
     * Define el valor de la propiedad cow.
     * 
     * @param value
     *     allowed object is
     *     {@link Cow }
     *     
     */
    public void setCow(Cow value) {
        this.cow = value;
    }

}
