package ejercicios;

import java.util.Scanner;

public class Ex5Concatenar {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String frase = "";
		final String exit = "final";
		String paraula;
		
		do {
			System.out.println("Introdueix una frase:");
			paraula =  teclado.nextLine();
			
			frase = frase.concat(paraula);
	
		}while(!paraula.equals(exit));
		
		System.out.println("Frase concatenada: "+frase);
		
		teclado.close();

	}
}
