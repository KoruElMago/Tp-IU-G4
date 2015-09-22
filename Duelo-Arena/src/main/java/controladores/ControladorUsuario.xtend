package controladores

import usuario.Usuario
import Jugador.Estadisticas

class ControladorUsuario {
	
	Usuario usuario
	
	
	
	new(Usuario usuario){
		this.usuario = usuario
	}
	
	override toString(){
		return usuario.jugador.nombreJugador
		
		}
	
	def abrirSeleccionEstadistica() {
		new ControladorEstadisticas(usuario.jugador)
	}
	
	
	
	//adds
	
	
	
}