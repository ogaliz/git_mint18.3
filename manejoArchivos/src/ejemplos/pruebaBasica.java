package ejemplos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * @author Oscar Galvez
 */
public class pruebaBasica {
    
    public static void escribedoc(File docu){
        
        FileWriter doc;
        BufferedWriter ram;
 
        //Empezamos la operacion de escritura: 
        try {
            doc = new FileWriter(docu);
            
            ram = new BufferedWriter(doc);
            
            ram.write("Operaciones de lectura y escritura basicas");
            ram.newLine();
            ram.append("En el lenguaje de programacion Java.");
            
            ram.close();
            doc.close();
            
        } catch (IOException ex) {
            
            System.out.println("No se ha creado el archivo.");    
        }
        
    }
    
    public static void leedocu(File docu){
        
        FileReader lectura;
        BufferedReader ram1; 
        
        //Empezamos la operacion de lectura: 
        try {
            lectura = new FileReader(docu);
            
            ram1 = new BufferedReader(lectura);
            
            String primeraLinea = ram1.readLine();
            String segundaLinea = ram1.readLine();
            
            System.out.println(primeraLinea+"\n"+segundaLinea);
            
            ram1.close();
            lectura.close();
            
        } catch (IOException ex) {
            
            System.out.println("El archivo no se ha podido leer.");
        }
        
    }

    public static void main(String[] args) {
        //creamos un objeto de tipo File, esto no es necesario para crear un doc, lo podemos crear con
        //FileWriter, pero nos ofrece unos metodos útiles extras. 
        File documento = new File("final123.txt");
        
        System.out.println(documento.getAbsolutePath());
        
        escribedoc(documento);
        
        leedocu(documento);
  
    }
    
}
