import Ejercicios.Colores;
import Ejercicios.DOSA;
import Ejercicios.Nomina;

import java.util.Scanner;

import static Ejercicios.Matriz.iniciar;

public class Menu {
    private static final Scanner eleccion = new Scanner(System.in);



    public static void menu() {

        boolean terminar = false;

        do {
            System.out.println("\n"
                    + "Elige una opcion: \n\n"
                    + Colores.GREEN
                    + "1.Ejercicio 1\n"
                    + "2.Ejercicio 2\n"
                    + "3.Ejercicio 3\n"
                    + Colores.RED
                    + "4.Salir\n"
                    + Colores.ANSI_RESET
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
