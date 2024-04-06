package eejemplo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class posiNegatTest {

	@Test
	void test() {
		System.out.println("Comprovar si la suma  ....");
		suma s = new suma(-4,8);
		assertTrue(s.sumar() >0);;
	}

}
