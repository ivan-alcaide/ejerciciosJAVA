package com.cuentacorriente.app;
import java.util.Scanner;
public class cuentaCorriente {
	//atributos
	private double saldo;
	private double limiteDescubierto;
	public String nombre;
	protected String dni;
	public static String nbanco = "Banco Camas";
	
	banco banco;
	


	//METODOS
	
	//constructores
	
	public cuentaCorriente(String nombre, String dni) {
		this.nombre=nombre;
		this.dni=dni;
		this.saldo=0;
		this.limiteDescubierto=-50;
		
	}
	
	
	public cuentaCorriente(double saldo) {
		this.saldo = saldo;
		this.limiteDescubierto=0;
		//para que al mostrar info no ponga null
		this.nombre="Iván";
		this.dni="11111111A";
	}
	
	public cuentaCorriente(double saldo,double limiteDescubierto,String dni) {
		this.saldo=saldo;
		this.limiteDescubierto=limiteDescubierto;
		this.dni=dni;
		//para que al mostrar info no ponga null
		this.nombre="Iván";
	}
	public cuentaCorriente(String nombre, String dni,banco banco) {
		this.nombre=nombre;
		this.dni=dni;
		this.saldo=0;
		this.limiteDescubierto=-50;
		this.banco=banco;
		
	}

	//acciones
	
	public boolean sacarDinero(double cantidad) throws Exception {
		this.saldo=saldo;
		this.limiteDescubierto=limiteDescubierto;
		
		if(saldo-cantidad>=limiteDescubierto) {
			this.saldo=this.saldo-cantidad;
			return true;
			
		}else {
			throw new Exception("No se ha podido comletar la operación ya que no tiene saldo suficiente");
		}
	}
	
	public boolean ingresarDinero(double cantidad) throws Exception{
		if (cantidad>0) {
			this.saldo=this.saldo+cantidad;
			return true;
		}else {
			throw new Exception("Esa cantidad es posible");
		}
		
		
	}
		
	public String mostrarInformacion() {
		return "DNI : " + this.dni +"\nNombre : "+ this.nombre + "\nSaldo : " + this.saldo + "\nLimite posible al descubierto : " + this.limiteDescubierto ;
	}
	
	public void asignarBanco(banco banco) {
		this.banco=banco;
	}
	
	public void mostrarInfobanco() {
		System.out.println("Nombre del banco : " + this.banco.getNombre());
		System.out.println("Capital : " + this.banco.getCapital());
		System.out.println("Dirección central : " + this.banco.getDireccionCentral());
	}
	
	public void eliminarBanco() {
		this.banco=null;
	}
	
	//getters y setters
	
	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public double getLimiteDescubierto() {
		return limiteDescubierto;
	}


	public void setLimiteDescubierto(double limiteDescubierto) {
		this.limiteDescubierto = limiteDescubierto;
	}
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}

	public static String getNbanco() {
		return nbanco;
	}
	
	

	public static void setNbanco(String nbanco) {
		cuentaCorriente.nbanco = nbanco;
	}


	public banco getBanco() {
		return banco;
	}

}
