/*
Para crear Lecturas de Streams en Java tenemos que conocer las clases
FileInputStream
    Que contiene los metodos:
        read()
        close()
FileOutputStream
    Que contiene los metodos:
        write()
        close()
El ejemplo que desarrollaremos primero leera un archivo cualquiera, la segunda parte
copia esa imagen en un directorio de nuestro PC.
 */
package ejemplos;

import java.io.FileInputStream;
import java.io.IOException;

public class JavaApplication5 {
    
    

    public static void main(String[] args) {
        
        //leemos la informacion de la imagen
        try {
            //creamos el archivo Stream para poder leer los bytes del archivo, si no lo encuentra devuelve -1
            FileInputStream archivoLectura = new FileInputStream("C:/big_cat.jpg");         
            boolean final_archivo = false; 
            
            int contador = 0; 
            //en cada vuelta del bucle while se lee un byte.
            while(!final_archivo){
                //el metodo read lee byte a byte del stream
                int byte_entrada = archivoLectura.read();
                
                if(byte_entrada == -1){
                    final_archivo = true; 
                    
                    System.out.println(byte_entrada);
                    
                    contador++; 
                }        
                        
            }
            //este es nuestro archivo lectura
            archivoLectura.close();
        } catch (IOException e) {
            
            System.out.println();
        }
               
    }
}
