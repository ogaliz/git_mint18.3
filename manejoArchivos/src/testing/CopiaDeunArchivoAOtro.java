package testing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopiaDeunArchivoAOtro {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//1. Creamos un archivo de texto en la raíz del documento
		File miArchivo = new File("documento.txt");
		File destino = new File("archivoDestino.txt");
		
		//2. Creamos un objeto pera leer las líneas del doc.
		Scanner lector;
		
		//3. Vamos a crear un objeto para escribir en el doc
		PrintWriter escribe = null;
		BufferedWriter ram = null; 
		
		
		if(miArchivo.exists()) {
			
			try {
				
				miArchivo.createNewFile();
				destino.createNewFile();
				
				lector = new Scanner(miArchivo);
				
				escribe = new PrintWriter(miArchivo);
				ram = new BufferedWriter(escribe);
				
				System.out.println("Dinos que quieres escribir en el doc.");
				String contenido = teclado.nextLine();
				
				ram.write(contenido);
				
				ram.close();
				escribe.close();
				
				//---------CERRAMOS LA OPERACION DE ESCRITURA EN DOCUMENTO
				
				escribe = new PrintWriter(destino);
				ram = new BufferedWriter(escribe);
				
				//Leemos la frase del documento que queremos trasladar
				String fraseDestino = lector.nextLine();
				
				ram.write(fraseDestino);
				
				//Y la mostramos por consola
				System.out.println("Se ha añadido a destino: "+fraseDestino);
				
				ram.close();
				escribe.close();
				lector.close();
				
			} catch (IOException e) {
				System.out.println("No se ha creado el archivo");
			}
			
			
		}
			

	}

}
