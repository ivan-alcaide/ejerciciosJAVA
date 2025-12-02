package com.cuentacorriente.app;

import java.util.Scanner;

public class Actividad3 {
	
	public static void main(String[] args) throws Exception {
		
		Scanner sc=new Scanner(System.in);
	
		
		cuentaCorriente cc1=new cuentaCorriente("Iván","1111111A");
		cuentaCorriente cc2=new cuentaCorriente(3.52);
		cuentaCorriente cc3=new cuentaCorriente(3.52,-1000,"11111111A");
		
		System.out.println("Primer tipo");
		System.out.println();
		System.out.println(cc1.mostrarInformacion());
		System.out.println();
		System.out.println();
		cc1.sacarDinero(0.90);
		System.out.println(cc1.mostrarInformacion());
		System.out.println();
		System.out.println();
		cc1.ingresarDinero(10);
		System.out.println(cc1.mostrarInformacion());
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("Segundo tipo");
		System.out.println();
		System.out.println(cc2.mostrarInformacion());
		System.out.println();
		System.out.println();
		cc2.sacarDinero(2);
		System.out.println(cc2.mostrarInformacion());
		System.out.println();
		System.out.println();
		cc2.ingresarDinero(50);
		System.out.println(cc2.mostrarInformacion());
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("Tercer tipo");
		System.out.println();
		System.out.println(cc3.mostrarInformacion());
		System.out.println();
		System.out.println();
		cc3.sacarDinero(200);
		System.out.println(cc3.mostrarInformacion());
		System.out.println();
		System.out.println();
		cc3.ingresarDinero(500);
		System.out.println(cc3.mostrarInformacion());

		
		
		
	}

}
