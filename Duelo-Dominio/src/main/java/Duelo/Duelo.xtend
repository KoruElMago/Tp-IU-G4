package Duelo

import org.eclipse.xtend.lib.annotations.Accessors
import TarjetaDeDuelo.TarjetaDeDuelo

@Accessors

class Duelo {
	
	
	var TarjetaDeDuelo jugador1;
	var TarjetaDeDuelo jugador2;
	var TarjetaDeDuelo ganador;
	
	new(TarjetaDeDuelo j1, TarjetaDeDuelo j2){
		this.jugador1 = j1
		this.jugador2 = j2
		this.ganador = null
		this.resolverse()
	}
	
	def resolverse() {
		
		var poderJ1 = jugador1.obtenerPoderDeAtaque()
		var poderJ2 = jugador2.obtenerPoderDeAtaque()
		if (poderJ1 > poderJ2){
			this.ganador = jugador1	
			this.gano(jugador1)
			this.perdio(jugador2)
		}
		if (poderJ2 > poderJ1){
			this.ganador = jugador2	
			this.gano(jugador2)
			this.perdio(jugador1)
		}
		if (this.ganador == null){
			this.empate()
		}
	}
	
	def empate() {
		
	}
	
	def perdio(TarjetaDeDuelo duelo) {
		
	}
	
	def gano(TarjetaDeDuelo duelo) {
		
	}
	
	
	
}