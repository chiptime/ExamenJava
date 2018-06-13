package Ejercicios;

public class Matriz {




    public static int[][] iniciar(int filas, int columnas) {

        int[][] matriz = new int[filas][columnas];

        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.print("|" + (f+c) + "|");
            }
            System.out.println();
        }
        return matriz;
    }


}
