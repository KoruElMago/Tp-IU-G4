package TarjetaDeDuelo

import Jugador.Jugador
import Personaje.Personaje
import org.eclipse.xtend.lib.annotations.Accessors
import Duelo.Duelo

@Accessors

class TarjetaDeDuelo {
	
	var Linea linea
	var Personaje personaje
	var Jugador jugador
	
	new(Personaje personaje, Jugador jugador, Linea linea){
		this.linea = linea
		this.personaje = personaje
		this.jugador = jugador
	}
	
	def esRivalDigno(TarjetaDeDuelo duelo) {
		return ((duelo.jugador.calificacion -100) < jugador.calificacion && 
			    jugador.calificacion < (duelo.jugador.calificacion+100))
		
	}
	
	def Integer obtenerPoderDeAtaque() {
		var estadisticas = jugador.obtenerEstadisticas(personaje)
		return (jugador.calificacion + (((estadisticas.kills + estadisticas.assists) / 2)  - estadisticas.deads) 
		       * estadisticas.vecesQueInicio) 
	}
	
	def actualizarVictoria(Duelo duelo) {
				this.jugador.victoria(duelo)
	}
	
	def actualizarDerrota(Duelo duelo) {
		this.jugador.derrota(duelo)
	}
	
	def actualizarEmpate(Duelo duelo) {
		
		this.jugador.empate(duelo)
	}
	
	
	
	}