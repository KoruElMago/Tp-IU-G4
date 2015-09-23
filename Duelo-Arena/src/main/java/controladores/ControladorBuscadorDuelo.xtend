package controladores

import org.uqbar.commons.utils.TransactionalAndObservable
import org.eclipse.xtend.lib.annotations.Accessors
import Core.DueloEntreLeyendas
import usuario.Usuario
import TarjetaDeDuelo.TarjetaDeDuelo
import Duelo.Duelo

@Accessors
@TransactionalAndObservable

class ControladorBuscadorDuelo {
	DueloEntreLeyendas del
	 //Usuario usuario
	//List<Linea> lineas
	//List<Personaje> personajes
	//Personaje personajeElegido
	//Linea lineaElegida
	TarjetaDeDuelo tarjetaUsuario
	TarjetaDeDuelo tarjetaRetador
	String textoAMostrar
	
	new(DueloEntreLeyendas del, TarjetaDeDuelo us, TarjetaDeDuelo retador, String text){
		this.del = del
		//this.usuario = us
		tarjetaUsuario = us
		textoAMostrar = text
		tarjetaRetador = retador
		
		
		}
		
		
		
		def aceptarDuelo() {
			var Duelo duelo = new Duelo(tarjetaUsuario, tarjetaRetador)
			return new ControladorDuelo( duelo, del)
		
		/*	
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
	* 
	*/



}
}	
	
	
