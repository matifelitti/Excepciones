package ej.pkg4.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej4Excepciones {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;

        try {
            System.out.println("Ingrese un valor entero:");
            n = leer.nextInt();
            int doble = n * 2;
            System.out.println("El doble de " + n + " es " + doble);
        } catch (InputMismatchException ex) {
            System.out.println("Error: sólo se admiten números entero.");
        }

        int palabra;
        try {
            palabra = Integer.parseInt("22bb");
            System.out.println(palabra);
        } catch (NumberFormatException p) {
            System.out.println("El String no puede transformarse a entero");
        }

        int a = 0, b = 0, c;
        try {
            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        }

    }

}
