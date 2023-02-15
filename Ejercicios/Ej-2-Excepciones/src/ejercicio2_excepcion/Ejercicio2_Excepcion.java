package ejercicio2_excepcion;

import ejercicio2_excepcion.enti.Numero;

public class Ejercicio2_Excepcion {

    public static void main(String[] args) {
        java.util.Scanner cr = new java.util.Scanner(System.in).useDelimiter("\n");
        int[] numeros = {1, 2, 3, 4, 5};
        Numero n1 = new Numero(numeros);
        
        try {
            System.out.println("Ingresar indice");
            int n = cr.nextInt();
            n1.mostrarvalor(n);
        } 
//        catch (InputMismatchException e) {
//            System.out.println("no es numero!!!!!!!!!!!!!");
//        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice fuera del rango!!!!!!!!!");
        }catch (Exception e) {
            System.out.println("ERROR DEL SISTEMA!!!!!!!!!!!!!");
        } finally{
            System.out.println("SIEMPRE SE EJECUTA");
            System.out.println("indice 0-5");
            System.out.println(numeros[1]);
        }
    }

}
