package Denuncia

import Jugador.Jugador
import Denuncia.TipoDenuncia
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class Denuncia {
	
	String descripcion
	TipoDenuncia tipo
	Jugador denunciante
	Jugador denunciado
	
	new (String descripcion, TipoDenuncia tipo, Jugador denunciante, Jugador denunciado){
		
		this.descripcion = descripcion
		this.tipo = tipo
		this.denunciante = denunciante
		this.denunciado = denunciado
		this.validarse()
		
	}

	def validarse(){
		
		if (this.esValida()){
			
			this.descripcion = ("El jugador intenta denunciar a:"
								+ this.denunciado.nombreJugador 
								+ "por:" 
								+ this.tipo.tipo 
								+ "sin tener una justificación suficiente:" 
								+ this.descripcion)
			this.denunciado = this.denunciante
			this.tipo = new AbusoSistDenuncia()
					
		}
				
	}
	
	def esValida() {
		var char ant = " "
		var cantPal = 0
		for(char c: this.descripcion.toCharArray){
			if((c!=" ")&& (ant == " ")){
				cantPal++
			}
			ant = c
		}
		return(cantPal>3)
	}

}