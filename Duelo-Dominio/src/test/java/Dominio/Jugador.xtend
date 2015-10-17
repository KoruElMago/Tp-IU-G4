package Dominio

import org.eclipse.xtend.lib.annotations.Accessors
import java.util.List
import java.util.ArrayList

@Accessors

class Jugador {
	
	List<Denuncia> denuncias;
	Integer duelosGanados;
	
	new(){
		denuncias = new ArrayList;
		duelosGanados = 0;
	}
	
	def calcularRaiting(){
		
	}
}