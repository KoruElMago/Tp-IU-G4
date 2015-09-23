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
		//this.resolverse()
	}
	
	def resolverse() {
		
		var  double suerteJ1 = Math.random()
		var  double suerteJ2 = Math.random()
		
		var  double poderJ1 = tarjetaJugador1.obtenerPoderDeAtaque()
		var  double poderJ2 = tarjetaJugador2.obtenerPoderDeAtaque()
		
		actualizarPuntaje(tarjetaJugador1, poderJ1*suerteJ1 )
		actualizarPuntaje(tarjetaJugador2, poderJ2*suerteJ2 )
		
		if (poderJ1*suerteJ1 > poderJ2*suerteJ2){
			this.tarjetaGanador = tarjetaJugador1	
			this.gano(tarjetaJugador1)
			this.perdio(tarjetaJugador2)
		}
		if (poderJ2*suerteJ2 > poderJ1*suerteJ1){
			this.tarjetaGanador = tarjetaJugador2	
			this.gano(tarjetaJugador2)
			this.perdio(tarjetaJugador1)
		}
		else
		//if (this.tarjetaGanador == null){
			this.empate()
		}
	//}
	
	def void actualizarPuntaje(TarjetaDeDuelo t, double d){
		val p = t.personaje
		t.jugador.obtenerEstadisticas(p).calificacionEnDuelo = d
		
		
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
		if(tarjetaJugador1.jugador == jugador){
			return tarjetaJugador1
		}
		else{
			tarjetaJugador2
		}
	}
	
	
	
}