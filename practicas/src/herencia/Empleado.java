package herencia;

import java.util.GregorianCalendar;

public class Empleado {

	private String nombre; 
	private double sueldo; 
	private int IdSiguiente; 
	
	public Empleado(String nom, double sueldo, int ano, int mes, int dia) {
		
		nombre =nom;
		
		sueldo = this.sueldo;
		
		GregorianCalendar calendario = new GregorianCalendar(ano, mes-1, dia);
		
		++IdSiguiente; 		

	}
		
	public String getNombre() {
		return nombre;
	}



	public double getSueldo() {
		return sueldo;
	}



	public int getIdSiguiente() {
		return IdSiguiente;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}



	public void setIdSiguiente(int idSiguiente) {
		IdSiguiente = idSiguiente;
	}

	//constructor para dar valor inicial a los campos de los clientes de los cuales solo sabemos 
	//el nombre. 
	public Empleado(String nom) {
		
		this(nom, 30000, 2000, 01, 01);
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		

	}

}
