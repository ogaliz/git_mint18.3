package ex1EscriuNums;

import java.io.File;
import java.util.Scanner;

public class Ex2PasaraMayus {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Que archivo quieres pasar?");
		String ruta = teclado.nextLine();
		
		File ar = new File("/home/ogalvez/parrs.txt");
		
		System.out.println(ar.exists());
		
		

	}

}
