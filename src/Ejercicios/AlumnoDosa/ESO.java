package Ejercicios.AlumnoDosa;

public class ESO extends Alumno{

    private String centro;
    private boolean repetidor;

    public ESO(String nombre, String apellidos, int edad, String domicilio, String nacionalidad, String centro, boolean repetidor) {
        super(nombre, apellidos, edad, domicilio, nacionalidad);
        this.centro = centro;
        this.repetidor = repetidor;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public boolean isRepetidor() {
        return repetidor;
    }

    public void setRepetidor(boolean repetidor) {
        this.repetidor = repetidor;
    }

}
