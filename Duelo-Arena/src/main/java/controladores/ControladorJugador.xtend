package controladores

import Jugador.Jugador
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.TransactionalAndObservable

@TransactionalAndObservable
@Accessors
class ControladorJugador {
	Jugador jugador
	new(Jugador jugador){
		this.jugador = jugador
	}
	
	def getNombreJugador(){
		jugador.nombreJugador
	}
}