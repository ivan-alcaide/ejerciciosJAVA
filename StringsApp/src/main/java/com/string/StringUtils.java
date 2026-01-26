package com.string;

public class StringUtils {
    public StringUtils() { }  // constructor público

	public String palabraMasCorta(String string, String string2) {
		if (string.length()>string2.length()) {
			return string2;
		}else {
			return string;
		}
		
	}

	public String pistaBasicaContrasena(String string) {
		String resultado="";
		string=string.toLowerCase();
		
		resultado+=string.length()+":";
		resultado+=string.charAt(0)+":";
		resultado+=string.charAt(string.length()-1);
		
		return resultado;
	}

	public int compararAlfabeticamenteIgnoreCase(String string, String string2) {
		
		string=string.toLowerCase();
		string2=string2.toLowerCase();
		
		int resultado;
		
		if(string.compareTo(string2)<0) {
			resultado=-1;
		}else if(string.compareTo(string2)>0) {
			resultado=1;
		}else {
			resultado=0;
		}
		
		return resultado;
	}

	public String fraseHastaFin(String[] strings) {
		String resultado="";
		
		for(int i=0;i<strings.length;i++) {
			String temp=strings[i];
			if (temp.equalsIgnoreCase("fin")) {
				break;
			}else {
				resultado+=temp+" ";
			}
		}
		resultado=resultado.trim();
		return resultado;
	}

	public int contarEspacios(String string) {
		
		int contador=0;
		
		for(int i=0;i<string.length();i++) {
			char letra=string.charAt(i);
			
			if (letra==' ') {
				contador++;
			}
			
		}
		
		return contador;
	}

	public String sinVocales(String string) {
		
		String vocales="aeiouAEIOUáéíóúÁÉÍÓÚüÜ";
		String resultado="";
		
		for (int i=0;i<string.length();i++) {
			if(!vocales.contains(String.valueOf(string.charAt(i)))) {
			resultado+=string.charAt(i);
			}
		}
		
		return resultado;
	}

	public String invertir(String string) {
		String resultado="";
		
		for(int i=string.length()-1;i>-1;i--) {
			resultado+=string.charAt(i);
		}
		
		
		return null;
	}
}
