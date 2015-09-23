package Denuncia

import org.eclipse.xtend.lib.annotations.Accessors
@Accessors

abstract class TipoDenuncia {
	
	var String tipo
	var Integer peso 
	
	new(){}
	
	override toString(){
		return tipo
	}
	
}