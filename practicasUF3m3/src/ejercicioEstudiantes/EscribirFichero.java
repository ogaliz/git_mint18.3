package ejercicioEstudiantes;

import java.io.FileWriter;
import java.io.IOException;

import pruebasarchivos.EscrituraPasoAPaso;

public class EscribirFichero {

	public static void main(String[] args) {
		
		Escribiendo puk = new Escribiendo();
		
		puk.escribir();


	}

}

class Escribiendo{
	
	public void escribir() {
		
		String frase = "Esto es una prueba de escritura";
		
		try {
			//podemos añadir un true al lado del path junto a los parametros para que escriba en modo append.
			FileWriter escribe = new FileWriter("/home/ogalvez/pildoras.txt");
			
			for(int i = 0; i< frase.length(); i++) {
				
				escribe.write(frase.charAt(i));
	
			}
			
			escribe.close();
			
		} catch (IOException e) {
			
			System.out.println("Ha habido algun error.");
			
		}
	}
	
	
	
}




















