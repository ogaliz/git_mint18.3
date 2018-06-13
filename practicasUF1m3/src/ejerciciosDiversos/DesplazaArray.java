package ejerciciosDiversos;
/*
Es demana la posició de la nota on inserir una nova nota. La resta de notes
posteriors a aquesta posició es desplacen una posició.
 */
public class DesplazaArray {

	public static void main(String[] args) {
		
		int[] notas = new int [20];
		int inserciones = 9;
		
		for(int i = 0; i < inserciones; i++) {
			notas[i] = i ;
		}
		for (int i : notas) {
			System.out.print(i+", ");
		}
		//=======================================Array de max 20 con 9 inserciones.
		System.out.println("  ");
		
		int posicion = 4;
		int notaNueva = 19;
		
		System.out.println("las notas insertadas son: "+inserciones);
		
		for(int i=inserciones; i >= posicion; i--) {
			
			notas[i+1] = notas[i];
			
		}
		
		notas[posicion] = notaNueva;
		inserciones++;
		
		for (int i : notas) {
			System.out.print(i+"  ");
		}
		
		System.out.println("Las notas insertadas son: "+inserciones);
		
		
		
		

	}

}
