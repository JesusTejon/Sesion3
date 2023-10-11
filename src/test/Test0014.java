package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test0014 {
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		Cuenta cta12345 = new Cuenta(50);
		Cuenta cta67890 = new Cuenta(0);
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
		cta12345.getSaldo();
		cta12345.getHistorialMov();
		cta12345.getSaldoFinal();
	}
	
	@Test
	void testCuenta67890() {
		cta67890.reintegro(350);
		cta67890.reintegro(200);
		cta67890.reintegro(150);
		cta67890.ingreso(50);
		cta67890.getSaldo();
		cta67890.getHistorialMov();
		cta67890.getSaldoFinal();
	}

}
