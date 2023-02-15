package ejercicio2_excepcion.enti;

public class Numero {

    private int[] numeros = new int[5];

    public Numero() {
    }

    public Numero(int[] numeros) {
        this.numeros = numeros;
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public int mostrarvalor(int n) {
        return numeros[n];
    }

}
