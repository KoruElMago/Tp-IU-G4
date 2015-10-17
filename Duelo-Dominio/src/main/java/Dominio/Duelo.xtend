package Dominio

import org.eclipse.xtend.lib.annotations.Accessors

@Accessors

class Duelo {

	ResultadoDuelo jugador1;
	ResultadoDuelo jugador2;
		
	new(Estadistica jugador1,Estadistica jugador2, Linea lineaJ1, Linea lineaJ2){
		
		this.jugar(jugador1,jugador2,lineaJ1,lineaJ2);
		this.jugador1.inicio();
	}
	
	def jugar(Estadistica jugador1, Estadistica jugador2, Linea linea1, Linea linea2) {
		var puntajeJ1 = jugador1.calcularPoderDeAtaque;
		var puntajeJ2 = jugador2.calcularPoderDeAtaque;
		
		if(puntajeJ1 < puntajeJ2){
			this.jugador1 = new Ganador(jugador1, linea1);
			this.jugador2 = new Perdedor(jugador2, linea2);
		}
		else{
			if(puntajeJ1 > puntajeJ2){
				this.jugador2 = new Ganador(jugador2, linea2);
				this.jugador1 = new Perdedor(jugador1, linea1);		
			}
			else{
				this.jugador1 = new Empatante(jugador1, linea1);
				this.jugador2 = new Empatante(jugador2, linea2);
		
			}
		}
	}
	
	
	
}