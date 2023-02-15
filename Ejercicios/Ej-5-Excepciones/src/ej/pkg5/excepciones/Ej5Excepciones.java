package ej.pkg5.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej5Excepciones {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int random = (int) (Math.random() * 500 + 1);
        int n = 0, veces = 0;
        do {
            boolean flag;
            do {
                System.out.println("Introduzca un numero del 1 al 500");
                try {
                    veces++;
                    n = leer.nextInt();
                    System.out.println("Número introducido: " + n);
                    flag = true;
                } catch (InputMismatchException ex) {
                    System.out.println("No ha introducido un número entero");
                    leer.next();
                    flag = false;
                }
            } while (flag == false);

            if (n > random) {
                System.out.println("El numero secreto es menor, intente nuevamente");
            } else {
                System.out.println("El numero secreto es mayor, intente nuevamente");
            }

        } while (n != random);

        System.out.println("GANASTE!!!, el numero es: " + random);
        System.out.println("Número de intentos: " + veces);

    }

}
