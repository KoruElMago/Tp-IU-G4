package controladores

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.TransactionalAndObservable
import TarjetaDeDuelo.TarjetaDeDuelo
import Duelo.Duelo
import TarjetaDeDuelo.Linea
import Core.DueloEntreLeyendas

@Accessors
@TransactionalAndObservable

class ControladorDuelo {
	DueloEntreLeyendas del
	Duelo duelo
	
	TarjetaDeDuelo t1
	TarjetaDeDuelo t2
	
	String personaje1
	String personaje2
	
	Linea linea1
	Linea linea2
	
	String nombre1
	String nombre2
	
	Integer puntaje1
	Integer puntaje2
	
	String nombreGanador
	
	new(Duelo duelo, DueloEntreLeyendas del){
		this.duelo = duelo
		this.del = del
		t1 = duelo.tarjetaJugador1
		t2 = duelo.tarjetaJugador2
		
		personaje1 = t1.personaje.nombre
		personaje2 = t2.personaje.nombre
		
		linea1 = t1.linea
		linea2 = t2.linea
		
		nombre1 = t1.jugador.nombreJugador
		nombre2 = t2.jugador.nombreJugador
	}
	
	def comenzarDuelo(){
		duelo.resolverse()
		puntaje1 = t1.jugador.calificacion
		puntaje2 = t2.jugador.calificacion
		
		if(puntaje1 == puntaje2)
		nombreGanador = "Es empate"
		else
		nombreGanador = duelo.tarjetaGanador.jugador.nombreJugador
		
	}
	
	def comenzarDenuncia() {
		//throw new UnsupportedOperationException("TODO: auto-generated method stub")
		new ControladorDenuncia(del, t1.jugador, t2.jugador)
	}
	
	
	
}