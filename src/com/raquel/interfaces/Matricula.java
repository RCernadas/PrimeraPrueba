package com.raquel.interfaces;

/**
 * No todos los vehículos tienen porqué tener una matricula, ya que por ejemplo
 * los patienes electricos o bicicletas no las tienen. Sin embargo, si es el
 * caso de la mayoría de vehículos, por lo que crearemos una interfaz de un solo
 * método que implemente la generación de matrículas válida para los subtipos de
 * vehículos que lleven matrículas.
 * 
 * @author Raquel
 *
 */
public interface Matricula {

	public String generarMatricula();
}
