package programacionGenerica;

import java.util.ArrayList;

public class UsoArrayList {

    public static void main(String[] args) {

        ArrayList archivos = new ArrayList(4);

        archivos.add("Paco");
        archivos.add("Maria");

        String nombrePersonas = (String) archivos.get(2);

        System.out.println(nombrePersonas);






    }//cierre del main
}
