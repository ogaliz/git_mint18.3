package ejerciciosArea51;

import java.util.Scanner;

public class MetodosUtiles {
	
	public static int pedirNumeroTeclado() {
		
	Scanner teclado = new Scanner(System.in);	
	
		System.out.println("De que numero se trata?");
		int miNumero= teclado.nextInt();	
		
		teclado.close();
		
		return miNumero;
	}
	
	public static void rellenarUnArray(int[] unArreglo) {
		
		for(int i=0; i<unArreglo.length; i++) {
			
			unArreglo[i]= i+1; 
		}		
	}
	
	public static void muestraUnArray(int[] unArreglo) {
		
		for(int muestra: unArreglo){
			
			System.out.print(muestra+"  ");
		}
		
	}
	
	public static int pedirConValidacion() {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero= 1; 	
		
			System.out.println("Diga un numero del uno al diez");
			numero = teclado.nextInt();
			while(numero > 0 && numero < 10) {
				
				System.out.println("ERROR");
				System.out.println("Diga un numero del uno al diez");
				numero = teclado.nextInt();
				}
		teclado.close();
		return numero;
	}
	
	

	public static void main(String[] args) {
		
		
		//int[] enteros = new int [MetodosUtiles.pedirNumeroTeclado()];
		
		//MetodosUtiles.rellenarUnArray(enteros);
		
		//MetodosUtiles.muestraUnArray(enteros);
		
		MetodosUtiles.pedirConValidacion();
		
		
	}

}
