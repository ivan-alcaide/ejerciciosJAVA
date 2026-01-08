package es.dni;

import java.util.Random;

public class ControladorDNI {
	
	/**
	 * ATRIBUTOS
	 */
	
	 private final char[] LETRAS = {'T','R','W','A', 'G', 'M', 'Y','F','P','D','X','B', 'N', 'J','Z','S','Q','V','H','L','C','K','E'};
	 private final int DIVISOR = 23;
	 private final int LONGITUD_NUMERO_DNI = 8;
	 private final int LONGITUD_DNI_COMPLETO = 9;
	 
	 private Random random = new Random();
	 
	 /** 
	  * MÉTODOS
	  */
	 
	 private char calcularLetra(String numeroDNI) {
		if(numeroDNI == null) {
			throw new IllegalArgumentException("El número introducido no puede ser null");
		}
		if(numeroDNI.length() != LONGITUD_NUMERO_DNI) {
			throw new IllegalArgumentException("El tamaño del número no es correcto");
		}
		int num =	Integer.parseInt(numeroDNI);
		return LETRAS[num%DIVISOR];
		
	 }
	 public boolean esValido(String dniCompleto) throws Exception {
		 if(dniCompleto == null) return false;
		 if(dniCompleto.length() != LONGITUD_DNI_COMPLETO) {
			 throw new Exception("La longitud no es correcta");
		 }
			
		 
		 
		 char letra = dniCompleto.charAt(8);
		 String dni_sin_letra = dniCompleto.substring(0, 8);
		 
		 return calcularLetra(dni_sin_letra) == Character.toUpperCase(letra);

	 }
	 
	 public String generarAleatorioDNI() {
		 int numeroDNIRandom=random.nextInt(100_000_000);
		 String numero = String.format("%08d", numeroDNIRandom);
		 char letra = calcularLetra(numero);
		
		 return numero + letra;
	 }
	 
	 public char[] getLETRAS() {
		 return LETRAS;
	 }
}
