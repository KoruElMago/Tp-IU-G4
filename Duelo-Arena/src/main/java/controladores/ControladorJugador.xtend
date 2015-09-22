package controladores

import Jugador.Jugador
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.TransactionalAndObservable
import Jugador.Estadisticas
import ventanaEstadisticas.WindowEstadistica
import java.util.List
import java.util.ArrayList

@TransactionalAndObservable
@Accessors
class ControladorJugador {
	Jugador jugador
	//agregado por chibi:
	String nombrePersonaje
	
	new(Jugador jugador){
		this.jugador = jugador
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
	
	def seleccionar() {
		
		return new ControladorEstadisticas(this.getEstadisticaPersonaje)
		
		
		//throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
}