package 
Actividades_ud3;

//importo el lector
import java.util.Scanner;

public class Actividad10 {

	public static void main(String[] args) {
		//creo el lector
		Scanner sc=new Scanner(System.in);
		
		//defino las variables
		int num, multiplos;
		
		//creo el bucle que se repite hasta que no se cumpla la condicion
		do {
			
		
		System.out.println("Dime un numero del 1 al 10: ");
		num=sc.nextInt();
		}while (num<1 || num>10);//aqui la condicion
		
		System.out.println("La tabla del " + num + " es: ");
		
		//aqui otro bucle for que se repite hasta terminar la tabla
		for(int i=0;i<=10;i++) {
			System.out.print(i + " x " + num);
			multiplos=i*num;
			System.out.println(" = " + multiplos);
		}
		
			
		

	}

}
