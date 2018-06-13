package ex1EscriuNums;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex1CalculaSumatori {

	public static void main(String[] args) {
			
		File miArchivo = new File("/tmp/nums.bin");
		Scanner lector; 
		FileReader lectura = null;
		BufferedReader bufer = null;
		int resultado = 0;
		
		if(miArchivo.exists()) {
		
			try {
				lector = new Scanner(miArchivo);
				
				while(lector.hasNextInt()) {
					
					resultado += lector.nextInt();
					
				}
				
				
			} catch (FileNotFoundException e) {
				
				System.out.println("Hubo algun problema, revise el archivo");
			}
			
		}else {
			
			System.out.println("El archivo no existe");
		}
		
		System.out.println("El resultado de la suma es "+resultado);

	}

}
