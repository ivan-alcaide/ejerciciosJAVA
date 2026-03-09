package minijuego;

public class Enemigo implements Danable {
    private int vida;
    private String tipo;

    public Enemigo(String tipo, int vida) {
        this.tipo = tipo;
        this.vida = vida;
    }

    @Override
    public void recibirDanio(int puntos) {
        vida -= puntos;
        if (vida <= 0) {
            vida = 0;
            System.out.println("Enemigo " + tipo + " ha recibido " + puntos + " de daño. Vida: " + vida + " -> KO");
        } else {
            System.out.println("Enemigo " + tipo + " ha recibido " + puntos + " de daño. Vida: " + vida);
        }
    }

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
    
    
}
