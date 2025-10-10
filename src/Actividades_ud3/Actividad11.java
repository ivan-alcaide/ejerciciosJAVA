package 
Actividades_ud3;

//importo el lector
import java.util.Scanner;

public class Actividad11 {

	public static void main(String[] args) {
		//creo el lector
		Scanner sc=new Scanner(System.in);
		
		//defino las variables
		int num, multiplos;
		
		
		num=0;
		//creo el bucle que se repite hasta que no se cumpla la condicion
		do {
			num++;
		
		
		System.out.println("La tabla del " + num + " es: ");
		
		//aqui otro bucle for que se repite hasta terminar la tabla
		for(int i=0;i<=10;i++) {
			System.out.print(i + " x " + num);
			multiplos=i*num;
			System.out.println(" = " + multiplos);
		}}while (num<10);//aqui la condicion
		
			
		

	}

}
