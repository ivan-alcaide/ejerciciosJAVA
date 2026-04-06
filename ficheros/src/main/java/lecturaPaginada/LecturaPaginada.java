package lecturaPaginada;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class LecturaPaginada {

		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
			try(BufferedReader bfr=new BufferedReader(new FileReader("lecturaPa.txt"))){
				
				String linea;
				int contador=0;
				
				while((linea=bfr.readLine())!=null) {
					System.out.println(linea);
					contador++;
					
					if (contador==24) {
						System.out.println("¿Quieres seguir leyendo?\n - 1 para si\n - Cualquier otro caracter para no");
						int opc=sc.nextInt();
						
						if(opc==1) {
							contador=0;
						}else{
							break;
						}
					}
				}
				
			}catch(Exception ex) {
				
			}
			
		}
}
