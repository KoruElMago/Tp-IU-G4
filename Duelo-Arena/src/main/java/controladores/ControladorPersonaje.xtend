package controladores

import TarjetaDeDuelo.Linea
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.TransactionalAndObservable
import Personaje.Personaje

@Accessors
@TransactionalAndObservable

class ControladorPersonaje {
	
	
	List<Personaje> personajes
	Personaje unPersonaje
	
	String nombre;
	Linea rolIdeal;
	List<String> debilidades;
	List<String> fortalezas;
	

	new(List<Personaje> personajes){
		this.personajes = personajes
	}
	
	def void setUnPersonaje(Personaje p){
		unPersonaje = p
		this.actualizar()
	}
	
	def actualizar()
	{
		nombre = unPersonaje.nombre
		rolIdeal = unPersonaje.rolIdeal
		fortalezas = unPersonaje.fortalezas
		debilidades = unPersonaje.debilidades
		
	}
	
}