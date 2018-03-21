package pruebasarchivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EjercicioExamen {
	
	
	private static double media() {
		
		Scanner teclado = new Scanner(System.in);
		double[] misNumeros = {4,5,6,7,3,4};
				//new double[5];
		double total = 0;
		/*
		for(int i =0; i < misNumeros.length; i++) {
			
			System.out.println("Cual es el numero: "+(i+1));
			misNumeros[i] = teclado.nextDouble();
		}*/
		
		for(int i =0; i < misNumeros.length; i++) {
			
			total+=misNumeros[i];
			
		}
		
		total = total / misNumeros.length;
		
		teclado.close();
		
		return total; 
	}
	
	public static void escribemedia() {
		
		//creamos el archivo nuevo
		File archivo = new File("/home/ogalvez/git_projects/archivos/desesperacion.txt");
		
		FileWriter escribe = null;
		BufferedWriter ram = null;
		
		try {
			escribe = new FileWriter(archivo);
			ram = new BufferedWriter(escribe);
			
			double nota = EjercicioExamen.media();
			
			ram.write("Hola mundo 2!");
			ram.newLine();
			ram.write((int) nota);
			
			ram.close();
			escribe.close();
			
			
		} catch (IOException e) {
			
			System.out.println("El archivo no se ha encontrado");
		}

	}
	

	public static void main(String[] args) {
		
		EjercicioExamen.escribemedia();
	
		
		

	}

}
