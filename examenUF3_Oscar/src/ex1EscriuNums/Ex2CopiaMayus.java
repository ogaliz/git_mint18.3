package ex1EscriuNums;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * Fes un programa aMajuscules que demani a l’usuari el nom d’un fitxer de text, 
 * el llegeixi, i gravi un segon fitxer (amb el mateix nom que el primer, però afegint 
 * la extensió .cap).  Aquest segon fitxer s'obté passant a majúscules totes les lletres 
 * del primer.  Feu les comprovacions d’error que considereu oportunes pel cas que hi 
 * hagi problemes amb els fitxers.  Heu de tenir en conte que el fitxer d'entrada pot ésser 
 * potencialment molt gran.
 * */
public class Ex2CopiaMayus {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Que fichero quieres convertir a mayus?");
		String ruta = teclado.nextLine();
		String ruta2 = ruta.concat(".cap");
		
		//1. Creamos un archivo de texto en la raíz del documento y otro de destino
		File miArchivo = new File(ruta);
		File destino = new File(ruta2);
		
		//2. Creamos un objeto pera leer las líneas del doc.
		Scanner lector;
		
		//3. Vamos a crear un objeto para escribir en el doc
		PrintWriter escribe = null;
		BufferedWriter ram = null;
		//4. Vamos a crear un objeto para leer en el doc
		BufferedReader bufer = null;
		FileReader fl = null;
				
		if(!miArchivo.exists()) {
			
			try {
				//crea archivos
				miArchivo.createNewFile();
				destino.createNewFile();
				
				//lee archivo documento
				fl = new FileReader(miArchivo);
				bufer = new BufferedReader(fl);
				lector = new Scanner(miArchivo);
				
				while(lector.hasNext()) {
					
					bufer.readLine();
					
				}
				
				escribe = new PrintWriter(destino);
				ram = new BufferedWriter(escribe);
				
				//Leemos la frase del documento que queremos trasladar
				String fraseDestino = lector.nextLine();
				
				//La escribimos en mayus
				ram.write(fraseDestino.toUpperCase());
				
				//Y la mostramos por consola
				System.out.println("Se ha añadido a destino: "+fraseDestino);
				
				//--------------CERRAMOS TODO PARA QUE NO DE ERRORES.
				ram.close();
				escribe.close();
				bufer.close();
				fl.close();
				lector.close();
				
			} catch (IOException e) {
				System.out.println("No se ha creado el archivo");
			}
			
			
		}

	}

}
