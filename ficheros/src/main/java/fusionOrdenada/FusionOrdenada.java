package fusionOrdenada;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class FusionOrdenada {

	public static void main(String[] args) {
		
		
		try(BufferedReader bfr1=new BufferedReader(new FileReader("perso1.txt"));
				BufferedReader bfr2=new BufferedReader(new FileReader("perso2.txt"));){
			
			String[] nombres= new String[0];
			
			System.out.println("Fichero 1");
			String linea1;
			
			while((linea1=bfr1.readLine())!=null) {
				System.out.println(linea1);
				nombres=Arrays.copyOf(nombres, nombres.length+1);
				nombres[nombres.length-1]=linea1.trim();
			}
		
			System.out.println("======================================");
			System.out.println("Fichero 2");
			String linea2;
			
			while((linea2=bfr2.readLine())!=null) {
				System.out.println(linea2);

				nombres=Arrays.copyOf(nombres, nombres.length+1);
				nombres[nombres.length-1]=linea2.trim();				
			}
			
			
			Arrays.sort(nombres);
			
			try(BufferedWriter bfw=new BufferedWriter(new FileWriter("todos.txt",false))){
				for(int i=0;i<nombres.length;i++) {
					bfw.append(nombres[i]);
					bfw.newLine();
				}
				
				System.out.println("Fusion creada correctamente");
			}catch(Exception ex2) {
				System.err.println(ex2.getMessage().toString());
			}
			
			
			
			
			
			
			
		}catch(Exception ex) {
			System.err.println(ex.getMessage().toString());
		}

	}

}
