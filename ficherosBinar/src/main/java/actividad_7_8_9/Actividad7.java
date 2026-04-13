package actividad_7_8_9;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Actividad7 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduzca una frase");
		String frase=sc.nextLine();
		
		try(DataOutputStream esc=new DataOutputStream(new FileOutputStream("frase.dat"))){
			
			esc.writeUTF(frase);
			
			
		}catch(EOFException ex2) {
			ex2.printStackTrace();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try(DataInputStream lee=new DataInputStream(new FileInputStream("frase.dat"))){
			
			String recuperada=lee.readUTF();
			System.out.println(recuperada);
			
			
		}catch(EOFException ex2) {
			ex2.printStackTrace();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
