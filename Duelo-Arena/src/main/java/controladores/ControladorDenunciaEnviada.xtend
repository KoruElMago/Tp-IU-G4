package controladores

import Core.DueloEntreLeyendas
import Denuncia.Denuncia
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.TransactionalAndObservable

@TransactionalAndObservable
@Accessors

class ControladorDenunciaEnviada {
	DueloEntreLeyendas del
	Denuncia denuncia
	String detalles
	String tituloParaDenuncia
	
	
	new(DueloEntreLeyendas del, Denuncia denuncia)
	{
		this.del = del
		this.denuncia = denuncia
		if(denuncia.esValida)
			{
			detalles = "EL rival" + denuncia.denunciado.nombreJugador+ " ha sido denunciado"
			tituloParaDenuncia =  "Denuncia Aceptada"
			denuncia.denunciado.agregarDenuncia(denuncia)
			
			}
			else
			{
			tituloParaDenuncia = "Me estas jodiendo?"
			detalles = "Tu denuncia no es valida " 	
			denuncia.denunciante.agregarDenuncia(denuncia)
			}
		
		
		
		
		
		
		
	}
	
	
}