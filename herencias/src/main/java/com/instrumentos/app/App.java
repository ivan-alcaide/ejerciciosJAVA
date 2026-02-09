package com.instrumentos.app;

public class App {

	public static void main(String[] args) {
		Piano p = new Piano();
		Campana c=new Campana();
		p.add(nota.DO);
		p.add(nota.RE);
		p.add(nota.MI);
		
		c.add(nota.FA);
		c.add(nota.SOL);
		c.add(nota.LA);
		
		p.interpretar();
		System.out.println();
		c.interpretar();
		
	}

}
