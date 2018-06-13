package Ejercicios;

import java.util.Scanner;

public class Nomina {
    private static String nombre;
    private static double valorBruto;
    private static double valorNeto;
    private static final Scanner TECLADO = new Scanner(System.in);

    public void Nomina() {
        doIt();
    }

    public void doIt(){
        pedirNomina();
        calcularNomina();
        imprimir();
    }
    public void pedirNomina(){
        System.out.println("Dime tu nombre: ");
        nombre = TECLADO.nextLine();
        System.out.println("Dime el valor bruto de tu nomina: ");
        valorBruto = TECLADO.nextDouble();
        System.out.println();
    }
    public void calcularNomina(){
        double hacienda = 0.84;
        valorNeto = valorBruto * hacienda;
    }
    public void imprimir(){
        System.out.println("Tu nombre es: \n" + nombre + "\n");
        System.out.println("El valor neto de tu nomina es: \n" + valorNeto + "€");
    }
}
