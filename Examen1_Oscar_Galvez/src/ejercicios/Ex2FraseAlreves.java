package ejercicios;

import java.util.Scanner;
/**
Feu un programa en Java que demani una frase, i la torni a escriure al inrevés
Un exemple d'execució seria:
Introdueix una frase: Hi havia una    vegada un lloc
frase al revés: coll nu adagev    anu aivah iH
 * */
public class Ex2FraseAlreves {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un una frase para invertirla");
		String tuFrase = teclado.nextLine();
			
		for(int i = (tuFrase.length()-1); i >= 0; i--) {
			
			System.out.print(tuFrase.charAt(i));
		}
	
		teclado.close();
	}

}
