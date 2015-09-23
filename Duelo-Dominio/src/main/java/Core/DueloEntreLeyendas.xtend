package Core

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List
import TarjetaDeDuelo.TarjetaDeDuelo
import Exepcion.DueloEnEspera
import Duelo.Duelo
import java.util.ArrayList
import Personaje.Personaje
import usuario.Usuario
import Jugador.Estadisticas
import Exepcion.ContraseñaIncorrectaException
import Exepcion.UsuarioExisteException
import Exepcion.UsuarioNoExisteException
import Jugador.Jugador

@Accessors

class DueloEntreLeyendas {
	
	List<Personaje> personajes
	List<TarjetaDeDuelo> buscadores
	//TarjetaDeDuelo tddBoot
	Usuario bot
	//agregado por chibi:
	List<Usuario> usuarios; 
	
	new(TarjetaDeDuelo tddBoot){
		this.buscadores = new ArrayList
		//this.tddBoot = tddBoot
		this.personajes = new ArrayList
		this.usuarios = new ArrayList
		
		var Jugadorbot = new Usuario("TX-M", "")
		
		
		
		
	}
	
	new(){
		this.buscadores = new ArrayList
		//this.tddBoot = tddBoot
		this.personajes = new ArrayList
		this.usuarios = new ArrayList
	}
	
	def buscarDuelo(TarjetaDeDuelo tdd){
		
		var rival = this.buscarRivalDigno(tdd)
		if(rival == tdd){
			throw new DueloEnEspera
		}
		else{
			return new Duelo(tdd,rival)
		}
	}
	
	def buscarRivalDigno(TarjetaDeDuelo duelo) {
		var rival = duelo 
		for(TarjetaDeDuelo posibleRival : buscadores){
			if(duelo.esRivalDigno(posibleRival) && duelo != posibleRival){
				return posibleRival
			}
		}
		//return tddBoot
		return tarjetaTDDBoot(duelo)
	}
	
	def tarjetaTDDBoot(TarjetaDeDuelo duelo) {
		//Crea una opcion de personaje random y la misma linea que el retador
				return duelo
		//throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	def entrarEnCola(TarjetaDeDuelo tdd){
		this.buscadores.add(tdd)
	}
	
	def salirDeLaCola(TarjetaDeDuelo tdd){
		this.buscadores.remove(tdd)
	}
	
	//def dueloConBoot(TarjetaDeDuelo tdd){
		//return new Duelo(tdd, this.tddBoot)
	//}
	
	def agregarUsuario(String nombre, String contraseña) throws Exception{
		for(Usuario us : this.usuarios)
			{
			if(us.nombre == nombre || nombre.equals("") || contraseña.equals(""))
			 	{
			 		throw new UsuarioExisteException()
			 	}
			}
			var user = new Usuario(nombre, contraseña)
			inicializarEtadisticas(user)
			this.usuarios.add(user)
	}
	
	def inicializarEtadisticas(Usuario usuario) {
		for(Personaje p : this.personajes)
			{
				usuario.jugador.estadisticas.add(new Estadisticas(p))
			}
	}
	
	
}