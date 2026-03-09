package minijuego;

public class App {
	 public static void main(String[] args) {

	        Danable j1 = new Jugador("Carlos", 100);
	        Danable j2 = new Jugador("Ana", 80);
	        Danable e1 = new Enemigo("Orco", 60);
	        Danable e2 = new Enemigo("Dragón", 150);

	        j1.recibirDanio(50);
	        j2.recibirDanio(50);
	        e1.recibirDanio(50);
	        e2.recibirDanio(50);
	    }
}
