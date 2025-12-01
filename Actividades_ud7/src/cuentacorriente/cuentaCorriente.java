package cuentacorriente;

public class cuentaCorriente {
	//atributos
	private double saldo;
	private double limiteDescubierto;
	private String nombre;
	private String dni;
	
	public cuentaCorriente(String nombre, String dni) {
		this.nombre=nombre;
		this.dni=dni;
		this.saldo=0;
		this.limiteDescubierto=-50;
		
	}
	
	
	public cuentaCorriente(double saldo) {
		this.saldo = saldo;
		this.limiteDescubierto=0;
	}
	
	public cuentaCorriente(double saldo,double limiteDescubierto,String dni) {
		this.saldo=saldo;
		this.limiteDescubierto=limiteDescubierto;
		this.dni=dni;
	}



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
		return "DNI : " + this.dni +"\nNombre : "+ this.nombre + "\nSaldo : " + this.saldo + "\nLimite posible al descubierto : " + this.limiteDescubierto;
	}
	
}
