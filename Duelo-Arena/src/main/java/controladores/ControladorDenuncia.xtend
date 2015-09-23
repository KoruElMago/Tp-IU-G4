package controladores

import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.TransactionalAndObservable
import Denuncia.TipoDenuncia
import Denuncia.AbusoSistDenuncia
import Denuncia.AbusoHabilDenuncia
import Denuncia.ComAbusivaDenuncia
import Denuncia.FeedIntencionalDenuncia
import Core.DueloEntreLeyendas
import Jugador.Jugador

@TransactionalAndObservable
@Accessors
class ControladorDenuncia {
	
	var DueloEntreLeyendas del 
	var Jugador denunciante
	var Jugador denunciado
	//var String motivo
	var TipoDenuncia motivo
	//var List<String> motivos = new ArrayList
	var List<TipoDenuncia> motivos = new ArrayList
	//var Map<String, TipoDenuncia> map = new HashMap<String, TipoDenuncia>();
	var String detalles
			
	
	
	
	new(DueloEntreLeyendas del, Jugador denunciante, Jugador denunciado){
		
		this.del = del
		this.denunciado = denunciado
		this.denunciante = denunciante
		this.motivos.add(new AbusoHabilDenuncia())
		this.motivos.add(new ComAbusivaDenuncia())
		this.motivos.add(new FeedIntencionalDenuncia())
		
		//this.motivos.add("Feed Intencional")
		//this.motivos.add("Abuso del Sistema de Denuncia")
		//this.map.put("Abuso del Sistema de Denuncia", new AbusoSistDenuncia)	
		
	}
	
	def realizarDenuncia(){
		//Aqui se agrega la denuncia al jugador...
		//Depende de si es correcta o no, en WindowDenuncia se abrira una ventana
		//diciendo si es correcta o no, y el boton aceptar (label detales, boton aceptar) ylisto
		
		
	}
	
	
}