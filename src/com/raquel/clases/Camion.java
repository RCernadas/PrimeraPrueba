package com.raquel.clases;

import java.util.ArrayList;

import java.util.List;

import com.raquel.enums.Color;
import com.raquel.enums.TipoTransporte;
import com.raquel.interfaces.Matricula;

/**
 * Clase Camion que extiende de vehículo como subtipo de éste (hereda la
 * interfaz Conducible e implementa la interfaz Matricula al tratarse de un
 * vehículo con matrícula)
 * 
 * @author Raquel
 *
 */
public class Camion extends Vehiculo implements Matricula {
	private final String matricula;
	private List<Double> velocidadesTacometro = new ArrayList<>();

	public Camion(int anhoFabricacion, TipoTransporte tipoTransporte, Color color) {
		super(anhoFabricacion, tipoTransporte, color);
		this.matricula = generarMatricula();
	}

	/**
	 * Implementación de lo métodos de la interfaz Conducible
	 */
	@Override
	public void arrancar() {
		System.out.println("Arrancando el motor del camión. La distancia recorrida hata ahora es de "
				+ Movimiento.getDistanciaRecorrida() + " Km/h");

	}

	@Override
	public void avanzar(double tiempo) {
		Movimiento m = new Movimiento(tiempo);
		System.out.println(m.toString());
		velocidadesTacometro.add(m.getVelocidad());

	}

	@Override
	public void parar() {
		System.out.println("El camión se ha parado, el tiempo total de viaje ha sido "
				+ Movimiento.getDistanciaRecorrida() + "km");
		Movimiento.setDistanciaRecorrida(0);
		imprimirVelocidadesRecorrido(velocidadesTacometro);

	}

	/**
	 *  Implementación del único método de la interfaz Matricula que genera matrículas siguiendo la convención española
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
	 * Método al que le pasamos una lista de las velocidades del Tacómetro
	 * registradas durante el trayecto de un camión y las imprimimos por consola
	 * 
	 * @param velocidadesTacometro
	 */
	public static void imprimirVelocidadesRecorrido(List<Double> velocidadesTacometro) {
		System.out.println("Estas son las velocidades registradas por el tacómetro del camión durante el recorrido: ");
		for (Double velocidad : velocidadesTacometro) {
			System.out.println(velocidad.toString() + "Km/h");
		}
	}

	public String getMatricula() {
		return matricula;
	}

	public List<Double> getVelocidadesTacometro() {
		return velocidadesTacometro;
	}

	public void setVelocidadesTacometro(List<Double> velocidadesTacometro) {
		this.velocidadesTacometro = velocidadesTacometro;
	}

	@Override
	public String toString() {
		return "Camion [matricula=" + matricula + ", velocidadesTacometro=" + velocidadesTacometro
				+ ", anhoFabricacion=" + anhoFabricacion + ", tipoTransporte=" + tipoTransporte + ", color=" + color
				+ "]";
	}

}
