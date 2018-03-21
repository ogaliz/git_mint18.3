package junitasserts;

import static org.junit.Assert.*;

import org.junit.Test;

public class ElTest {
	
	Animal uno = new Animal();
	
	@Test
	public void sumaTest() {

		int salida = uno.suma(3, 2);
		
		assertEquals(5, salida);
	}
	
	@Test
	public void restaTest() {
		
		int salida = uno.resta(3, 2);
		
		assertEquals(1, salida);
	}
	
	
	

}
