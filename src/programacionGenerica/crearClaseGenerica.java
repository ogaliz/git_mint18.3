package programacionGenerica;

/**
 * Clase para mostrar como convertir una clase normal en una generica.
 * A la clase se le suelen aplicar las letras T, U, K por convención.
 * */

public class crearClaseGenerica <T>{

    private T primero;

    public crearClaseGenerica() {

        primero = null;
    }

    public void setPrimero(T nuevoValor) {

        primero= nuevoValor;
    }

    public T getPrimero() {

        return primero;
    }










    public static void main(String[] args) {

        //instanciamos un objeto de la clase generica
        crearClaseGenerica<String> una = new crearClaseGenerica<String>();


    }//cierre del main
}
