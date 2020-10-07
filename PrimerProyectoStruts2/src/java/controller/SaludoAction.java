
package controller;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 *
 * @author Hector Saldaña
 */
public class SaludoAction {

    private String nombre;
    private String saludo;

    //ESTE METODO LO LLAMA STRUTS.XML
    public String saludarMetodo() {
        saludo = "¡Hola " + nombre + ", bienvenid@ a tu primera App Web en Struts!";
        return ERROR;
        //SIEMPRE DEBEMOS REGRESAR SUCCESS O ERROR, SI SE HIZO BIEN ALGO
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
