package minijuego;

public class Jugador implements Danable {
    private int vida;
    private String nombre;

    public Jugador(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    @Override
    public void recibirDanio(int puntos) {
        vida -= puntos;
        if (vida <= 0) {
            vida = 0;
            System.out.println("Jugador " + nombre + " ha recibido " + puntos + " de daño. Vida: " + vida + " -> KO");
        } else {
            System.out.println("Jugador " + nombre + " ha recibido " + puntos + " de daño. Vida: " + vida);
        }
    }

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
    
}