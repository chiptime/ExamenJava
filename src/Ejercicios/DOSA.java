package Ejercicios;

import Ejercicios.AlumnoDosa.Alumno;
import Ejercicios.AlumnoDosa.ESO;
import Ejercicios.AlumnoDosa.FP;

public class DOSA {

    public static Alumno alumno1 = new Alumno("Diego","Mompo",19,"Su casa","España");
    public static Alumno alumno2 = new Alumno("Ignacio","Anton",19,"Su casa","España");
    public static ESO alumnoEso = new ESO("Diego","Mompo",19,"Su casa","España","DOSA",false);
    public static ESO alumnoEso1 = new ESO("Ignacio","Anton",19,"Su casa","España","DOSA",false);
    public static FP alumnoFP = new FP("Angel","Garcia", 19,"Su casa","España",'H',9);
    public static FP alumnoFP1 = new FP("David","Loarte", 21,"Su casa","España",'H',5);

    public static void imprimirAlumnos(Alumno alumno){
        System.out.print(alumno.getNombre()+"\t" + alumno.getApellidos()+ "\t|" + alumno.getEdad() + "\t|" + alumno.getDomicilio() + "\t|" + alumno.getNacionalidad());
        System.out.println();
    }
    public static void imprimirAlumnosESO(ESO alumno){
        System.out.print(alumno.getNombre()+"\t" + alumno.getApellidos()+ "\t|" + alumno.getEdad() + "\t|" + alumno.getDomicilio() + "\t|" + alumno.getNacionalidad() + "\t|" + alumno.getCentro() + "\t|" + alumno.isRepetidor());
        System.out.println();
    }
    public static void imprimirAlumnosFP(FP alumno){
        System.out.print(alumno.getNombre()+"\t" + alumno.getApellidos()+ "\t" + alumno.getEdad() + "\t|" + alumno.getDomicilio() + "\t|" + alumno.getNacionalidad() + "\t|" + alumno.getNotaMediaAnterior() + "\t|" + alumno.getSexo() );
        System.out.println();
    }
}
