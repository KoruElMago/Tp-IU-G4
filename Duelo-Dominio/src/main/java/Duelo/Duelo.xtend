package Duelo

import org.eclipse.xtend.lib.annotations.Accessors
import TarjetaDeDuelo.TarjetaDeDuelo

@Accessors

class Duelo {
	
	
	var TarjetaDeDuelo jugador1;
	var TarjetaDeDuelo jugador2;
	
	new(TarjetaDeDuelo j1, TarjetaDeDuelo j2){
		this.jugador1 = j1;
		this.jugador2 = j2;
		this.resolverse()
	}
	
	def resolverse() {
		var poderJ1 = jugador1.obtenerPoderDeAtaque()
		var poderJ2 = jugador2.obtenerPoderDeATaque()
	}
	
}