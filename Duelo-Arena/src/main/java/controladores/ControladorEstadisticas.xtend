package controladores

import TarjetaDeDuelo.Linea
import java.util.List
import Personaje.Personaje
import java.util.ArrayList
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.TransactionalAndObservable
import Jugador.Estadisticas
import Jugador.Jugador

@Accessors
@TransactionalAndObservable

class ControladorEstadisticas {	
	
	//de control de jugador
	Jugador jugador
	
	String nombrePersonaje
	
	Estadisticas estadisticaSeleccionada
	
		Integer vecesQueInicio
		Integer kills
		Integer deads
		Integer assist
		Integer victorias
		Linea mejorLinea
		List<Linea> ubicaciones = new ArrayList<Linea>()
		//ubicaciones.add(Linea.Top);
		//this.ubicaciones.add(Linea.Bottom);
		Integer calificacionEnDuelo
	
	new(Jugador jugador)
	{
		//this.estadisticas = estadisticas
		this.jugador = jugador;
	}
	
	
	
	
	def getNombreJugador(){
		jugador.nombreJugador
	}
	
	def getNombreEstadisticas(){
		//jugador.estadisticas
		val nombres = new ArrayList<String>()
		for(Estadisticas es : jugador.estadisticas)
			{
				nombres.add(es.personaje.nombre)
			}
			return nombres
	}
	
	def getEstadisticas(){
		jugador.estadisticas
	}
	
	
	
	//Agregado por chibi:
	def getEstadisticaPersonaje()
	  {
	var Estadisticas est = null
	for(Estadisticas s : this.getEstadisticas())
				{
				if(s.personaje.nombre == this.nombrePersonaje)
					{
					est = s
					}
					
		//new ControladorEstadisticas(s).start
		}
		return est
		//new WindowEstadistica(new ControladorEstadisticas(est)).startApplication
	}
	
	def actualizar(Estadisticas estadisticas) {
		vecesQueInicio = estadisticas.vecesQueInicio
		kills = estadisticas.kills 
		deads = estadisticas.deads
		assist = estadisticas.assists
		victorias =estadisticas.victorias 
		 mejorLinea = estadisticas.mejorLinea
		ubicaciones = estadisticas.ubicaciones 
		//ubicaciones.add(Linea.Top);
		//this.ubicaciones.add(Linea.Bottom);
		calificacionEnDuelo = estadisticas.calificacionEnDuelo 
	}
	
	def seleccionar() {
		
		//return new ControladorEstadisticas(this.getEstadisticaPersonaje)
		
		
		//throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	def abrirEstadistica() {
		for(Estadisticas est : jugador.estadisticas)
			{
				if(est.personaje.nombre == nombrePersonaje)
					{
					actualizar(est)
					this.setEstadisticaSeleccionada(est)
					}
			}
		//throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	def void setNombrePersonaje(String nombrePersonaje){
		this.nombrePersonaje = nombrePersonaje
		this.abrirEstadistica()
	}
	
	
}
