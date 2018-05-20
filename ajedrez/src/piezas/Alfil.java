package piezas;

import java.util.Scanner;

/**
 * Dado un tablero con unas cordenadas que van de (1,1) a (8,8).
 * Calcula si los movimientos de un alfil son correctos en el tablero.
 * */
public class Alfil {
	
	static Scanner teclado = new Scanner(System.in);
	//static int xold = 1;
	//static int yold = 1;
	static int posicion[][] = new int[8][];
	
	public static boolean rangoCorrecto(int num) {
		
		boolean correcto = true;
		if(num > 8 || num < 0) {
			
			correcto = false;
		}		
		return correcto;
	}
	
	public static void compruebaAlfil(int xnew, int ynew) {
		
//		if(rangoCorrecto(xnew) && rangoCorrecto(ynew)) {			
//			System.out.println("El rango es correcto");
//				
//		}else {
//			System.out.println("Ha ocurrido algun error");		
//		}
		
		
		

	}
	
	
	public static void main(String[] args) {
		
		
		
		for(int i = 0; i < 8; i++) {
			
			for(int k = 0; k < 8; i++){
				
				System.out.println("*");
			}
			
			System.out.println("  ");
		}
		

	}

}
