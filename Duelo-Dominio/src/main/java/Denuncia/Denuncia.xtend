package Denuncia

import Jugador.Jugador
import Denuncia.TipoDenuncia
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
		
		if this.esValida(){
			
			this.descripcion = "El jugador intenta denunciar a:"+ this.denunciado.nombre "por:" + this.tipo.tipo "sin tener una justificación suficiente:" + this.descripcion
			this.denunciado = this.denunciante
			this.tipo = new AbusoSistDenuncia()
			
			
			
			
		}
		
		
		
		
	}
	
	def esValida() {
		
		
	}

}