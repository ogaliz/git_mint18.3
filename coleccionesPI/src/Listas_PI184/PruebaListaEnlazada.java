package Listas_PI184;

import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaListaEnlazada {

	public static void main(String[] args) {
		
		LinkedList<String> paises = new LinkedList<String>();
		
		paises.add("España");
		paises.add("Colombia");
		paises.add("Mexico");
		paises.add("Perú");
		
		LinkedList<String> capitales = new LinkedList<String>();
		
		capitales.add("Madrid");
		capitales.add("Bogotá");
		capitales.add("D.F.");
		capitales.add("Lima");
		
		System.out.println("Mostramos las dos listas creadas:");
		System.out.println(paises);
		System.out.println(capitales);
		System.out.println("  ");
		
		//agregamos la lista de capitales a la lista de paises en el orden correspondiente
		ListIterator<String> itera = paises.listIterator();
		ListIterator<String> iterb = capitales.listIterator();
		
		//agregamos la primera lista dentro de los elementos que tenemos en la primera
		while(iterb.hasNext()) {
			
			if(itera.hasNext()) {
				//pasamos el primer pais, que es españa
				itera.next();
				
			}
			//pasado el primer pais, añadimos el primer elemento de capitales, Madrid
			itera.add(iterb.next());
		}
		//comprobamos como la lista de paies ahora incluye a sus capitales.
		System.out.println("Mostramos las dos listas unidas");
		System.out.println(paises);
		System.out.println("  ");
		
		//reiniciamos la posicion del cursor en la lista capitales
		iterb = capitales.listIterator();
		
		//hay un elemento en la siguiente posicion?
		while(iterb.hasNext()) {
			//de la posicion 0 estamos en la uno (out --> Madrid)
			iterb.next();
			
			//si hay elemento posterior entra en la condición
			if(iterb.hasNext()) {
				//de la posición 0 pasamos a la 1 (out --> Bogotá)
				iterb.next();
				
				//es par, por lo tanto la eliminamos
				iterb.remove();
			}			
		}
		System.out.println("Mostramos las dos capitales impares:");
		System.out.println(capitales);
		System.out.println("  ");
		
		//en estos momentos los cambios no estan en la lista paises:
		System.out.println(paises);
		
		System.out.println("De la lista paises eliminamos las capitales que quedaban");
		paises.removeAll(capitales);		
		System.out.println(paises);
		
		System.out.println(capitales);
		

	}

}
