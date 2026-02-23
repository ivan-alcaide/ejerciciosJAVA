package com.punto.app;

public class Punto3D extends Punto{
	
	protected double z;

	public Punto3D(double x, double y,double z) {
		super(x, y);
		this.z=z;
	}

	public void desplaza(double dx, double dy, double dz) {
		desplaza(dx, dy);
		this.z+=dz;
	}
	
	public double distanciaEuclidea(Punto3D p) {
		double x1=(p.x-super.x)*(p.x-super.x);
		double y2=(p.y-super.y)*(p.y-super.y);
		double z3=(p.z-this.z)*(p.z-this.z);
		double dista=Math.sqrt(x1+y2+z3);
		return dista;
	}
	
	public void muestra() {
		System.out.println("Las coordenadas del punto son: " + super.x+", "+ super.y + ", "+ this.z);
	}
}
