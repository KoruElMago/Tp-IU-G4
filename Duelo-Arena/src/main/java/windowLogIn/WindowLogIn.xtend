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
import controladores.ControladorDueloEntreLeyendas
import windowPrincipal.WindowPrincipal
import org.uqbar.arena.windows.Dialog
import Core.DueloEntreLeyendas
import java.awt.Color
import usuario.Usuario
import Jugador.Jugador

class WindowLogIn extends MainWindow<ControladorDueloEntreLeyendas>{
	
	new(ControladorDueloEntreLeyendas model) {
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
			bindValueToProperty("nombreUsuario")
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
			bindValueToProperty("contraseñaUsuario")
			]
			
			new Label(panel) => [
			width = 200
			foreground = Color.RED
			bindValueToProperty("mensajeLogIn")
			]
			
        
        val panelBotones = new Panel(panel)
        panelBotones.setLayout(new HorizontalLayout)
        panelBotones.layout = new ColumnLayout(2)
        
     
        new Button(panelBotones) => [
			caption = "Log In"
			//onClick = new MessageSend(this.modelObject, "loguearUsuario(" +this.modelObject. )
			onClick [ | loguearUsuario ]
			width = 100
			]
			
		new Button(panelBotones) => [
			caption = "Registrarse"
			onClick [ |
			//val confirmarContraseña = new ConfirmacionWindow(this, modelObject)
			//confirmarContraseña.onAccept[|modelObject.registrarUsuario(nombre)]
			registrarUsuario
			]
			
			
]		
	}
	
	def loguearUsuario(){
		if(modelObject.esUsuario)
			{
				if(modelObject.esContraseña)
					{
						
						logueandoUsuario()
						modelObject.nombreUsuario = ""
						modelObject.contraseñaUsuario = ""
					}
					else
					{
						modelObject.mensajeLogIn = "Contraseña Incorrecta. Vuelva a intentar"
						modelObject.nombreUsuario = ""
						modelObject.contraseñaUsuario = ""
					}
			}
			else
			{
			modelObject.mensajeLogIn = "Usuario Inexistente"
			modelObject.nombreUsuario = ""
			modelObject.contraseñaUsuario = ""
			}
	}
	
	def void logueandoUsuario(){
      this.openDialog(new WindowPrincipal(this, modelObject.loguear))
	}
	
	def openDialog(Dialog<?> dialog) {
		dialog.onAccept[|modelObject.loguear]
		dialog.open
	}
	
	def registrarUsuario(){
		modelObject.registrarUsuario()
		
	}
	
	
	
	

	
	def static main(String[] args){
		val del = new DueloEntreLeyendas()
		//val user = new Usuario("Usario92", "abc123" , "TeemoTiamat" )
		val user = new Usuario("unUsuario", "abc123" )
		del.usuarios.add(user)
		
		new WindowLogIn(new ControladorDueloEntreLeyendas(del)).startApplication
		
	}
	
	

	
	
}