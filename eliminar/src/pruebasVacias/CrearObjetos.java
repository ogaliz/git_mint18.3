package pruebasVacias;

import java.util.Scanner;

public class CrearObjetos {

	public static void main(String[] args) {
		
		
		int[] lista = new int[2];
		
		lista[0] = 15;
		lista[1] = 34;
		
		for(int recorre: lista) {
			System.out.println(recorre+" ");
		}
		
		Animal gamba = new Animal();
		
		gamba.creaAnimales();
		
		

	}

}


class Animal{
	
	public Scanner teclado = new Scanner(System.in);
	String nombre;
	String habitat;
	Animal[] animales;
	
	public void creaAnimales() {
		//Creamos un array de objetos de la clase empleados
	    Animal arrayObjetos[]=new Animal[10];
	
	    //Creamos 10 animales por defecto
	    int suma=0;
	    for (int i=0;i<arrayObjetos.length;i++){
	    	
	        arrayObjetos[i]=new Animal();
	    }
	
	    //Lo recorremos y sumamos de nuevo los salarios (600*10)
	    for (int i=0;i<arrayObjetos.length;i++){
	    	
	        //Mostramos la direccion del objeto	        
	        arrayObjetos[i].nombre = "nuevo";
	        System.out.println(arrayObjetos[i].nombre);
	        
	    }
	}
	
}