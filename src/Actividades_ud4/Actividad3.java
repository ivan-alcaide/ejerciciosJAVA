package Actividades_ud4;

import java.util.Scanner;

public class Actividad3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a_v;
		double rad, alt;		
		System.out.println("1-area  o  2-volumen");
		a_v=sc.nextInt();
		System.out.println("Diga el radio de su cilindro");
		rad=sc.nextDouble();
		System.out.println("Diga la altura de su cilindro");
		alt=sc.nextDouble();
		if(a_v==1) {
		area(rad,alt);
		}else if(a_v==2) {
		vol(rad,alt);
		}else {
			System.out.println("1 o 2, no ese numero");
		}
		
	}
	
	
	
	public static void area(double r,double h) {
		
			double area;
			area=2*Math.PI*r*(h+r);
			System.out.println("el area es " + area);
			
			
		
	
	}
	public static void vol(double r, double h) {
		double vol;
		vol=Math.PI*(r*r)*h;
		System.out.println("el volumen es " + vol);
	}
	
	
	
}
