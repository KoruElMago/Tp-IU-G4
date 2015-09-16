package TarjetaDeDuelo

import Personaje.Personaje
import Jugador.Jugador
import org.eclipse.xtend.lib.annotations.Accessors
import Jugador.Estadistica

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
	
	
	
	}