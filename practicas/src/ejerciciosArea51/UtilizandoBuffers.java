package ejerciciosArea51;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @author cf17oscar.galvez
 */
class LeerFichero{
    
    FileReader entrada; 
    
    public void lee(){
    	
        try {

            entrada = new FileReader("/home/ogalvez/psa.txt");
            
            BufferedReader miBuffer = new BufferedReader(entrada);
      
            String linea = ""; 
            
            while( linea!=null ){
                //la primera vez que entra en el bucle imprime la primera linea del texto
                linea = miBuffer.readLine();
                
                if(linea != null); //esta linea es simplemente para que no aparezca un null al final
                	System.out.println(linea);
            }
            
            
        } catch (IOException e) {
            System.out.println("No hemos encontrado el fichero");
            
        }finally{
            
            System.out.println("Ejecutado el buffer con éxito.");
            
        }
        
    }
    
}


public class UtilizandoBuffers {

	public static void main(String[] args) {
		
		
		LeerFichero archivo = new LeerFichero();
        
        archivo.lee();
		
	

	}//cierre del main

}
