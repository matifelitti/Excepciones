package ejercicio3_excepcion;

public class Ejercicio3_Excepcion {

    public static void main(String[] args) {
        java.util.Scanner cr = new java.util.Scanner(System.in).useDelimiter("\n");
        String num1S;
        String num2S;

        try {
            System.out.println("--------");
            System.out.println("Numero 1: ");
            num1S = cr.next();
            System.out.println("--------");
            System.out.println("Numero 2: ");
            num2S = cr.next();
            int num1 = Integer.parseInt(num1S);
            int num2 = Integer.parseInt(num2S);
            System.out.println("NUMEROS CONVERTIDOS EN INT");
            System.out.println(num1);
            System.out.println(num2);
            //ArithmeticException
            System.out.println("DIVISION");
            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("NO SE PUEDE DIVIDIR ENTRE 0 !!!!!!!!!!");
        } catch (NumberFormatException e) {
            System.out.println("FUERA DE FORMATO !!!!!!!!!!");
        } catch (Exception e) {
            System.out.println("ERROR DE SISTEMA :C ");
        }

    }

}
