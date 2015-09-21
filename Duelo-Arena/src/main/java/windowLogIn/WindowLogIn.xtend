package windowLogIn

import org.uqbar.arena.bindings.DateAdapter
import org.uqbar.arena.layout.ColumnLayout
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.Selector
import org.uqbar.arena.widgets.TextBox
import org.uqbar.arena.windows.SimpleWindow
import org.uqbar.arena.windows.WindowOwner
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.windows.MainWindow
import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.Widget
import org.uqbar.arena.actions.MessageSend
import org.uqbar.arena.layout.HorizontalLayout

class WindowLogIn extends MainWindow<ControladorLogIn>{
	
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
			
        val panelUsuario = new Panel(panel)
        panelUsuario.setLayout(new HorizontalLayout)
        
        
        new Label(panelUsuario) => [
			setText("Nombre de Usuario")
			width = 200
			]
		new TextBox(panelUsuario) => [
			width = 200
			bindValueToProperty("nombre")
			]

        val panelContraseña = new Panel(panel)
        panelContraseña.setLayout(new HorizontalLayout)
        
        new Label(panelContraseña) => [
			setText("Contraseña")
			width = 200
			
			
			]
		new TextBox(panelContraseña) => [
			width = 200
			width = 200
			bindValueToProperty("password")
			]
        
        val panelBotones = new Panel(panel)
        panelBotones.setLayout(new HorizontalLayout)
        panelBotones.layout = new ColumnLayout(2)
        
     
        new Button(panelBotones) => [
			caption = "Log In"
			onClick = new MessageSend(this.modelObject, "loguearUsuario(" +this.modelObject. )
			width = 100
			]
			
		new Button(panelBotones) => [
			caption = "Registrarse"
			onClick =>[
			val confirmarContraseña = new ConfirmacionWindow(this, modelObject)
			confirmarContraseña.onAccept[|modelObject.registrarUsuario(nombre)
			]
		
	}

	
	def static main(String[] args){
		new WindowLogIn(String).startApplication
	}
	
	

	
	
}