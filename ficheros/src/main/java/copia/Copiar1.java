package copia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Copiar1 {

	public static void main(String[] args) {
		
		try(BufferedReader bfr=new BufferedReader(new FileReader("original.txt"));
			BufferedWriter bfw=new BufferedWriter(new FileWriter("copia.txt"))){
			
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
