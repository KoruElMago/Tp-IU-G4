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
import java.util.Random

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
		if(rival.equals(null))
			{
			return crearDueloConBot(del, tarjeta)				
			}
			else
			{
			return crearDueloNormal(del, tarjeta, rival)
			}
		
	}
	
	def crearDueloNormal(DueloEntreLeyendas del, TarjetaDeDuelo usuario, TarjetaDeDuelo retador) {
		//return (new ControladorDuelo(new Duelo(usuario, retador), del) )
		var text = "Se ha encontrado Rival" 
		return (new ControladorBuscadorDuelo(del, usuario, retador, text))
	}
	
	def crearDueloConBot(DueloEntreLeyendas del, TarjetaDeDuelo usuario) {
		var text = "No se ha encontrado rival que te haga frente.
					¿Deseas jugar contra bot MR-X de todas maneras?" 
		//throw new UnsupportedOperationException("TODO: auto-generated method stub")
		
		var  bot = new TarjetaDeDuelo(personajeAlAzar(del.personajes), del.bot.jugador, usuario.linea)
		
		return (new ControladorBuscadorDuelo(del, usuario, bot, text))
	}
	
	
	def personajeAlAzar(List<Personaje> personajes){
		var int seleccion = new Random().nextInt(personajes.length)
		return personajes.get(seleccion)
		
		 
	}
	
	
}