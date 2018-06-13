package ejerciciosDiversos;

public class MuestraPosicion {

	public static void main(String[] args) {
		
		int[] pares = new int[100];
		int auxiliar = 0;
		
		while(true) {
			
			if(auxiliar%2 == 0) {
				pares[auxiliar] = auxiliar;
			}
			auxiliar++;
			
			if(auxiliar == pares.length) {
				break;
			}
			
			System.out.print(pares[auxiliar]);
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//cierre del main

}
