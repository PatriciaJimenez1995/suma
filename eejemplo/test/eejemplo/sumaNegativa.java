package eejemplo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sumaNegativa {

	@Test
	public void sumaNegativa() {
		System.out.println("Comprovar si la suma es negativa....");
		suma s = new suma(-4,-8);
		assertTrue(s.sumar() >0);
	}

}
