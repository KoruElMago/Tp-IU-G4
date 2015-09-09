package Duelo

import org.eclipse.xtend.lib.annotations.Accessors
import TarjetaDeDuelo.TarjetaDeDuelo

class Duelo {
	@Accessors
	
	var TarjetaDeDuelo jugador1;
	var TarjetaDeDuelo jugador2;
	
	new(TarjetaDeDuelo j1, TarjetaDeDuelo j2){
		this.jugador1 = j1;
		this.jugador2 = j2;
	}
	
}