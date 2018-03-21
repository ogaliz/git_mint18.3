package entrega5;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTravessa {
	public TestTravessa() {
	}

	@Test
	public void pintaJornada() {
		int[][] pintaJornada1 = {};
		assertEquals(0, Travessa.pintaJornada(pintaJornada1));
	}

	@Test
	public void testCalcularVictoriesVisitants2() {
		int[][] partits1 = { { 1, 4 }, { 0, 2 }, { 3, 1 } };
		assertEquals(2, Travessa.calcularVictoriesVisitants(partits1));
	}

	@Test
	public void testCalcularVictoriesVisitants1() {
		int[][] partits2 = {};
		assertEquals(2, Travessa.calcularVictoriesVisitants(partits2));
	}

	@Test
	public void testMitjaGolsPartit2() {
		int[][] partits2 = { { 1, 4 }, { 2, 2 } };
		assertEquals(1, 4, Travessa.mitjaGolsPartit(partits2));
	}
}
