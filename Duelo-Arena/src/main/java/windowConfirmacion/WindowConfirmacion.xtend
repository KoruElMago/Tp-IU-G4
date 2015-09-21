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

class WindowConfirmacion extends MainWindow<Controlador>{
	
	new(Object model) {
		super(model)
	}
	
	override createContents(Panel panel) {
		this.setTitle("Confirme su Contraseña")
		panel.setLayout(new VerticalLayout)
		

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
			
		new Label(panelContraseña) => [
				setText("Repita la Contraseña")
				width = 200
			
			
			]
		new TextBox(panelContraseña) => [
				width = 200
				width = 200
				bindValueToProperty("repit password")
			]
        
        val panelBotones = new Panel(panel)
        panelBotones.setLayout(new HorizontalLayout)
        panelBotones.layout = new ColumnLayout(2)
		
		new Button(panelBotones) => [
			caption = "Registrarse"
			onClick =>[
				if (modelObject.contraseñaValida) {
					this.mensaje = ("Su Cuenta fue Reguistrada con exito!! Bienvenido:" + this.modelObject.nombre)
					this.accept
				} 	
				else(modelObject.perdioElJuego) {
					this.mensaje = "Las Contraseñas no coinciden :/"
				}
			]
		]
			
		new Button(panelBotones) => [
			caption = "Cancelar"
			onClick = this.cancel
			width = 100
			]
	}