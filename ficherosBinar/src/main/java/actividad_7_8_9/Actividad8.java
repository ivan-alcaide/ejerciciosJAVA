package actividad_7_8_9;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Actividad8 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner sc=new Scanner(System.in);
		
		try(DataOutputStream esc=new DataOutputStream(new FileOutputStream("textaco.dat"))){
			
			boolean rep=true;
			
			while(rep) {
				System.out.println("Introduzca una linea de texto, para terminar pulse enter sin introducir nada");
				String linea=sc.nextLine();
				if(linea.equalsIgnoreCase("")) {
					rep=false;
					break;
				}else {
					esc.writeUTF(linea);
				}
			}
			
			
			
		}catch(EOFException ex2) {
			ex2.printStackTrace();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try(DataInputStream lee=new DataInputStream(new FileInputStream("textaco.dat"))){
			while(true) {
				System.out.println(lee.readUTF());
			}
			
			
		}catch(EOFException ex2) {
			System.out.println("Texto leido correctamente");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
