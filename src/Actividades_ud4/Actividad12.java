package Actividades_ud4;

import java.util.Scanner;

public class Actividad12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ident;
		System.out.println("Elije la operacion para la calculador: ");
		System.out.println("1) Suma  2)Resta  3)Multiplicación  4)División");
		ident=sc.nextInt();
		if(ident!=1 && ident !=2 && ident!= 3 && ident != 4) {
			System.out.println("Operación no encontrada");
		}else {
			
		System.out.println("Ahora di los 2 numeros con los que desea hacer la operación deseada y te mostraré el resiltado");
		System.out.println("El resultado es: " + calculadora(ident,sc.nextInt(),sc.nextInt()));
		}
	}
	
	//aqui creo la funcion en la que dependiendo del identificador devuelve el resultado de las distintas operaciones
	public static double calculadora(int ident, int n1, int n2) {
		
		if(ident==1) {
			return n1+n2;
		}else if (ident==2) {
			return n1-n2;
		}else if (ident==3) {
			return n1*n2;
		}else if(ident==4){
			return n1/n2;
		}else {
			return 0.0;
		} 
	}

}
