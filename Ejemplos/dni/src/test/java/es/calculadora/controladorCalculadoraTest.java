package es.calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class controladorCalculadoraTest {

	controladorCalculadora control;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		control=new controladorCalculadora();
	}
	

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSuma() {
		control.calculadora(1,1);
		System.out.println(control.sumar());
	}
	
	@Test
	void testResta() {
		control.calculadora(0, 2);
		System.out.println(control.restar());
	}
	
	@Test
	void testMulti() {
		control.calculadora(2, 2);
		System.out.println(control.multiplicar());
	}
	
	@Test
	void testDivi() {
		control.calculadora(2, 0);
		System.out.println(control.dividir());
	}

}
