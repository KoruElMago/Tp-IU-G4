package controladores

import usuario.Usuario
import Jugador.Estadisticas
import Personaje.Personaje
import java.util.List
import Core.DueloEntreLeyendas
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.TransactionalAndObservable
import java.util.ArrayList
import TarjetaDeDuelo.Linea

@Accessors
@TransactionalAndObservable

class ControladorUsuario {
	
	DueloEntreLeyendas del
	Usuario usuario
	List<Personaje> personajesDelJuego
	
	
	Personaje unPersonajeDelJuego
	String nombrePersonaje;
	Linea rolIdeal;
	List<String> debilidades;
	List<String> fortalezas;
	
	
	new(Usuario usuario, DueloEntreLeyendas d){
		this.del = d
		this.usuario = usuario
		this.personajesDelJuego = d.getPersonajes()
	}
	
	def setNombrePersonaje(String s){
		this.nombrePersonaje = s
		this.actualizar(s)
	}
	
	def actualizar(String s) {
		for(Personaje p : personajesDelJuego)
			{
				if(p.getNombre() == s )
					{
					unPersonajeDelJuego = p
					rolIdeal = p.rolIdeal
					debilidades = p.getDebilidades()
					fortalezas = p.getFortalezas()
					}
			}
	}
	
	
	override toString(){
		return usuario.jugador.nombreJugador
		
		}
	
	def abrirSeleccionEstadistica() {
		new ControladorEstadisticas(usuario.jugador)
	}
	
	
	def getRolIdeal(){
		
	}
	
	def abrirPersonajes() {
		new ControladorPersonaje(personajesDelJuego)
	}
	
	def buscarDuelo() {
		new ControladorTarjetaDuelo(this.del, this.usuario)
	}
	
	
	//adds
	
	
	
}