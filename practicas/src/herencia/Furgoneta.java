package herencia;

public class Furgoneta extends Coche{
	
	//variables de clase
	private int capacidad_carga;
	private int plazas_extras;
	
	//constructor
	public Furgoneta(int plazas_extras, int capacidad_carga) {
		
		plazas_extras= this.plazas_extras;
		
		capacidad_carga= this.capacidad_carga;
			
	}
	
	public String dimeDatosFurgoneta() {
		
		String frase= "La capacidad de carga de la furgoneta es: "+capacidad_carga+
				" y las plazas son: "+plazas_extras;
		
		return frase;
	}
	
}//cierre del class Furgoneta
