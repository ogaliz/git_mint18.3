package calculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	
	Calculadora calc;
	
	@Before
	public void before() {
		System.out.println("Esto es la instancia previa a cada uno de los test.");
		calc = new Calculadora();
	}
	@After
	public void after() {
		System.out.println("Ejecutado despues de cada uno de los test.");
		calc.clear();
	}

	@Test
	public void testSum() {
		System.out.println("Se ejecuta la suma.");
		int resultado = calc.add(3, 2);
		int esperado = 5;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testAnsSum() {	
		System.out.println("Se ejecuta la resta.");
		calc.add(3, 2);
		int resultado = calc.ans();
		int esperado = 5;
		assertEquals(esperado, resultado);
	}

}
