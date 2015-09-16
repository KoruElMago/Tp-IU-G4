package Jugador

import java.util.List
import java.util.ArrayList
import org.eclipse.xtend.lib.annotations.Accessors
import Personaje.Personaje

@Accessors
class Jugador {
	
	String nombreJugador
	int calificacion
	List<Estadistica> estadisticas
	
	
	new(String nombre){
	this.nombreJugador = nombre
	this.calificacion = 0
	this.estadisticas = new ArrayList<Estadistica>
	
	}
	
	def obtenerEstadisticas(Personaje personaje) {
			var Estadistica res = null 
			for (Estadistica e : estadisticas){
				if(e.personaje == personaje){
					res = e
				}
			}
			return res
	}
	
}