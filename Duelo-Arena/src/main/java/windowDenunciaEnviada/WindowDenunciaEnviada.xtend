package windowDenunciaEnviada

import controladores.ControladorDenunciaEnviada
import java.awt.Color
import org.uqbar.arena.aop.windows.TransactionalDialog
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.WindowOwner
import org.uqbar.arena.widgets.Button

class WindowDenunciaEnviada extends TransactionalDialog<ControladorDenunciaEnviada>{
	
	new(WindowOwner owner, ControladorDenunciaEnviada model) {
		super(owner, model)
	}
	
	override createContents(Panel panel) {
		
		new Label(panel) => [
			bindValueToProperty("tituloParaDenuncia")
			setBackground(Color.BLACK)
			width = 400
			height = 50
			fontSize = 20
		    setForeground(Color.WHITE)
			
			]
			
			new Label(panel) => [
			bindValueToProperty("detalles")
			fontSize = 18
			//setBackground(Color.BLACK)
			//width = 400
			//height = 30
			//fontSize = 25
		    //setForeground(Color.WHITE)
			
			]
			
			new Button(panel) => [
			setCaption("Aceptar")
			onClick [|cancel]
		]
		
	}
	
	override protected createFormPanel(Panel mainPanel) {
		//throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	
	
}