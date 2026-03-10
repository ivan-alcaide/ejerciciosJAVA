package reproductor;

import Ordenacion.Mostrable;

public class Podcast implements Reproducible, Mostrable {

	private Accion acc;
	private String titulo;
	private String autor;
	private int duracion;
	
	public Podcast(String titulo,String autor,int duracion) {
		this.titulo=titulo;
		this.autor=autor;
		this.duracion=duracion;
		this.acc=Accion.NoEstaReproductor;
	}

	@Override
	public String mostrar() {
		return "El podcast es " + this.titulo + ", de " + this.autor + ", dura "+this.duracion+" minutos, y su estado es " + this.acc;
	}

	@Override
	public void play() {
		
		if (acc.equals(Accion.Reproduciendo)) {
			System.out.println("Esta pista ya se esta reproduciendo");
		}else {
			this.acc=Accion.Reproduciendo;
			System.out.println("El podcast se está reproduciendo");
		}
		
		
	}

	@Override
	public void pause() {
		if(acc.equals(Accion.Pausado)) {
			System.out.println("Esta pista ya esta pausada");
		}else {
			this.acc=Accion.Pausado;
			System.out.println("El podcast se ha pausado");
		}
		
		
	}

	@Override
	public void stop() {
		
		if (acc.equals(Accion.NoEstaReproductor)) {
			System.out.println("Esta pista no está en el reproductor");
		}else {
			this.acc=Accion.NoEstaReproductor;
			System.out.println("El podcast se ha removido del reproductor");
		}
		
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	
}
