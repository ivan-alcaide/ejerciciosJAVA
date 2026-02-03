package com.herencias.app;

public class Hora12 extends Hora{

	protected Periodo periodo;
	

	public Hora12(int hora, int minuto, Periodo periodo) {
		super(hora, minuto);
		if(super.hora>12) {
			super.hora=super.hora-12;
			this.periodo=periodo.PM;
		}else {
			this.periodo=periodo;
		}
		
		
		
	}
	
	@Override
	public void inc() {
		super.minuto++;
		if(super.minuto>59) {
			super.minuto=0;
			super.hora++;
			if(super.hora>11 && super.hora<13) {
				if(periodo.equals(periodo.PM)) {
					periodo=periodo.AM;
				}else {
					periodo=periodo.PM;
				}
			}
			if(super.hora>12) {
				super.hora=1;
				
			}
		}
	}
	@Override
	public String toString() {
		return String.format("%02d:%02d", super.hora, super.minuto) + " " + this.periodo;
	}
	
}
