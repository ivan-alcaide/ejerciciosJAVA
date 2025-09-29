package ACTIVIDADES;
import java.util.Scanner;
public class Actividad9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num;
		boolean par;
		
		System.out.println("Diga un número: ");
		num = sc.nextInt();
		
		par = num%2==0;
		
		System.out.println("¿Es par? " + par);
	}

}
