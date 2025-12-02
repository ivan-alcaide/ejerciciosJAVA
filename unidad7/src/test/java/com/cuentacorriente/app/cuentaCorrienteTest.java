package com.cuentacorriente.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class cuentaCorrienteTest {

	cuentaCorriente cc;
	@BeforeAll
	static void setUpBeforeClass() throws Exception{
		
	}
	
	@BeforeEach
	void setUp() throws Exception {
		cc=new cuentaCorriente("Juan" , "1111A");
		
	}

	@Test
	@DisplayName("comprobacion sacar dinero")
	void testSacarDinero()throws Exception{
		cc.sacarDinero(10);
		double saldoEsperado =-10;
		double saldo=cc.getSaldo();
		assertEquals(saldoEsperado, saldo);
	}
	
	@Test
	@DisplayName("Comprobacion ingresar dinero")
	void testIngresarDinero() throws Exception{
		cc.ingresarDinero(50);
		double saldoEsperado =50;
		double saldo=cc.getSaldo();
		assertEquals(saldoEsperado,saldo);
	}
}
