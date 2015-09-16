package TarjetaDeDuelo

import Jugador.Jugador
import Personaje.Personaje
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors

class TarjetaDeDuelo {
	
	var String linea
	var Personaje personaje
	var Jugador   jugador
	
	def esRivalDigno(TarjetaDeDuelo duelo) {
		return ((duelo.jugador.calificacion -100) < jugador.calificacion && 
			    jugador.calificacion < (duelo.jugador.calificacion+100))
		
	}
	
	def obtenerPoderDeAtaque() {
		var estadisticas = jugador.obtenerEstadisticas(personaje)
		return (jugador.calificacion + ((estadisticas.kills + estadisticas.assists) / 2  - estadisticas.deads) 
		       * estadisticas.vecesQueInicio)
	}
	
	def actualizarVictoria() {
		this.jugador.victoria(this.personaje)
	}
	
	def actualizarDerrota() {
		this.jugador.derrota(this.personaje)
	}
	
	def actulizarEmpate() {
		this.jugador.empate(this.personaje)
	}
	
	
	
	}