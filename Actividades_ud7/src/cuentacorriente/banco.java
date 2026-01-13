package cuentacorriente;

public class banco {
	
	private final String nombre;
	private int capital;
	private String direccionCentral;
	
	
	public banco(String nombre, String direccionCentral) {
		this.nombre=nombre;
		this.capital=5200000;
		
	}
	
	
	public double getCapital() {
		return capital;
	}
	public void setCapital(int capital) {
		this.capital = capital;
	}
	public String getDireccionCentral() {
		return direccionCentral;
	}
	public void setDireccionCentral(String direccionCentral) {
		this.direccionCentral = direccionCentral;
	}
	
}
