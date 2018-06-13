package Ejercicios.AlumnoDosa;

public class FP extends Alumno{

    private char sexo;
    private int notaMediaAnterior;

    public FP(String nombre, String apellidos, int edad, String domicilio, String nacionalidad, char sexo, int notaMediaAnterior) {
        super(nombre, apellidos, edad, domicilio, nacionalidad);
        this.sexo = sexo;
        this.notaMediaAnterior = notaMediaAnterior;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getNotaMediaAnterior() {
        return notaMediaAnterior;
    }

    public void setNotaMediaAnterior(int notaMediaAnterior) {
        this.notaMediaAnterior = notaMediaAnterior;
    }

    @Override
    public String toString() {
        return "FP{" +
                "sexo=" + sexo +
                ", notaMediaAnterior=" + notaMediaAnterior +
                "} " + super.toString();
    }

}
