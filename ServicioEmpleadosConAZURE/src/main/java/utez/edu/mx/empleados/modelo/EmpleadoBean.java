package utez.edu.mx.empleados.modelo;

public class EmpleadoBean {
    private int idEmpleado;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String sexo;
    private String telefono;
    private String domicilio;
    private double sueldoMensual;

    public EmpleadoBean() {
    }

    public EmpleadoBean(int idEmpleado, String nombre, String primerApellido, String segundoApellido, String sexo, String telefono, String domicilio, double sueldoMensual) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.sexo = sexo;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.sueldoMensual = sueldoMensual;
    }

    public EmpleadoBean(String nombre, String primerApellido, String segundoApellido, String sexo, String telefono, String domicilio, double sueldoMensual) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.sexo = sexo;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.sueldoMensual = sueldoMensual;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public String toString() {
        return "EmpleadoBean{" +
                "idEmpleado=" + idEmpleado +
                ", nombre='" + nombre + '\'' +
                ", primerApellido='" + primerApellido + '\'' +
                ", segundoApellido='" + segundoApellido + '\'' +
                ", sexo='" + sexo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", sueldoMensual=" + sueldoMensual +
                '}';
    }
}
