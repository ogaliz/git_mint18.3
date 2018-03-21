package ejercicioEstudiantes;

import java.io.File;
import java.io.IOException;

public class Eliminar {

	public static void main(String[] args) {
		
		File ar = new File("src/ejercicioEstudiantes/elimina.txt");
		
		if (!(ar.exists())) {
			
			try {
				ar.createNewFile();
				System.out.println("El archivo "+ar.getName()+" ha sido creado");
			} catch (IOException e) {
				System.out.println("Ha habido algun error");
			}
			
			
			
		}
		
		
		
		
		
		
	}

}
