package Jugador

import java.util.List
import java.util.ArrayList

class Jugador {
	
	String nombreJugador
	int calificacion
	List<Estadistica> estadisticas
	
	
	new(String nombre){
	this.nombreJugador = nombre
	this.calificacion = 0
	this.estadisticas = new ArrayList<Estadistica>
	
	}
	
}