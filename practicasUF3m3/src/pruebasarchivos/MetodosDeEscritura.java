package pruebasarchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MetodosDeEscritura {

	public static void main(String[] args) {
		
		//Creamos el archivo de texto nuevo
		File elArchivo = new File("/home/ogalvez/git_projects/archivos/papirrines.txt");
		System.out.println(elArchivo.exists());
		PrintWriter escritura = null; 
		
		try {
			escritura = new PrintWriter(elArchivo);
			escritura.print("Que pasiones papirrines");
			escritura.append("La madre que lo");
			
		} catch (FileNotFoundException e) {
			System.out.println("El archivo no ha sido correctamente creado");
		}finally {
			escritura.close();
			
		}
		
		try {
			Scanner lectura = new Scanner(elArchivo);
			String frase = lectura.nextLine();
			
			System.out.println(frase);
			
			lectura.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("No hemos encontrado el archivo, no se puede leer");
		}finally {
			System.out.println("finalizado proceso de lectura");
		}

	}

}
