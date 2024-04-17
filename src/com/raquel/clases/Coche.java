package com.raquel.clases;

import com.raquel.enums.Color;
import com.raquel.enums.TipoTransporte;
import com.raquel.interfaces.Matricula;
import com.raquel.clases.*;

public class Coche extends Vehiculo implements Matricula {

	private final String matricula;
	private final static int numRuedas = 4;
	private final int numPuertas;

	public Coche(int anhoFabricacion, TipoTransporte tipoTransporte, Color color, String matricula, int numPuertas) {
		super(anhoFabricacion, tipoTransporte, color);
		this.matricula = matricula;
		this.numPuertas = numPuertas;
		// TODO Auto-generated constructor stub
	}

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
		System.out.println("El coche se ha parado, el tiempo total de viaje ha sido " + Movimiento.getDistanciaRecorrida() + "km");
		Movimiento.setDistanciaRecorrida(0);
		
	}
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", numPuertas=" + numPuertas + ", anhoFabricacion=" + anhoFabricacion
				+ ", tipoTransporte=" + tipoTransporte + ", color=" + color + "]";
	}

	@Override
	public String generarMatricula() {
		// TODO Auto-generated method stub
		return"";
	}

}
