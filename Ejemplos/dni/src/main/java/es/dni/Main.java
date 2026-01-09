package es.dni;

public class Main {
	
	
	
	public static void main(String[] args) {
		ControladorDNI controlador = new ControladorDNI();
		String dniRandom = controlador.generarAleatorioDNI();
		System.out.println("DNI Random: " + dniRandom);
		
		if(controlador.esValido(dniRandom)) {
			System.out.println("Es valido");
		}else {
			System.out.println("No lo es");
		}
		
		if(controlador.esValido("1234")) {
			System.out.println("Es valido");
		}else {
			System.out.println("No lo es");
		}
	}
	
	
	
	
}
