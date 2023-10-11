package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class Test0014 {
	
	static Cuenta cta12345;
	static Cuenta cta67890;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		 cta12345 = new Cuenta("12345",50);
		 cta67890 = new Cuenta("67890",0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCuenta12345() {
		cta12345.reintegro(200);
		cta12345.ingreso(100);
		cta12345.reintegro(200);
		cta12345.getHistorialMov();
		
		assertEquals(50, cta12345.getSaldo());
		assertEquals(-250, cta12345.getSaldoFinal(1));

	}
	
	@Test
	void testCuenta67890() {
		cta67890.reintegro(350);
		cta67890.reintegro(200);
		cta67890.reintegro(150);
		cta67890.ingreso(50);
		cta67890.getHistorialMov();
		
		assertEquals(0, cta67890.getSaldo());
		assertEquals(-450, cta67890.getSaldoFinal(2));
	}

}
