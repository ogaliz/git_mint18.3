package ejerciciosArea51;

import java.util.Scanner;

public class Debugando {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce los numeros de tu array");
		int elementos= teclado.nextInt();
		
		int[] aleatorios = new int[elementos];
		
		for (int i=0; i<aleatorios.length; i++) {
			
			aleatorios[i]= (int)(Math.random()*100); 
			
		}
		
		for(int muestra: aleatorios){
			
			System.out.print(muestra+"  ");
		}
		
		teclado.close();
		
		

	}//cierre del main

}//cierre del class
