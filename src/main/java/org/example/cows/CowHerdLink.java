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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para cowHerdLink complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cowHerdLink">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idcow" type="{http://www.w3.org/2001/XMLSchema}ID"/>
 *         &lt;element name="idherd" type="{http://www.w3.org/2001/XMLSchema}ID"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cowHerdLink", propOrder = {
    "idcow",
    "idherd"
})
public class CowHerdLink {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String idcow;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String idherd;

    /**
     * Obtiene el valor de la propiedad idcow.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdcow() {
        return idcow;
    }

    /**
     * Define el valor de la propiedad idcow.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdcow(String value) {
        this.idcow = value;
    }

    /**
     * Obtiene el valor de la propiedad idherd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdherd() {
        return idherd;
    }

    /**
     * Define el valor de la propiedad idherd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdherd(String value) {
        this.idherd = value;
    }

}
