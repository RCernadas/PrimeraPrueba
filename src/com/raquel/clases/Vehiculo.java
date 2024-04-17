package com.raquel.clases;

import com.raquel.enums.Color;
import com.raquel.enums.TipoTransporte;
import com.raquel.interfaces.Conducible;

/**
 * Clase padre Vehículo de la que heredaran todos los subtipos de vehículo (desde un coche a un barco o una bicicleta)y que implementa la
 * interfaz conducible para determinar la forma específica en la que cada tipo de vehículo realiza la conducción
 * @author Raquel
 *
 */
public abstract class Vehiculo implements Conducible {
	protected int anhoFabricacion;
	protected TipoTransporte tipoTransporte;
	protected Color color;
	
	public Vehiculo(int anhoFabricacion, TipoTransporte tipoTransporte,Color color) {
		this.anhoFabricacion = anhoFabricacion;
		this.tipoTransporte = tipoTransporte;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehiculo [anhoFabricacion=" + anhoFabricacion + ", tipoTransporte=" + tipoTransporte + ", color="
				+ color + "]";
	}
	
	
}
