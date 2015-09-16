package Core

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List
import TarjetaDeDuelo.TarjetaDeDuelo

@Accessors

class DueloEntreLeyendas {
	
	List<TarjetaDeDuelo> buscadores
	
	
	def buscarDuelo(TarjetaDeDuelo tdd){
		
		var rival = this.buscarRivalDigno(tdd)
		if(rival == tdd){
			this.buscadores.add(tdd)
			throw new DueloEnEspera
		}
		else{
			return new Duelo(tdd,rival)
		}
	}	
}