package controller.operaciones;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;

/**
 *
 * @author Hector Saldaña
 */
public class OperacionesAction {

    //LAS VARIABLES SE DEBEN LLAMAR IGUA Y EN EL MISMO ORDEN
    private double numero1;
    private double numero2;
    private String operacion;
    private String resultado;

    public String calcular() {       
        switch (operacion) {
            case "Suma":   return suma();              
            case "Resta": return resta();            
            case "Multiplicación": return multiplicacion();              
            case "Divición":return division();               
        }
        return ERROR;
    }

    public String division() {
        if (numero1 == 0.0 || numero2 == 0.0) {
            resultado = "Ups... Ocurrió un error";
            return ERROR;
        } else {
            resultado = "" + (numero1 / numero2);
            return SUCCESS;
        }
    }

    public String multiplicacion() {
        if (numero1 == 0.0 || numero2 == 0.0) {
            resultado = "Ups... Ocurrió un error";
            return ERROR;
        } else {
            resultado = "" + (numero1 * numero2);
            return SUCCESS;
        }
    }

    public String resta() {
        if (numero1 == 0.0 || numero2 == 0.0) {
            resultado = "Ups... Ocurrió un error";
            return ERROR;
        } else {
            resultado = "" + (numero1 - numero2);
            return SUCCESS;
        }
    }

    public String suma() {
        if (numero1 == 0.0 || numero2 == 0.0) {
            resultado = "Ups... Ocurrió un error";
            return ERROR;
        } else {
            resultado = "" + (numero1 + numero2);
            return SUCCESS;
        }
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

}
