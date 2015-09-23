package Jugador

import java.util.List
import java.util.ArrayList
import org.eclipse.xtend.lib.annotations.Accessors
import Personaje.Personaje
import TarjetaDeDuelo.TarjetaDeDuelo
import Duelo.Duelo
import Denuncia.Denuncia

@Accessors
class Jugador {
	
	String nombreJugador
	int calificacion
	List<Estadisticas> estadisticas
	List<Denuncia> denuncias
	
	
	new(String nombre){
	this.nombreJugador = nombre
	this.calificacion = 0
	this.estadisticas = new ArrayList<Estadisticas>
	
	}
	
	
	//Se asume que siempre habrá estadisticas, incluso si es 0
	def obtenerEstadisticas(Personaje personaje) {
			//var Estadisticas res = null 
			for (Estadisticas e : estadisticas){
				if(e.personaje == personaje){
					return e
				}
			}
	}
	
	def derrota(Duelo duelo) {
		
		//var Estadisticas eAux = null
		var personaje = duelo.tarjetaDe(this).personaje
		
		for (Estadisticas e1 : this.estadisticas){
			
		if	(e1.personaje == personaje){
			e1.deads = e1.deads+1	
			e1.vecesQueInicio = e1.vecesQueInicio+1 
			}
 		}
	}
	
	def victoria(Duelo duelo) {

		//var Estadisticas eAux = null
		var personaje = duelo.tarjetaDe(this).personaje
		
		for (Estadisticas e1 : this.estadisticas){
			
		if	(e1.personaje == personaje){
			e1.kills = e1.kills+1
			e1.vecesQueInicio = e1.vecesQueInicio+1
			}
 		}		
	}
	
	def empate(Duelo duelo) {
		
		//var Estadisticas eAux = null
		var personaje = duelo.tarjetaDe(this).personaje
		
		for (Estadisticas e1 : this.estadisticas){
			
		if	(e1.personaje == personaje){
			e1.assists = e1.assists+1
			e1.vecesQueInicio = e1.vecesQueInicio+1
			}
 		}
		
		}
		
	
	
}