package com.raquel.main;

import com.raquel.clases.Camion;
import com.raquel.clases.Coche;
import com.raquel.clases.Vehiculo;
import com.raquel.enums.Color;
import com.raquel.enums.TipoTransporte;

public class Main {

	public static void main(String[] args) {
		Vehiculo c = new Coche(1998, TipoTransporte.AIRE, Color.ROJO, "fd32132", 4);
		System.out.println(c.toString());
		
		c.arrancar();
		c.avanzar(10);
		c.avanzar(20);
		c.avanzar(10);
		
		c.parar();
		
		System.out.println("\n");
		Vehiculo ca = new Camion(1984, TipoTransporte.TIERRA, Color.DORADO);
		System.out.println(ca.toString());
		
		ca.arrancar();
		
		ca.avanzar(10);
		ca.avanzar(30);
		ca.avanzar(10);
		
		ca.parar();
		
		System.out.println(ca.toString());

	
	}
}
