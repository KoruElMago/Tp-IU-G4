package Jugador

import org.eclipse.xtend.lib.annotations.Accessors
import Personaje.Personaje

@Accessors
class Estadistica {
	
	Personaje personaje
	int vecesQueInicio
	int kills
	int deads
	int assists
}