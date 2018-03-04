package ejerciciosArea51;

import java.util.Scanner;
/**
 * @author Oscar Galvez
 * @version 2.0
 * @see <a href = "http://www.oracle.com/technetwork/java/javase/documentation/index-137868.html#tag"/>Documentacion JavaDoc</a>
 * */
public class Refactorizar{
	
	/**
	 * <ol type="1"><b>Variables miembro</b>
	 * <li>Variables <code>final</code> que marcan el max y min de nuestro array</li>
	 * <li>Variables <code>final</code> que marcan el rango en el que se moveran las notas introducidas</li>
	 * <li>Variables numericas de tipo float globales a la clase, de las cuales mostramos el resultado</li>
	 * </ol>
	 * */
	//1
    private static final int MAX_CAPACITY= 50;
    private static final int MIN_CAPACITY= 1;
    //2
    private static final int MAX_GRADE= 10;
    private static final int MIN_GRADE= 0;
    //3
    public static Scanner teclado = new Scanner(System.in);
    public static float notaAlumne, notaMitja=0, notaMesAlta, notaMesBaixa;
    
    /**
     * Pide la longitud del array que llenaremos con notas, comprobado el rango 
     * @return Devuelve un numero de tipo <code>int</code> entre 0 y 10 entrado por teclado. 
     * @since 1.0
     * */
    public static int cantidadGente() {
    	
    	int cantidadGente = 0; 
    	do {
    		System.out.print("Quanta gent: ");
    		cantidadGente= teclado.nextInt();
    	
    	}while (cantidadGente > MAX_CAPACITY || cantidadGente < MIN_CAPACITY);
   
    	return cantidadGente;
    }
    
    /**
     * Este metodo es el que nos llena la lista de notas comprobando el rango max y min
     * @param Un array de tipo float
     * @return void
     * @since 1.0
     * */
    public static void rellenaListaDeNotas(float[] unalista) {
    	
    	for (int i = 0; i < unalista.length; i++) {
    		
            System.out.print("Introdueix nota " + (i + 1) + ":");
            unalista[i]= teclado.nextFloat();
            
            while (unalista[i] > MAX_GRADE || unalista[i] < MIN_GRADE) {
            	
                System.out.println("ERROR");
                System.out.print("Introdueix nota " + (i + 1) + ": ");
                unalista[i]= teclado.nextFloat();
                
            }           
            
        }
    	
    }
    
    /**
     * Este metodo recorre la lista y la muestra por pantalla
     * @param 
     * @since 2.0
     * */
    public static void muestraLaLista(float[] otraLista) {
    	
    	for(float muestra: otraLista) {
    		
    		System.out.print(muestra+"  ");
    		
    	}	
    }
    
    /**
     * Este metodo asigna un valor a la media, pero no lo devuelve, 
     * para ello se debe acceder a traves del metodo {@link #muestraDatos()}}
     * @param Un array de tipos float
     * @since 1.0
     * */
    public static void calculaMedia( float[] unArray) {
    	
    	for (int i = 0; i < unArray.length; i++) {
            
    		notaMitja += unArray[i];
        }
    	
    	notaMitja = notaMitja/unArray.length;	
    }
    
    /**
     * Asigna valor a las variables notaMasAlta y notaMasBaja, accederemos a sus valores a través
     * del metodo {@link #muestraDatos()}}
     * @param Un array de tipos {@code float}
     * @since 1.0
     * */
    public static void elMasAltoyMasBajo(float[] unArray) {
    	
    	notaMesAlta = unArray[0];
        notaMesBaixa = unArray[0];
        for (int i = 0; i < unArray.length; i++) {
        	
            float auxiliar = unArray[i];
            if (auxiliar > notaMesAlta) {
                notaMesAlta = unArray[i];
            }
            if (auxiliar < notaMesBaixa) {
                notaMesBaixa = unArray[i];
            }
        }
    		
    }
    
    /**
     * Metodo de clase que nos puestra los resultados de las variables miembro por pantalla
     * */
    public static void muestraDatos() {
    	
        System.out.println("Mitja: " + notaMitja );
        System.out.println("Millor: " + notaMesAlta );
        System.out.println("Pitjor: " + notaMesBaixa );
    	
    }
    
    
    public static void main(String[] args){
    	
    	float[] listaNotas= new float[Refactorizar.cantidadGente()];
    	
    	Refactorizar.rellenaListaDeNotas(listaNotas);
    	
    	Refactorizar.muestraLaLista(listaNotas);
    	
    	System.out.println("  ");
    	
    	Refactorizar.calculaMedia(listaNotas);
    	Refactorizar.elMasAltoyMasBajo(listaNotas);
    	Refactorizar.muestraDatos();

    }
    
}
