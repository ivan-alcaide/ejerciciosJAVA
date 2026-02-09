package com.instrumentos.app;

public class Campana extends Instrumento{



	@Override
	public void interpretar() {
		for(int i=0;i<super.melodia.length;i++) {
			if (super.melodia[i]==null) {
				
			}else {
				System.out.print(super.melodia[i]+"      ");
			}
			
		}
		
	}
	
	
}
