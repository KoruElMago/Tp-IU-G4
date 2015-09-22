package usuario

import org.eclipse.xtend.lib.annotations.Accessors
import Jugador.Jugador

@Accessors



class Usuario {
	String nombre
	String contraseña
	Jugador jugador
	
	new(String nombre, String contraseña){
		this.nombre  = nombre
		this.contraseña = contraseña
		this.jugador = new Jugador(nombre)
	}
		
}