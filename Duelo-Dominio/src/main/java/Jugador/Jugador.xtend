package Jugador

import java.util.List
import java.util.ArrayList
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class Jugador {
	
	String nombreJugador
	int calificacion
	List<Estadisticas> estadisticas
	
	
	new(String nombre){
	this.nombreJugador = nombre
	this.calificacion = 0
	this.estadisticas = new ArrayList<Estadisticas>
	
	}
	
}