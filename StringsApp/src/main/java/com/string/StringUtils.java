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
		
		
		return resultado;
	}

	public int contarPalabra(String frase, String palabra) {
	    if (frase == null || palabra == null || palabra.isEmpty()) {
	        return 0;
	    }

	    String fraseLower = frase.toLowerCase();
	    String palabraLower = palabra.toLowerCase();

	    int contador = 0;
	    int indice = 0;

	    while ((indice = fraseLower.indexOf(palabraLower, indice)) != -1) {
	        contador++;
	        indice += palabraLower.length(); 
	    }

	    return contador;
	}
	
	public boolean esPalindroma(String texto) {
	    if (texto == null) {
	    	return false;
	    }

	    String limpio = texto.toLowerCase().replace(" ", "");

	    int i = 0;
	    int j = limpio.length() - 1;

	    while (i < j) {
	        if (limpio.charAt(i) != limpio.charAt(j)) {
	            return false;
	        }
	        i++;
	        j--;
	    }

	    return true;
	}

	public String traducirJavalandia(String string) {
		String javalin1="Javalín, javalón";
		String javalin2="javalén, len, len";
		return null;
	}
	
	


}
