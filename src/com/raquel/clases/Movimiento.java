package com.raquel.clases;

public class Movimiento {
	
	private final double velocidad = (int) (Math.random()*100 + 1);
	private static double distanciaRecorrida = 0;
	private static double tiempo; //son 10 minutos
	
	public Movimiento(double tiempo) {
		this.tiempo = tiempo / 100; //tiempo en minutos
		this.distanciaRecorrida += calcularDistanciaRecorrida();
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
	
	public double calcularDistanciaRecorrida() {
		return Math.round((getVelocidad() * getTiempo()) * 100.0)/ 100.0;
	}

	@Override
	public String toString() {
		return "Avanzando " + getTiempo()*100 + " minutos a una velocidad media de " + getVelocidad() + "km/h, la distancia total recorrida es de " + getDistanciaRecorrida() + "km";
	}
	
	
}
