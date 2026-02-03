package com.herencias.app;

public class HoraExacta extends Hora {

	protected int segundo;
	
	public HoraExacta(int hora,int minuto,int segundo){
		
		super(hora,minuto);
		if(segundo>59 || segundo<0) {
			throw new IllegalArgumentException("Hora introducida no permitida");
		}
		this.segundo=segundo;
		
	}
	
	@Override
	public void inc() {
		segundo++;
		if(segundo>59) {
			segundo=0;
			super.minuto++;
			if(super.minuto>59) {
				super.minuto=0;
				super.hora++;
				if(super.hora>23) {
					super.hora=0;
				}
			}
		}
	}
	
	
	public Boolean iguales(int hora, int minuto, int segundo) {
		if(super.hora==hora) {
			if(super.minuto==minuto) {
				if(this.segundo==segundo) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	
	
	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", super.hora, super.minuto, this.segundo);
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		if(segundo>59 || segundo<0) {
			throw new IllegalArgumentException("Segundo no permitido");
		}
		this.segundo = segundo;
	}
}
