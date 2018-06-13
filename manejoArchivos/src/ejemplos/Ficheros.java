
package ejemplos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Ficheros {
    
    public static Scanner teclado = new Scanner(System.in);
    static File tuArchivo = null; 
    
    private static File creaArchivo(){
        
        System.out.println("Vamos a crear un archivo nuevo en la carpeta archivos, que nombre ponemos?");
        String nombre = teclado.next();
        
        //creamos el archivo, Cuidado! si existe una carpeta con el mismo nombre no funcionara, 
        //y si el archivo ya existe lo tamara
        tuArchivo = new File("C:\\archivos\\"+nombre);
        
      return tuArchivo; 
    };
   
    
    public static void main(String[] args){
   
        Ficheros.creaArchivo();
        System.out.println(tuArchivo.exists());
        
        //creamos el objeto que nos permite escribir en el archivo, nos lanza una excepcion.
        try {
            
            FileWriter escribe = new FileWriter(tuArchivo);
            
            //creamos un Bufer para que sea mas optimo:
            BufferedWriter intermedio = new BufferedWriter(escribe);
            
            intermedio.write("En este archivo añadiremos los estudiantes: ");
            
            intermedio.close();
            escribe.close();
              
        } catch (Exception e) {
            
            System.out.println("No hemos encontrado el archivo");
             
        }
            

           
            
            
            
            
            
            
         
            
            
            
        
        
        
    }//cierre del main
    
}//cierre del class
