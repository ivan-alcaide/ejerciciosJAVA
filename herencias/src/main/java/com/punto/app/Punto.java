package com.punto.app;

public class Punto {
	protected double x;
	protected double y;
	
	public Punto(double x, double y) {
		this.x=x;
		this.y=y;
	}
	
	public void desplaza(double dx) {
		this.x+=dx;
	}
	
	public void desplaza(double dx, double dy) {
		this.x+=dx;
		this.y+=dy;
	}
	
	public double distanciaEuclidea(Punto p) {
		double x2=(p.x-this.x)*(p.x-this.x);
		double y2=(p.y-this.y)*(p.y-this.y);
		double dista=Math.sqrt(x2+y2);
		return dista;
	}
	
	public void muestra() {
		System.out.println("Las cordenadas del punto son: " + this.x +", "+ this.y);
	}
}
