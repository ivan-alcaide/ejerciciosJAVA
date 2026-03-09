package UsuRes;

import Ordenacion.Mostrable;

public class Reserva implements Validable, Mostrable{
	
	private String fecha;
	private int numPersonas;
	
	
	public Reserva(String fecha, int numPersonas) {
		this.fecha=fecha;
		this.numPersonas=numPersonas;
	}
	

	@Override
	public void validar() throws IllegalArgumentException {
		if (this.numPersonas<=0) {
			throw new IllegalArgumentException("El número de personas debe ser mayor que 0");
		}
	}
	
	@Override
	public String mostrar() {
		return "La fecha es " + this.fecha + " y el número de personas es " + this.numPersonas;
	}
	
}
