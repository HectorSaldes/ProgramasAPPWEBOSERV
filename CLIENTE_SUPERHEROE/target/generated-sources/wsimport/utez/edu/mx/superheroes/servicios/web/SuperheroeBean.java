
package utez.edu.mx.superheroes.servicios.web;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para superheroeBean complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="superheroeBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="debut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="poder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "superheroeBean", propOrder = {
    "debut",
    "id",
    "nombre",
    "poder"
})
public class SuperheroeBean {

    protected String debut;
    protected int id;
    protected String nombre;
    protected String poder;

    /**
     * Obtiene el valor de la propiedad debut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebut() {
        return debut;
    }

    /**
     * Define el valor de la propiedad debut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebut(String value) {
        this.debut = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad poder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoder() {
        return poder;
    }

    /**
     * Define el valor de la propiedad poder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoder(String value) {
        this.poder = value;
    }

}