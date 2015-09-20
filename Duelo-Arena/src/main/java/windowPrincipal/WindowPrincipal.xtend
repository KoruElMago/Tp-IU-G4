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
			//override createContents(Panel mainPanel) {
        
        //panel.layout = new ColumnLayout(3)
        new Selector(panel) => [
        	
        ]
        new Button(panel) => [
			caption = "Buscar Duelo"
			onClick = new MessageSend(this.modelObject, "buscarDuelo")
			
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
			onClick = new MessageSend(this.modelObject, "personajes")
			width = 200
			//setBackground(Color.GREEN)
			]
		new Button(panelPerfil) => [
			caption = "Estadisticas"
			onClick = new MessageSend(this.modelObject, "estadisticas")
			width = 200
			
			]        
		
	}
	
	
	
	
	
	
	def static main(String[] args){
		new WindowPrincipal(String).startApplication
	}
	
	
	
}