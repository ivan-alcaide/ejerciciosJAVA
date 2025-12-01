package cuentacorriente;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) throws Exception {
		
		Scanner sc=new Scanner(System.in);
		String nombre="";
		String dni="";
		
		
		
		cuentaCorriente cc1=new cuentaCorriente("Iván","1111111A");
		cuentaCorriente cc2=new cuentaCorriente(3.52);
		cuentaCorriente cc3=new cuentaCorriente(3.52,1000,"11111111A");
		
		System.out.println(cc1.mostrarInformacion());
		System.out.println();
		System.out.println(cc2.mostrarInformacion());
		System.out.println();
		System.out.println(cc3.mostrarInformacion());
		
		cc1.sacarDinero(0.90);
		cc1.sacarDinero(60.0);
		
		
	}

}
