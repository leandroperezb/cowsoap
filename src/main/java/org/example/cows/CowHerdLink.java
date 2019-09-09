//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.09.09 a las 07:36:23 PM ART 
//


package org.example.cows;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="idcow" type="{http://www.w3.org/2001/XMLSchema}IDREF"/>
 *         &lt;element name="idherd" type="{http://www.w3.org/2001/XMLSchema}IDREF"/>
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
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object idcow;
    @XmlElement(required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object idherd;

    /**
     * Obtiene el valor de la propiedad idcow.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIdcow() {
        return idcow;
    }

    /**
     * Define el valor de la propiedad idcow.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIdcow(Object value) {
        this.idcow = value;
    }

    /**
     * Obtiene el valor de la propiedad idherd.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIdherd() {
        return idherd;
    }

    /**
     * Define el valor de la propiedad idherd.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIdherd(Object value) {
        this.idherd = value;
    }

}
