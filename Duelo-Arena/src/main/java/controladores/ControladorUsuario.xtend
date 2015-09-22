package controladores

import usuario.Usuario

class ControladorUsuario {
	
	Usuario usuario
	
	new(Usuario usuario){
		this.usuario = usuario
	}
	
	override toString(){
		return usuario.jugador.nombreJugador
		
		}
}