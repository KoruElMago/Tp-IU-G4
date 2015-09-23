package Jugador

import Duelo.Duelo
import Personaje.Personaje
import TarjetaDeDuelo.Linea
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors

class Estadisticas {
	
	Personaje personaje
	int vecesQueInicio
	int kills
	int deads
	int assists
	int victorias
	Linea mejorLinea
	List<Linea> ubicaciones
	double calificacionEnDuelo
	
	
	new(Personaje personaje) {
		this.personaje = personaje
		this.kills = 0
		this.deads = 0
		this.assists = 0
		this.vecesQueInicio = 0
		this.victorias = 0
		this.mejorLinea = Linea.Bottom
	}
	
	def empato(Duelo duelo,Jugador jug) {
		this.assists ++
		this.ubicaciones.add(duelo.tarjetaDe(jug).linea)
		this.calificacionEnDuelo = duelo.tarjetaDe(jug).obtenerPoderDeAtaque as Integer
		
		if (duelo.tarjetaJugador1.jugador == jug){
		this.vecesQueInicio ++	
		}
	}
	
	
	
	def gano(Duelo duelo,Jugador jug) {
		this.victorias ++
		this.ubicaciones.add(duelo.tarjetaDe(jug).linea)
		this.calificacionEnDuelo = duelo.tarjetaDe(jug).obtenerPoderDeAtaque as Integer
		
		if (duelo.tarjetaJugador1.jugador == jug){
			this.vecesQueInicio ++	
			this.mejorLinea = duelo.tarjetaDe(jug).linea
		}
		else{
			this.kills ++
		}		
	}
	
	def perdio(Duelo duelo, Jugador jug) {
		this.ubicaciones.add(duelo.tarjetaDe(jug).linea)
		this.calificacionEnDuelo = duelo.tarjetaDe(jug).obtenerPoderDeAtaque as Integer
		
		if (duelo.tarjetaJugador1.jugador == jug){
			this.vecesQueInicio ++	
  		}
  		else{
  			this.deads ++
  		}
  	}
}