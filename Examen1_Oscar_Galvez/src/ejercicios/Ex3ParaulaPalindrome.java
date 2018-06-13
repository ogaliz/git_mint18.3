package ejercicios;

import java.util.Scanner;

public class Ex3ParaulaPalindrome {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce una palabra para saber si es palindroma");
		String palabra = teclado.next();
		
		String primeraLetra = Character.toString(palabra.charAt(0));
				
		if(palabra.endsWith(primeraLetra)) {
			System.out.println("La palabra es capicua");
		}else {
			System.out.println("No és palíndroma");
		}
	
		teclado.close();
	}

}
