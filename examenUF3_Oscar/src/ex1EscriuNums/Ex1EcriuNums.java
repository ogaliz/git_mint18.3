package ex1EscriuNums;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex1EcriuNums {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		File miArchivo = new File("/tmp/nums.bin");
		
		PrintWriter escritura = null;
		BufferedWriter bufer = null;
		
		
		if(!miArchivo.exists()) {
			
			try {
				
				miArchivo.createNewFile();
				
				escritura = new PrintWriter(miArchivo);
				bufer = new BufferedWriter(escritura);
				
				for(int i = 0; i < 5; i++) {
					
					System.out.println("Por favor, introduce el numero "+(i+1));
					bufer.write(teclado.nextInt());
					
				}
				
				bufer.close();
				escritura.close();
				teclado.close();
				
				System.out.println("El archivo se ha guardado correctamente");
				
			} catch (IOException e) {
				
				System.out.println("El archivo no fue creado, revise el programa");
			}
			
			
		}

	}

}
