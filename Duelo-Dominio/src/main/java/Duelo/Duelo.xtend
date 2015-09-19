package Duelo

import org.eclipse.xtend.lib.annotations.Accessors
import TarjetaDeDuelo.TarjetaDeDuelo
import Jugador.Jugador

@Accessors

class Duelo {
	
	
	var TarjetaDeDuelo tarjetaJugador1;
	var TarjetaDeDuelo tarjetaJugador2;
	var TarjetaDeDuelo tarjetaGanador;
	
	new(TarjetaDeDuelo j1, TarjetaDeDuelo j2){
		this.tarjetaJugador1 = j1
		this.tarjetaJugador2 = j2
		this.tarjetaGanador = null
		this.resolverse()
	}
	
	def resolverse() {
		
		var  poderJ1 = tarjetaJugador1.obtenerPoderDeAtaque()
		var  poderJ2 = tarjetaJugador2.obtenerPoderDeAtaque()
		if (poderJ1 > poderJ2){
			this.tarjetaGanador = tarjetaJugador1	
			this.gano(tarjetaJugador1)
			this.perdio(tarjetaJugador2)
		}
		if (poderJ2 > poderJ1){
			this.tarjetaGanador = tarjetaJugador2	
			this.gano(tarjetaJugador2)
			this.perdio(tarjetaJugador1)
		}
		if (this.tarjetaGanador == null){
			this.empate()
		}
	}
	
	
	
	
	def empate() {
		this.tarjetaJugador1.actualizarEmpate(this);
		this.tarjetaJugador2.actualizarEmpate(this);
	}
	
	def perdio(TarjetaDeDuelo duelo) {
		duelo.actualizarDerrota(this);
	}
	
	def gano(TarjetaDeDuelo duelo) {
		duelo.actualizarVictoria(this)
		
	}
	
	def tarjetaDe(Jugador jugador) {
		if(tarjetaJugador1 == jugador){
			return tarjetaJugador1
		}
		else{
			tarjetaJugador2
		}
	}
	
	
	
}