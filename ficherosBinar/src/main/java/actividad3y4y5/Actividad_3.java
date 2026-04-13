package actividad3y4y5;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Actividad_3 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try(DataOutputStream esc=new DataOutputStream(new FileOutputStream("positivos.bin",false))){
			
			boolean rep=true;
			do {
				int num;
				System.out.println("Introduzca enteros positivos, cuando termine introduzca un entero negativo para finalizar");
				num=sc.nextInt();
				
				if(num<0) {
					rep=false;
					break;
				}else {
					esc.writeInt(num);
				}
				
				
			}while(rep);
			
		}catch(Exception ex) {
			System.err.println(ex.getMessage().toString());
		}
		
	
		
		
	}

}
