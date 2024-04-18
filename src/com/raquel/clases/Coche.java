package com.raquel.clases;

import com.raquel.enums.Color;
import com.raquel.enums.TipoTransporte;
import com.raquel.interfaces.Matricula;

/**
 * Clase Coche que extiende de vehículo como subtipo de éste (hereda la interfaz
 * Conducible e implementa la interfaz Matricula al tratarse de un vehículo con
 * matrícula)
 * 
 * @author Raquel
 *
 */
public class Coche extends Vehiculo implements Matricula {

	private final String matricula;
	private final static int numRuedas = 4;
	private final int numPuertas;

	public Coche(int anhoFabricacion, TipoTransporte tipoTransporte, Color color, int numPuertas) {
		super(anhoFabricacion, tipoTransporte, color);
		this.matricula = generarMatricula();
		this.numPuertas = numPuertas;
	}

	/**
	 * Métodos sobreescritos de la interfaz Conducible
	 */
	@Override
	public void arrancar() {
		System.out.println("Arrancando el motor del coche. La distancia recorrida hata ahora es de "
				+ Movimiento.getDistanciaRecorrida());
	}

	@Override
	public void avanzar(double tiempo) {
		Movimiento m = new Movimiento(tiempo);
		System.out.println(m.toString());
	}

	@Override
	public void parar() {
		System.out.println(
				"El coche se ha parado, el tiempo total de viaje ha sido " + Movimiento.getDistanciaRecorrida() + "km");
		Movimiento.setDistanciaRecorrida(0);

	}

	/**
	 * Implementación del único método de la interfaz Matricula que genera matrículas siguiendo la convención española
	 */

	@Override
	public String generarMatricula() {
		String matricula = "";

		for (int i = 1; i <= 7; i++) {
			if (i <= 4) {
				matricula += Integer.toString((int) (Math.random() * 10));
			} else {
				matricula += (String.valueOf((char) (Math.random() * 26 + 65)));
			}
		}
		return matricula;
	}

	/**
	 * Getters
	 * @return
	 */

	public static int getNumruedas() {
		return numRuedas;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", numPuertas=" + numPuertas + ", tipoTransporte=" + tipoTransporte
				+ ", color=" + color + ", anhoFabricacion=" + anhoFabricacion + "]";
	}
}
