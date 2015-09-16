package Core

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List
import TarjetaDeDuelo.TarjetaDeDuelo
import Exepcion.DueloEnEspera
import Duelo.Duelo
import java.util.ArrayList
import Personaje.Personaje

@Accessors

class DueloEntreLeyendas {
	
	List<Personaje> personajes
	List<TarjetaDeDuelo> buscadores
	TarjetaDeDuelo tddBoot 
	
	new(TarjetaDeDuelo tddBoot){
		this.buscadores = new ArrayList
		this.tddBoot = tddBoot
		this.personajes = new ArrayList
		
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
			if(duelo.esRivalDigno(posibleRival)){
				rival = posibleRival
			}
		}
		return rival
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