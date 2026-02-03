package com.herencias.app;

public class Hora {
	protected int hora;
	protected int minuto;
	
	
	public Hora (int hora,int minuto) {
		if(hora>23 || minuto>59 || hora<0 || minuto<0) {
			throw new IllegalArgumentException("Hora introducida errónea");
		}else {
			this.hora=hora;
			this.minuto=minuto;
		}
		
	}
	
	
	public void inc() {
		minuto++;
		if(minuto>59) {
			minuto=0;
			hora++;
			if(hora>23) {
				hora=0;
			}
		}
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d", hora, minuto);
	}
	
	
	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if(hora<0 || hora>23) {
			throw new IllegalArgumentException("Hora introducida no permitida");
		}
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		if(minuto>59 || minuto<0) {
			throw new IllegalArgumentException("Minutos introducidos no permitidos");
		}
		this.minuto = minuto;
	}
	
	
	
	
}
