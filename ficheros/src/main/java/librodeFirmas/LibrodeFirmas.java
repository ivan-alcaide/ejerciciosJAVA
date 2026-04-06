package librodeFirmas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class LibrodeFirmas {
	
	
	public LibrodeFirmas() {
		
	}
	
	
	public void menu() {
	    Scanner sc = new Scanner(System.in);
	    int op;

	    do {
	        System.out.println("Elije que deseas hacer");
	        System.out.println("1) Mostrar Firmas\n2) Insertar nombre\n3) Salir");
	        op = sc.nextInt();
	        sc.nextLine();
	        if (op == 1) {
	            mostrarFirmas();
	        } else if (op == 2) {
	            System.out.println("Introduce tu nombre:");
	            insertarFirma(sc.nextLine());
	        }

	    } while (op != 3);
	}
	
	
	public void mostrarFirmas() {
		
		try(BufferedReader bfr=new BufferedReader(new FileReader("LibroDeFirmas.txt"))){
			String linea;
			while((linea=bfr.readLine())!=null) {
				System.out.println(linea);
			}
			
			
		}catch(Exception ex) {
			System.err.println(ex.getMessage().toString());
		}finally {
			
		}
		
	}
	
	
	
	public void insertarFirma(String nombre) {
	    boolean existe = false;

	    try (BufferedReader bfr = new BufferedReader(new FileReader("LibroDeFirmas.txt"))) {
	        String linea;

	        while ((linea = bfr.readLine()) != null) {
	            if (linea.equalsIgnoreCase(nombre)) {
	                existe = true;
	                break;
	            }
	        }

	    } catch (Exception ex) {
	        System.err.println(ex.getMessage());
	    }

	    if (!existe) {
	        try (BufferedWriter bfw = new BufferedWriter(new FileWriter("LibroDeFirmas.txt", true))) {
	            bfw.write(nombre);
	            bfw.newLine();
	            System.out.println("Firma añadida.");
	        } catch (Exception ex) {
	            System.err.println(ex.getMessage());
	        }
	    } else {
	        System.out.println("Ese nombre ya está en el libro.");
	    }
	}

}
