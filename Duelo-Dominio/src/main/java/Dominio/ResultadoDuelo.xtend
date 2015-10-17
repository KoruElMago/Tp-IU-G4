package Dominio

import org.eclipse.xtend.lib.annotations.Accessors

@Accessors

abstract class ResultadoDuelo {
	
	Linea linea;
	Estadistica jugador;	

	new(Estadistica estadistica, Linea linea) {
		this.linea = linea;
		this.jugador = estadistica;
		this.actualizarDatos();
		
	}
	
	def abstract void actualizarDatos();

	def inicio() {
		this.jugador.inicio()
	}

}

class Ganador extends ResultadoDuelo{
	
	new(Estadistica estadistica, Linea linea) {
		super(estadistica,linea);
	}
	
	override actualizarDatos() {
		this.jugador.gano(this.linea);
	}
	
	
}

class Perdedor extends ResultadoDuelo{
	new(Estadistica estadistica, Linea linea) {
		super(estadistica,linea);
	}
	override actualizarDatos() {
		this.jugador.perdio(this.linea);
	}
}

class Empatante extends ResultadoDuelo{
	new(Estadistica estadistica, Linea linea) {
		super(estadistica,linea);
	}
	override actualizarDatos() {
		this.jugador.empato(this.linea);
	}
}