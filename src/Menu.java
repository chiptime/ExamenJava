import Ejercicios.DOSA;
import Ejercicios.Nomina;

import java.util.Scanner;

import static Ejercicios.Matriz.iniciar;

public class Menu {
    private static final Scanner eleccion = new Scanner(System.in);



    public static void menu() {

        boolean terminar = false;

        do {
            System.out.println("\n" +
                    "Elige una opcion: \n\n"
                    + "Ejercicio 1\n"
                    + "Ejercicio 2\n"
                    + "Ejercicio 3\n"
                    + "Salir\n"
            );

            int opcion = eleccion.nextInt();

            switch (opcion) {

                case 1:
                    iniciar(4, 4);
                    break;
                case 2:
                    DOSA.imprimirAlumnos(DOSA.alumno1);
                    DOSA.imprimirAlumnos(DOSA.alumno2);
                    DOSA.imprimirAlumnosESO(DOSA.alumnoEso);
                    DOSA.imprimirAlumnosESO(DOSA.alumnoEso1);
                    DOSA.imprimirAlumnosFP(DOSA.alumnoFP);
                    DOSA.imprimirAlumnosFP(DOSA.alumnoFP1);
                    break;
                case 3:
                    Nomina nomina = new Nomina();
                    nomina.doIt();
                    break;
                case 4:
                    System.out.println("Feliz verano");
                    terminar = true;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (!terminar);
    }
}
