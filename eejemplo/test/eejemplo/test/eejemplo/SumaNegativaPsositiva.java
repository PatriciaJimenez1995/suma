package eejemplo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumaNegativaPsositiva {

	@Test
	void test() {
		System.out.println("Comprovar si la suma  ....");
		suma s = new suma(-4,6);
		assertTrue(s.sumar()== 2);

	}

}
