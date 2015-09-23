package controladores

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.TransactionalAndObservable
import TarjetaDeDuelo.TarjetaDeDuelo
import Duelo.Duelo
import TarjetaDeDuelo.Linea

@Accessors
@TransactionalAndObservable

class ControladorDuelo {
	
	TarjetaDeDuelo t1
	TarjetaDeDuelo t2
	
	String personaje1
	String personaje2
	
	Linea linea1
	Linea linea2
	
	String nombre1
	String nombre2
	
	new(Duelo duelo){
		t1 = duelo.tarjetaJugador1
		t2 = duelo.tarjetaJugador2
		
		personaje1 = t1.personaje.nombre
		personaje2 = t2.personaje.nombre
		
		linea1 = t1.linea
		linea2 = t2.linea
		
		nombre1 = t1.jugador.nombreJugador
		nombre2 = t2.jugador.nombreJugador
	}
	
}