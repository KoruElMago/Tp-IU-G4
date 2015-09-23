package Core

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List
import TarjetaDeDuelo.TarjetaDeDuelo
import Exepcion.DueloEnEspera
import Duelo.Duelo
import java.util.ArrayList
import Personaje.Personaje
import usuario.Usuario

@Accessors

class DueloEntreLeyendas {
	
	List<Personaje> personajes
	List<TarjetaDeDuelo> buscadores
	TarjetaDeDuelo tddBoot
	//agregado por chibi:
	List<Usuario> usuarios; 
	
	new(TarjetaDeDuelo tddBoot){
		this.buscadores = new ArrayList
		this.tddBoot = tddBoot
		this.personajes = new ArrayList
		this.usuarios = new ArrayList
		
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
	
	def dueloConBoot(TarjetaDeDuelo tdd){
		return new Duelo(tdd, this.tddBoot)
	}
}