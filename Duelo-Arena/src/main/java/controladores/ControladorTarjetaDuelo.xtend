package controladores

import Jugador.Jugador
import Personaje.Personaje
import TarjetaDeDuelo.Linea
import java.util.List
import Core.DueloEntreLeyendas
import usuario.Usuario
import java.util.ArrayList
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.TransactionalAndObservable
import TarjetaDeDuelo.TarjetaDeDuelo
import Duelo.Duelo

@Accessors
@TransactionalAndObservable

class ControladorTarjetaDuelo {
	
	Usuario usuario
	
	DueloEntreLeyendas del
	List<Linea> lineas
	List<Personaje> personajes
	Personaje personajeElegido
	Linea lineaElegida
	
	new(DueloEntreLeyendas del, Usuario us){
		this.del = del
		this.usuario = us
		personajes = del.personajes
		lineas = new ArrayList
		lineas.add(Linea.Bottom)
		lineas.add(Linea.Top)
		lineas.add(Linea.Mid)
		lineas.add(Linea.Jungle)
		
	}
	
	def buscarDuelo() {
		var tarjeta = new TarjetaDeDuelo(personajeElegido, usuario.jugador, lineaElegida)
		//del.entrarEnCola(duelo)
		var rival = del.buscarRivalDigno(tarjeta)
		if(rival.equals(del.tddBoot) || rival.equals(null))
			{
			return crearDueloConBot(tarjeta,rival)				
			}
			else
			{
			return crearDueloNormal(tarjeta, rival)	
			}
		
	}
	
	def crearDueloNormal(TarjetaDeDuelo usuario, TarjetaDeDuelo retador) {
		return (new ControladorDuelo(new Duelo(usuario, retador)))
	}
	
	def crearDueloConBot(TarjetaDeDuelo usuario, TarjetaDeDuelo retador) {
		//throw new UnsupportedOperationException("TODO: auto-generated method stub")
		return (new ControladorDuelo(new Duelo(usuario, retador)))
	}
	
	
	
}