package actividad1y2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Actividad1y2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Escriba a continuacion un numero decimal");
		double num=sc.nextDouble();
		
		
		try(DataOutputStream esc=new DataOutputStream(new FileOutputStream("double.dat",false))){
			
			
			esc.writeDouble(num);
			
			
		}catch(Exception ex1) {
			System.err.println(ex1.getMessage().toString());
		}
		
		try(DataInputStream lee=new DataInputStream(new FileInputStream("double.dat"))){
			
			double res=lee.readDouble();
			
			System.out.println(res);
			
		}catch(Exception ex2) {
			System.err.println(ex2.getMessage().toString());

		}
		
		
	}

}
