package Actividades_ud3;
//importo el lector
import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		//creo el lector
		Scanner sc=new Scanner(System.in);
		
		//defino las variables
		int num, cuadrado;
		boolean par, positivo;
		
		//hago la estructura del bucle
		do {
			System.out.println("Diga un numero: ");
			num=sc.nextInt();
			par=(num%2)==0;
			positivo=num>0;
			cuadrado=num*num;
			
			System.out.println("¿Es positivo?" + positivo);
			System.out.println("¿Es par?" + par);
			System.out.println("Su cuadrado: " + cuadrado);
		}while(num!=0);
		

	}

}
