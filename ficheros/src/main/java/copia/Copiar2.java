package copia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Copiar2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Escriba el nombre del archivo que desea copiar");
		String nombreF=sc.nextLine();
		
		try(BufferedReader bfr=new BufferedReader(new FileReader(nombreF));
			BufferedWriter bfw=new BufferedWriter(new FileWriter("copia_de_"+nombreF))){
			
			String linea;
			while((linea = bfr.readLine()) != null) {
				bfw.write(linea);
				bfw.newLine();
			}
			
		}catch(Exception ex) {
			System.err.println(ex.getMessage().toString());
		}finally {
			
		}

	}

}
 