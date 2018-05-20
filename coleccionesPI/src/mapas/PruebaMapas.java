package mapas;

import java.util.HashMap;
import java.util.Map;

public class PruebaMapas {

	public static void main(String[] args) {
		
		HashMap<String, Empleado> personal = new HashMap<String, Empleado>();
		
		personal.put("1001", new Empleado("Juan"));
		personal.put("1002", new Empleado("Anna"));
		personal.put("1003", new Empleado("Carla"));
		personal.put("1004", new Empleado("Lucia"));
		
		System.out.println(personal);
		
		personal.remove("1003");
		
		System.out.println(personal);
		
		//nos devuelve una coleccion de tipo set
		//System.out.println(personal.entrySet());
		
		for (Map.Entry<String,Empleado> entrada : personal.entrySet()) {
			
			String id = entrada.getKey();
			Empleado valor = entrada.getValue();
			
			System.out.println("Clave= "+id+" valor= "+valor);
		}
		
	}

}

class Empleado{
	
	private String nombre;
	private double sueldo;
	
	public Empleado(String n) {
		
		nombre = n;
		sueldo = 2000;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}
}