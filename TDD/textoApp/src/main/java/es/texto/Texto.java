package es.texto;

import java.security.PublicKey;

/**
 * Notas rápidas para que el alumnado haga TDD “bien”

Empieza implementando constructores + getters + longitud().

Luego anadirFinal(char) y anadirInicio(char).

Después anadirFinal(String) y anadirInicio(String) con regla “todo o nada” (si no cabe, no modifica).

Finalmente contarVocales().
 */
public class Texto {

	private int longi;
	private String contenido;
	
	
	public Texto(int i) {
		if (i<=0) {
			throw new IllegalArgumentException("maxLongitud debe ser > 0");
		}
		this.longi=i;
		this.contenido="";
	}


	public Texto(String string, int i) {
		if (i<=0) {
			throw new IllegalArgumentException("maxLongitud debe ser > 0");
		}
		if (string==null) {
			throw new IllegalArgumentException("contenidoInicial no puede ser null");
		}
		if (string.length()>i) {
			throw new IllegalArgumentException("contenidoInicial supera maxLongitud");
		}
		
		this.longi=i;
		this.contenido=string;
	}


	public String getContenido() {
		
		return contenido;
	}


	public int longitud() {
		
		return contenido.length();
	}


	public boolean anadirFinal(char c) {
		if (contenido.length()!= longi) {
			contenido=contenido+c;
			return true;
		}
		return false;
	}


	public boolean anadirInicio(char c) {
		if(contenido.length()!=longi) {
			contenido=c+contenido;
			return true;
		}
		return false;
	}


	public boolean anadirFinal(String string) {
		if(string==null) {
			throw new IllegalArgumentException("cadena no puede ser null");
		}
		
		if ((contenido.length()+string.length())<=longi) {
			contenido=contenido+string;
			return true;
		}
		return false;
	}


	public boolean anadirInicio(String string) {
		if(string==null) {
			throw new IllegalArgumentException("cadena no puede ser null");
		}
		if((contenido.length()+string.length())<=longi) {
			contenido=string+contenido;
			return true;
		}
		return false;
	}


	public int contarVocales() {
		if(contenido.length()==0) {
		return 0;	
		}
		String vocales="AEIOUaeiou";
		int contador=0;
		for(int i=0;i<contenido.length();i++) {
			for(int j=0;j<vocales.length();j++) {
				if (contenido.charAt(i)==vocales.charAt(j)) {
					contador++;
				}
			}
		}
		return contador;
		
		
	}

	public String toString() {
		return contenido;
	}



}
