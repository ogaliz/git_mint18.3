package ejercicios;

import java.util.Scanner;

/**
 * Feu un programa que demani dos números enters positius, i calculi el producte, 
 * calculat pel mètode de sumes successives.  Aquestes sumes han d'aparèixer de forma 
 * consecutiva per pantalla, de la forma que es mostre a l'exemple.
Un exemple d'execució seria:
Introdueix primer enter:5
Introdueix segon enter:3
Resultat de 5 + 5 + 5 = 3 + 3 + 3 + 3 + 3 = 15
 * */
public class Ex4ProducteAmbSuma {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un primer numero");
		int num1 = teclado.nextInt();
		System.out.println("Introduce un segundo numero");
		int num2 = teclado.nextInt();
		
		for(int i = 0; i < num1; i++) {
			
			System.out.print(num1+"+");
			
			if(i == (num1-1)) {
				
				System.out.println("=");
				
					for(int k = 0; k < num2; k++) {
						
						System.out.print(num2+"+");
						
					}
				
			}
			System.out.print(num1+"+");
			
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
