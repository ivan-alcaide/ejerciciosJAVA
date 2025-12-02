package es.programacion;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		CuentaCorriente cuenta = new CuentaCorriente(1000);
		cuenta.setNombre("Prueba");
		cuenta.setDni("12345678D");
		cuenta.mostrarInformacion();
		cuenta.sacarDinero(1000);
		cuenta.mostrarInformacion();
	}
	
	public static void pruebaConstructorConParametrosDniNombre() throws Exception {
		CuentaCorriente cc = new CuentaCorriente("Maria", "12345678A");
		cc.mostrarInformacion();
		cc.ingresarDinero(100.0);
		cc.mostrarInformacion();
		cc.sacarDinero(50);
		cc.mostrarInformacion();
		cc.sacarDinero(50);
		cc.mostrarInformacion();
		cc.sacarDinero(50);
	}

}
