package windowPrincipal

import org.uqbar.arena.actions.MessageSend
import org.uqbar.arena.layout.HorizontalLayout
import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.TextBox
import org.uqbar.arena.windows.MainWindow
import java.awt.Color
import org.uqbar.arena.widgets.Selector
import org.uqbar.arena.aop.windows.TransactionalDialog
import org.uqbar.arena.windows.WindowOwner
import controladores.ControladorUsuario
import org.uqbar.arena.windows.Dialog
import ventanaEstadisticas.WindowEstadistica
import windowPersonajes.WindowPersonajes
import controladores.ControladorPersonaje
import windowCreadorTarjetaDeDuelo.WindowCreadorTarjetaDuelo

class WindowPrincipal extends TransactionalDialog<ControladorUsuario>{
	
	new(WindowOwner owner, ControladorUsuario model) {
		super(owner, model)
		//title = defaultTitle
	}
	
	override createContents(Panel panel) {
		//this.setTitle("Duelo de leyendas")
		panel.setLayout(new VerticalLayout)
		
		new Label(panel) => [
			setText("Duelo de leyendas")
			
			width = 400
			height = 50
			]
		
		new Label(panel) => [
			setText("Usuario: " + modelObject.toString)
			width = 200
			]
				
        new Button(panel) => [
			caption = "Buscar Duelo"
			onClick[| buscarDuelo]
			]
		/*	onClick = this.openDialog(
						new WindowCreadorTarjetaDeDuelo
								(this , modelObject))
			onAccept=>[
				try{
					new MessageSend(this.modelObject,"buscarDuelo"))
					this.openDialog(new WindowDuelo(this,modelObject))
				}
				*/
				
				
				
				//catch(Exepcion e){
					//this.openDialog(new WindowNoRival(this, modelObject))
				//}	
			//]
        
        new Label(panel) => [
        	
        	
			setText("")
			
			width = 400
			height = 20
			]
        
        new Label(panel) => [
        	
			setText("Perfil")
			
			width = 400
			]
        
        val panelPerfil = new Panel(panel)
        panelPerfil.setLayout(new HorizontalLayout)
        
        
        
       new Button(panelPerfil) => [
			caption = "Personajes"
			//onClick = this.openDialog(new WindowPersonajes(this , modelObject))
			onClick [| verPersonajes]
			width = 200
			
			]
		new Button(panelPerfil) => [
			caption = "Estadisticas"
			//onClick =  this.openDialog(new WindowEstadisticas(this , modelObject))
			onClick [| verEstadisticas]
			width = 200
			
			]        
		
	}
	
	def buscarDuelo() {
		this.openDialog(new WindowCreadorTarjetaDuelo(this, modelObject.buscarDuelo()))
	}
	
	def verPersonajes() {

	 this.openDialog(new WindowPersonajes(this, modelObject.abrirPersonajes()))	
		//throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override protected createFormPanel(Panel mainPanel) {
		//throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	def verEstadisticas(){
		this.openDialog(new WindowEstadistica(this, modelObject.abrirSeleccionEstadistica() ))
	}
	
	def openDialog(Dialog<?> dialog) {
		//dialog.onAccept[| modelObject.abrirSeleccionEstadistica]
		dialog.open
	}
	
	
	
	
	
	//def static main(String[] args){
		//new WindowPrincipal(String).startApplication
	//}
	
	
	
}