package com.raquel.interfaces;

public interface Conducible {
	
	default void tocarClaxon() {
		System.out.println("Tocando el claxon...");
	}
	
	public void arrancar();
	public void avanzar(double tiempo);
	public void parar();
}
