package Actividades_ud4;

public class EjemploSobrecarga {

	public static void main(String[] args) {
		
		
		mostrar("hola");
		mostrar(5);
		mostrar("hola buenas",4);
		
		
	}
	
	
	
	public static void mostrar(String mensaje) {
		System.out.println(mensaje);
	}
	
	public static void mostrar(int numero) {
		if (numero%2==0) {
			System.out.println(numero + " es par");
		}else {
			System.out.println(numero + " es impar");
		}
	}
	
	public static void mostrar(String texto, int veces) {
		
		while(veces>0) {
			System.out.println(texto);
			veces--;
		}
	}
}