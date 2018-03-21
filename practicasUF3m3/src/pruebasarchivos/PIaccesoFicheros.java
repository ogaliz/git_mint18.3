package pruebasarchivos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PIaccesoFicheros {
	
	public static void lee() {
		
		try {
			
			FileReader lectura = new FileReader("/home/ogalvez/git_projects/archivos/dummy.txt");
			
			int cifra = 0;
			
			while(cifra != -1) {
				
				cifra = lectura.read();
				
				char letra = (char) cifra;

				System.out.print(letra);
	
			}
			
			
			
		
			
			
		} catch (IOException e) {
			
			System.out.println("No se ha encontrado el fichero, revisa el path");
		}
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		PIaccesoFicheros.lee();
		
	
		
		
		
		
		

	}

}
