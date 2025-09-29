package Actividades_ud1;
import java.util.Scanner;
public class Actividad7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = 3.14159265359;
		double lon, rad, area;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Diga el radio de su circunferencia");
		rad = sc.nextDouble();
		
		lon =  2.0*pi*rad;
		area = pi*rad*rad;
		
		System.out.println("La longitud de su circunferencia es " + lon + " y el área es " + area);
		
		
		
		
	}

}
