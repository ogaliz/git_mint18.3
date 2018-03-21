package ejercicioYT;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PruebasUnitarias {
	
	//0. Creamos dos objetos de la clase NumComplejo
	private NumComplejo c1;
	private NumComplejo c2 = new NumComplejo(1,1);
	private double [] nums = {1,0};
	private double [] nums2 = null; 
	
	//1.Instanciamso un objeto de la clase NumComplejo
	@Before
	public void antesQue() {
		
		c1 = new NumComplejo();
	}
	
	//2. Creamos un metodo en la clase test
	@Test
	public void sumaTest() {
	//Creamos un test con los objetos creados
		c1.sumarComplejos(c1, c2);
		
		assertEquals(2.0, c1.getpReal(),0);
		
		assertEquals(1.0, c1.getpImaginaria(),0);

	}

}
