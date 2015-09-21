package controladores

import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.TransactionalAndObservable
import Denuncia.TipoDenuncia
import Denuncia.AbusoSistDenuncia

@TransactionalAndObservable
@Accessors
class ControladorDenuncia {
	var ControladorJugador denunciante
	var ControladorJugador denunciado
	var String motivo
	var List<String> motivos = new ArrayList
	var Map<String, TipoDenuncia> map = new HashMap<String, TipoDenuncia>();
	var String detalles
			
	
	
	
	new(ControladorJugador denunciante, ControladorJugador denunciado){
		
		this.denunciado = denunciado
		this.denunciante = denunciante
		this.motivos.add("Feed Intencional")
		this.motivos.add("Abuso del Sistema de Denuncia")
		this.map.put("Abuso del Sistema de Denuncia", new AbusoSistDenuncia)	
		
	}
	
	def realizarDenuncia(String motivo, String detalles){
		
		
	}
	
	
}