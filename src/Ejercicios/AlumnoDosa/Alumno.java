package Ejercicios.AlumnoDosa;

public class Alumno {
    private String nombre;
    private String apellidos;
    private int edad;
    private String domicilio;
    private String nacionalidad;


    public Alumno(String nombre, String apellidos, int edad, String domicilio, String nacionalidad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.domicilio = domicilio;
        this.nacionalidad = nacionalidad;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
