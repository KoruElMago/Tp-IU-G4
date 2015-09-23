package Exepcion

class UsuarioExisteException extends Exception{
	
	
	override toString(){
		return "El usuario que quieres crear ya existe o es incorrecto"
	}
}