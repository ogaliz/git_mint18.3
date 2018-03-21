package pruebasarchivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscrituraPasoAPaso {

	public static void main(String[] args) {
		
		/*Crear el un objeto de tipo File, no es obligatorio pero es una buena recomendación
		 *  para tener más control, por ejemplo para saber si el archivo existe.*/
		File miArchivo = new File("/home/ogalvez/git_projects/archivos/estudiantes.txt");
		//comprobamos que el archivo existe y el path es correcto, si es asi, devuelve un true
		//la primera vez sale false, la segunda al estar ya creado cambia a true.
		System.out.println(miArchivo.exists());
		
		/*Abrir el flujo para esto se debe crear un objeto de tipo FileReader para leer 
		 * o FileWriter para escribir y pasar el objeto archivo.*/
		FileWriter escritura = null;
		try {
			
			escritura = new FileWriter(miArchivo);
			BufferedWriter intermedio = new BufferedWriter(escritura);
			
			//el write sobreescribe cada vez lo que haya en el archivo
			intermedio.append("Carlos Santaengracia");
			
			intermedio.close();
			
			System.out.println("Se ha añadido el primer alumno");
			
		}catch(IOException e) {
			
			System.out.println("Lo sentimos, no se ha encontrado el archivo revisa el path");
		}finally {
			//cerramos el filewriter.
			try {
				escritura.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		/*Con las clases BufferedWriter y BufferedReader se crea un buffer intermedio
		 *  al cual se le pasan los objetos del flujo principal.*/
		

	}

}
