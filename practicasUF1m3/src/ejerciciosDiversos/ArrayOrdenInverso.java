package ejerciciosDiversos;

import java.util.Scanner;

public class ArrayOrdenInverso {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un numero de notas totales");
		int[] notas = new int [teclado.nextInt()];
		
		for(int i = 0; i < notas.length; i++) {
			
			System.out.println("Introduce la nota:"+(i+1));
			notas[i] = teclado.nextInt();
		}
		
		for (int i : notas) {
			
			System.out.print(i+"  ");		
		}
		
		
		

	}//cierre del main

}
