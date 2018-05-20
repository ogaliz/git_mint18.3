package Listas_PI184;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class PruebaLinkedList {

	public static void main(String[] args) {
		
		List<String> personas = new LinkedList<>();
		
		personas.add("The Rock");
		personas.add("Catwoman");
		personas.add("Spiderman");
		personas.add("Hulk");
		
		System.out.println("Por ahora nuestra lista tiene "+personas.size());
		
		ListIterator<String> it = personas.listIterator();
		
		it.next();
		
		it.add("Juan");
		
		for (String string : personas) {
			System.out.println(string);
		}
		
	}

}
