package com.raquel.interfaces;

/**
 * Interfaz Conducible en la que declaramos los métodos que determinarán el
 * movimiento según el tipo de vehículo
 * 
 * @author Raquel
 *
 */
public interface Conducible {

	default public void tocarClaxon() {
		System.out.println("Piiiiiipiiiiiii");
	}

	public void arrancar();

	public void avanzar(double tiempo);

	public void parar();
}
