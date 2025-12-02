package com.cuentacorriente.app;

public class Actividad4 {

	public static void main(String[] args) {
		cuentaCorriente cc =new cuentaCorriente("Ivan","1111111A");
		
		cc.nombre="Hola"; //no da error porque es publica
		//cc.saldo=1; da error por ser privada
		cc.dni="111A"; //no da error porque esta en el mismo package
		//cc.limiteDescubierto=-32; da error porque es privada
	}

}
