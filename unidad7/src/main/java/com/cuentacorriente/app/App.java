package com.cuentacorriente.app;

public class App {

	public static void main(String[] args) {
		
		cuentaCorriente cuenta1=new cuentaCorriente("ivan","11111111F");
		banco banco=new banco("BBVA","Madrid");
		
		cuenta1.asignarBanco(banco);
		System.out.println(cuenta1.mostrarInformacion());
		
		cuenta1.mostrarInfobanco();
		
	}
	
}
