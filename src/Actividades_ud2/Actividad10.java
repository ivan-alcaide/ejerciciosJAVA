package Actividades_ud2;
import java.util.Scanner;
public class Actividad10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		final String CAPICUA = "Es capicúa";
		final String Negacion = "No es capicúa";
		
		int unidades, decenas, centenas, millares, num;
		
		System.out.println("Diga un número del 0 al 99.999: ");
		num = sc.nextInt();
		
		if (num<10) {
			System.out.println(Negacion);
		}else if (num<100) {
			unidades = num%10;
			decenas = num/10;
			if (unidades==decenas) {
				System.out.println(num + " " + CAPICUA);
			}else {
				System.out.println(num + " " + Negacion);
			}
		}else if (num<1000) {
			unidades = num%10;
			centenas = num/100;
			if (unidades==centenas) {
				System.out.println(num + " " + CAPICUA);
			} else {
				System.out.println(num + " " + Negacion);
			}
		}else if(num<100000) {
			unidades=num%10;
			decenas=(num/10)%10;
			centenas=(num/100)%10;
			millares=num/1000;
			if (unidades== millares && decenas ==centenas) {
				System.out.println(num + " " + CAPICUA);
				}else {
					System.out.println(num + " " + Negacion);
			}
		}else {
				System.out.println("Numero demasiado grande");
		
	}
	}
 }
