package controladores

import TarjetaDeDuelo.Linea
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.TransactionalAndObservable

@Accessors
@TransactionalAndObservable

class ControladorPersonaje {
	
	var String nombre;
	var Linea rolIdeal;
	var List<String> debilidades;
	var List<String> fortalezas;

	new(String nombre, Linea rolIdeal, List<String> fortalezas, List<String> debilidades){
		this.nombre = nombre;
		this.rolIdeal = rolIdeal;
		this.debilidades = debilidades;
		this.fortalezas = fortalezas;
	}
}