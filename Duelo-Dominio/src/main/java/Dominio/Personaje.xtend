package Dominio

import org.eclipse.xtend.lib.annotations.Accessors

@Accessors

class Personaje {
	
	String nombre;
	String debidades;
	String especialidades;
	Linea posicionIdeal;
	
	new(String nombre, String debilidades, String especialidades, Linea posicionIdeal){
		this.nombre = nombre;
		this.debidades = debilidades;
		this.especialidades = especialidades;
		this.posicionIdeal = posicionIdeal;
	}
}