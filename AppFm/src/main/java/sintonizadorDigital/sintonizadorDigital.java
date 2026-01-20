package sintonizadorDigital;

public class sintonizadorDigital {

	private final double freq_max=108;
	private final double freq_min=80;
	private double freq;
	
	public sintonizadorDigital() {
		this.freq=80;
	}
	
	public void display() {
		System.out.println("La frecuencia actual es " + freq);
	}
	
	public void up() {
		if (freq+0.5>freq_max) {
			freq=freq_min;
		}else {
			freq=freq+0.5;
		}
		
	}
	
	public void down() {
		if(freq-0.5<freq_min) {
			freq=freq_max;
		}else {
			freq=freq-0.5;
		}
	}
}
