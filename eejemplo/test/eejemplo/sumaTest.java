package eejemplo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sumaTest {

	@Test
	void test() {
		System.out.println("Sumando dos numeros positivos....");
		suma s = new suma(2,3);
		assertTrue(s.sumar()==5);
		
		
		
	}

}
