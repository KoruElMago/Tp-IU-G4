package Jugador

import java.util.List
import java.util.ArrayList
import org.eclipse.xtend.lib.annotations.Accessors
import Personaje.Personaje
import TarjetaDeDuelo.TarjetaDeDuelo
import Duelo.Duelo

@Accessors
class Jugador {
	
	String nombreJugador
	int calificacion
	List<Estadisticas> estadisticas
	
	
	new(String nombre){
	this.nombreJugador = nombre
	this.calificacion = 0
	this.estadisticas = new ArrayList<Estadisticas>
	
	}
	
	def obtenerEstadisticas(Personaje personaje) {
			var Estadisticas res = null 
			for (Estadisticas e : estadisticas){
				if(e.personaje == personaje){
					res = e
				}
			}
			return res
	}
	
	def derrota(Duelo duelo) {
		
		var Estadisticas eAux = null
		var personaje = duelo.tarjetaDe(this).personaje
		
		for (Estadisticas e1 : this.estadisticas){
			
		if	(e1.personaje == personaje){
			
			eAux = e1
			
			}
 		}

		if (eAux == null){
			
			eAux = new Estadisticas(personaje)
			
		}
	
		eAux.gano(duelo,this);
	}
	
	def victoria(Duelo duelo) {

		var Estadisticas eAux = null
		var personaje = duelo.tarjetaDe(this).personaje
		
		for (Estadisticas e1 : this.estadisticas){
			
		if	(e1.personaje == personaje){
			
			eAux = e1
			
			}
 		}

		if (eAux == null){
			
			eAux = new Estadisticas(personaje)
			
		}
	
		eAux.perdio(duelo,this)
		
	}
	
	def empate(Duelo duelo) {
		
		var Estadisticas eAux = null
		var personaje = duelo.tarjetaDe(this).personaje
		
		for (Estadisticas e1 : this.estadisticas){
			
		if	(e1.personaje == personaje){
			
			eAux = e1
			
			}
 		}

		if (eAux == null){
			
			eAux = new Estadisticas(personaje)
			
		}
		eAux.empato(duelo,this)
		
		}
		
	
	
}