package controladores

import TarjetaDeDuelo.Linea
import java.util.List
import Personaje.Personaje
import java.util.ArrayList
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.TransactionalAndObservable
import Jugador.Estadisticas

@Accessors
@TransactionalAndObservable

class ControladorEstadisticas {	
	
	
	Estadisticas estadisticas
	
	new(Estadisticas estadisticas)
	{
		this.estadisticas = estadisticas
	}
	
	/*
		this.personaje = personaje
		this.vecesQueInicio = 1
		this.kills = 2
		this.deads = 3
		this.assist = 4
		this.victorias = 5
		this.mejorLinea = Linea.Top
		this.ubicaciones = new ArrayList<Linea>()
		this.ubicaciones.add(Linea.Top);
		this.ubicaciones.add(Linea.Bottom);
		this.calificacionEnDuelo = 5
	 */
	def Personaje getPersonaje(){
		return this.estadisticas.personaje
	}
	
	def String getNombre(){
		return this.estadisticas.personaje.nombre
	}
	
	def Integer getVecesQueInicio(){
		return this.estadisticas.vecesQueInicio
	}
	
	def Integer getKills(){
		return this.estadisticas.kills
	}
	
	def Integer getDeads(){
		return this.estadisticas.deads
	}
	
	def Integer getAssist(){
		return this.estadisticas.assists
	}
	
	def Integer getVictorias(){
		return this.estadisticas.victorias
	}
	
	def Linea getMejorLinea(){
		return this.estadisticas.mejorLinea
	}
	
	def List<Linea> getUbicaciones(){
		return this.estadisticas.ubicaciones
	}
	
	def Integer getCalificacionEnDuelo(){
		return this.estadisticas.calificacionEnDuelo
	}
	
	
}
