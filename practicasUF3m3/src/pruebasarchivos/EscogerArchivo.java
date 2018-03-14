package pruebasarchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EscogerArchivo {

	public static void main(String[] args) {
		
		File documento = new File("/home/ogalvez/git_projects/archivos/estudiantes.txt");
		
		try {
			Scanner lectura = new Scanner(documento);
			String frase = lectura.next();
			
			System.out.println(frase);
			
			lectura.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el documento");
		}
		
		
		
		
		
		
		
		

	}

}
