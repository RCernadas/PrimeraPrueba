package com.raquel.main;

import com.raquel.clases.Camion;
import com.raquel.clases.Coche;
import com.raquel.clases.Vehiculo;
import com.raquel.enums.Color;
import com.raquel.enums.TipoTransporte;

/**
 * Clase Main con nuestro método main en donde están nuestras instancias de
 * coches y de camiones y hacen reccorridos;
 * 
 * @author Raquel
 *
 */
public class Main {

	public static void main(String[] args) {
		Vehiculo coche = new Coche(1998, TipoTransporte.AIRE, Color.ROJO, 4);
		System.out.println(coche.toString());

		coche.arrancar();
		
		coche.avanzar(10);
		coche.avanzar(20);
		coche.avanzar(10);

		coche.parar();
		System.out.println("\n");
		
		Vehiculo camion = new Camion(1984, TipoTransporte.TIERRA, Color.DORADO);
		System.out.println(camion.toString());
		
		camion.arrancar();

		camion.avanzar(10);
		camion.tocarClaxon();
		camion.avanzar(30);
		camion.avanzar(10);

		camion.parar();
		
		System.out.println(camion.toString());

	}
}
