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

class WindowPrincipal extends MainWindow<Object>{
	
		new(Object model) {
		super(model)
	}
	
	override createContents(Panel panel) {
		this.setTitle("Duelo de leyendas")
		panel.setLayout(new VerticalLayout)
		
		new Label(panel) => [
			setText("Duelo de leyendas")
			
			width = 400
			height = 50
			]
		
		new Label(panel) => [
			setText("Usuario: " + modelObject.usuario)
			width = 200
			]
				
        new Button(panel) => [
			caption = "Buscar Duelo"
			onClick = this.openDialog(
							new WindowCreadorTarjetaDeDuelo
								(this , modelObject))
			onAccept=>[
				try{
					new MessageSend(this.modelObject,"buscarDuelo"))
					this.openDialog(new WindowDuelo(this,modelObject))
				}
				catch(Exepcion e){
					this.openDialog(new WindowNoRival(this, modelObject))
				}	
			]
        
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
			onClick = this.openDialog(new WindowPersonajes(this , modelObject))
			width = 200
			
			]
		new Button(panelPerfil) => [
			caption = "Estadisticas"
			onClick =  this.openDialog(new WindowEstadisticas(this , modelObject))
			width = 200
			
			]        
		
	}
	
	
	
	
	
	
	def static main(String[] args){
		new WindowPrincipal(String).startApplication
	}
	
	
	
}