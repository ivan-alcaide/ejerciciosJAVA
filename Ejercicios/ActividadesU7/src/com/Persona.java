package com;
public class Persona {
	public static String prueba = "EsEstatico";
	//atributos
	private String nombre;
	private int edad;
	//métodos
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	private void saluda() {
		System.out.println("Hola " + nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	

}
