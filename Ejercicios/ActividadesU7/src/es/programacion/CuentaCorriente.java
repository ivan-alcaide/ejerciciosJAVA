package es.programacion;

public class CuentaCorriente {
	
	private double limiteDescubierto;
	private String nombre;
	private String dni;
	private double saldo;
	
	public CuentaCorriente(double saldo) {
		this.saldo = saldo;
		this.limiteDescubierto = 0;
	}
	public CuentaCorriente(double saldo, double limite, String dni) {
		this.saldo = saldo;
		this.limiteDescubierto = limite;
		this.dni = dni;
	}
	
	public CuentaCorriente(String nombre, String dni) {
		this.saldo = 0;
		this.nombre = nombre;
		this.dni = dni;
		this.limiteDescubierto = -50.0;
	}
	
	
	public boolean sacarDinero(double cantidad) throws Exception  {
		if(this.saldo - cantidad >= this.limiteDescubierto) {
			this.saldo -= cantidad;
			return true;
		}else {
			throw new Exception("No tienes saldo suficiente");
		}
	}
	
	public boolean ingresarDinero(double cantidad) throws Exception {
		if(cantidad > 0) {
			this.saldo += cantidad;
			return true;
		}else {
			throw new Exception("Esa cantidad no es posible");
		}
	}
	

	public String mostrarInformacion() {
		String mensaje =  "DNI: " + this.dni + ", saldo disponible: " + this.saldo;
		System.out.println(mensaje);
		return mensaje;
	}
	
	public String mostrarInformacion(TipoInformacion tipo) {
		String salida="";
		switch (tipo) {
		case TipoInformacion.SALDO:
			salida = "" + this.saldo;
			break;

		default:
			break;
		}
		return salida;
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
	
	
	
}
