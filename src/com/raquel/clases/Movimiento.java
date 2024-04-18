package com.raquel.clases;

/**
 * En esta clae definimos los atributos y cálculos necesarios para determinar el
 * tiempo, la velocidad y la distanica recorrida que hace un vehículo cuando
 * avanza
 * 
 * @author Raquel
 *
 */
public class Movimiento {

	private final double velocidad = (int) (Math.random() * 100 + 1);
	private static double distanciaRecorrida = 0;
	private static double tiempo;

	public Movimiento(double tiempo) {
		Movimiento.tiempo = tiempo / 100; // tiempo en minutos
		Movimiento.distanciaRecorrida += calcularDistanciaRecorrida();
	}

	public double getVelocidad() {
		return velocidad;
	}

	public static void setDistanciaRecorrida(double distanciaRecorrida) {
		Movimiento.distanciaRecorrida = distanciaRecorrida;
	}

	public static double getDistanciaRecorrida() {
		return distanciaRecorrida;
	}

	public static double getTiempo() {
		return tiempo;
	}

	/**
	 * Método que calcula la distancia recorrida en función de la velocidad y el
	 * tiempo que se ha avanzado
	 * 
	 * @return
	 */
	public double calcularDistanciaRecorrida() {
		return Math.round((getVelocidad() * getTiempo()));
	}

	@Override
	public String toString() {
		return "Avanzando " + getTiempo() * 100 + " minutos a una velocidad media de " + getVelocidad()
				+ "km/h, la distancia total recorrida es de " + getDistanciaRecorrida() + "km";
	}

}
