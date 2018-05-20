package v180;

import javax.swing.plaf.BorderUIResource.LineBorderUIResource;

public class Cliente {

	private String nombre;
	private String n_cuenta;
	private double saldo;

	public Cliente(String nombre, String n_cuenta, double saldo) {

		this.nombre = nombre;
		this.n_cuenta = n_cuenta;
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getN_cuenta() {
		return n_cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setN_cuenta(String n_cuenta) {
		this.n_cuenta = n_cuenta;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//sobreescribimos el metodo equals, para que nos muestre que dos clientes son iguales si tienen
	//el mismo saldo.
	@Override
	public boolean equals(Object objetox) {
		//con el instanceof nos permite averiguar si el objeto pasado por parametro es una instancia de 
		//la clase Cliente.
		if(objetox instanceof Cliente) {
			Cliente aComparar = (Cliente)objetox;
			if(this.saldo == aComparar.saldo) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	

}
