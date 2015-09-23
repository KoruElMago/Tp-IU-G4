package Exepcion

class ContraseñaIncorrectaException extends Exception{
	
	override toString(){
		return "La contraseña que ingresaste es incorrecta. Vuelve a intentar"
	}
	
}