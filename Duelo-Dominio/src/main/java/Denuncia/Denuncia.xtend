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

	def esValida() {
	
		var valor = true
		var contPalabras = 0
		var chars = this.descripcion.toCharArray
		for(var int i=0; i <chars.size ; i++){
			if (chars.get(i) == " "){
				i++;
			}
			else{
				
				contPalabras ++
			}
		}
		valor = (chars.size < 20) && (contPalabras > 3)
		return valor
		
	}
	def validarse(){
		
		if this.esValida(){
			
			this.descripcion = "El jugador intenta denunciar a:"+ this.denunciado.nombre "por:" + this.tipo.tipo "sin tener una justificación suficiente:" + this.descripcion
			this.denunciado = this.denunciante
			this.tipo = new AbusoSistDenuncia()
			
			
			
			
		}
		
		
		
		
	}
	
	

}