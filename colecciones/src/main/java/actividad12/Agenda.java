package actividad12;

import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Agenda {
	
	private List<Contacto> lista=new ArrayList<Contacto>();
	private Set<Contacto> conjunto= new HashSet<Contacto>();

	
	
	public void addContacto(Contacto c) {
		lista.add(c);
		conjunto.add(c);
	}
	
	public void eliminarContacto(String nombre) {
		Iterator<Contacto> it = lista.iterator();
		
		while (it.hasNext()) {
			Contacto c=it.next();
			
			if(c.getNombre().equals(nombre)) {
				it.remove();
				conjunto.remove(c);
			}
		}
	}
	
	
	public Contacto buscar(String nombre) {
		
		for(Contacto c : lista) {
			if(c.getNombre().equalsIgnoreCase(nombre)) {
				return c;
			}
		}
		return null;
	}
	
	public void mostrar() {
		
		for(Contacto c : lista) {
			c.imprimir();
			c.getTipo();
			System.out.println();
		}
		
	}
	
		
}
