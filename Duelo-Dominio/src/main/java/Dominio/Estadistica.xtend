package Dominio

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.ArrayList
import java.util.List

@Accessors

class Estadistica {
	Jugador jugador;
	Personaje personaje;
	float calificacion;
	List<Linea> posiciones;
	float vecesQueInicio;
	float victorias;
	float kills;
	float deads;
	float asists;
	Linea ubicacion;

	
	new(Personaje personaje, Jugador jugador){
	
		this.personaje = personaje;
		this.jugador = jugador;
		posiciones = new ArrayList;
		this.ubicacion = null;
		vecesQueInicio = 0;
		victorias = 0;
		kills = 0;
		deads = 0;
		asists = 0;
		calificacion = 0;	
	}
	
	def gano(Linea linea){
		
		ubicacion = linea;
		posiciones.add(linea);
		victorias++;
		jugador.gano()
	}
	
	def perdio(Linea linea){
		
		posiciones.add(linea);
		deads++;
	}
	
	def empato(Linea linea){
		
		posiciones.add(linea);
		asists++;
	}
	
	def inicio(){
		vecesQueInicio++
	}
	
	def calcularPoderDeAtaque() {
		return (((calificacion + (kills +(asists/2)-deads))* vecesQueInicio)*Math.random) 
	}
	
}