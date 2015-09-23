package windowBuscadorDuelo

import org.uqbar.arena.aop.windows.TransactionalDialog
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.WindowOwner
import controladores.ControladorBuscadorDuelo
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Button
import windowDuelo.WindowDuelo
import org.uqbar.arena.windows.Dialog

class WindowBuscadorDuelo  extends TransactionalDialog<ControladorBuscadorDuelo>{
	
		new(WindowOwner owner, ControladorBuscadorDuelo model) {
		super(owner, model)
	}
	
	
	
	override createContents(Panel panel) {
		
		new Label(panel) => [
			bindValueToProperty("textoAMostrar")
			setText("Se ha encontr")
			width = 400
			height = 50
			]
			
			new Label(panel) => [
			setText("¿Aceptas?")
			width = 400
			height = 50
			]
			
			new Button(panel) => [
			caption = "Cancelar"
			onClick [|cancel]
			width = 100
			]
			
			new Button(panel) => [
			caption = "Aceptar"
			onClick [|this.aceptarDuelo]
			width = 100
			]
			
			}
			
			def void aceptarDuelo(){
				this.openDialog(new WindowDuelo(this, modelObject.aceptarDuelo()))
	}
	
	def openDialog(Dialog<?> dialog) {
		dialog.onAccept[|modelObject.aceptarDuelo()]
		dialog.open
	}
	
	


override protected createFormPanel(Panel mainPanel) {
	//throw new UnsupportedOperationException("TODO: auto-generated method stub")
}


}