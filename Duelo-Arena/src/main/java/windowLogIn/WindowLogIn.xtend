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
import Jugador.Estadisticas
import Personaje.Personaje
import java.util.ArrayList
import TarjetaDeDuelo.Linea
import TarjetaDeDuelo.TarjetaDeDuelo

class WindowLogIn extends MainWindow<ControladorDueloEntreLeyendas>{
	
	new(ControladorDueloEntreLeyendas model) {
		super(model)
	}
	
	override createContents(Panel panel) {
		this.setTitle("Duelo de leyendas")
		panel.setLayout(new VerticalLayout)
		
		new Label(panel) => [
			setText("Duelo de leyendas")
			fontSize = 30
			width = 600
			height = 60
			
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
		if(modelObject.puedoLoguear)
			{
		this.openDialog(new WindowPrincipal(this, modelObject.loguear))
		}
			}
	
	//def void logueandoUsuario() {
      //this.openDialog(new WindowPrincipal(this, modelObject.loguear))
	//}
	
	def openDialog(Dialog<?> dialog) {
		//dialog.onAccept[|modelObject.loguear]
		dialog.open
	}
	
	def registrarUsuario(){
		modelObject.registrarUsuario()
		
	}
	
	
	
	

	
	def static main(String[] args){
		val del = new DueloEntreLeyendas()
		//val user = new Usuario("Usario92", "abc123" , "TeemoTiamat" )
		val user = new Usuario("unUsuario", "abc123" )
		
		
		val ashe = new Personaje("Ashe" , Linea.Bottom, new ArrayList, new ArrayList)
		val amumu = new Personaje("Amumu" , Linea.Jungle, new ArrayList, new ArrayList)
		val orianna = new Personaje("Orianna" , Linea.Mid, new ArrayList, new ArrayList)
		val annie = new Personaje("Annie" , Linea.Mid, new ArrayList, new ArrayList)
		val raven = new Personaje("Raven" , Linea.Top, new ArrayList, new ArrayList)
		
		del.personajes.add(ashe)
		del.personajes.add(amumu)
		del.personajes.add(orianna)
		del.personajes.add(annie)
		del.personajes.add(raven)
		
		val est1 = new Estadisticas(ashe)
		val est2 = new Estadisticas(amumu)
		val est3 = new Estadisticas(orianna)
		val est4 = new Estadisticas(annie)
		val est5 = new Estadisticas(raven)
		
		
		
		user.jugador.estadisticas.add(est1)
		user.jugador.estadisticas.add(est2)
		user.jugador.estadisticas.add(est3)
		user.jugador.estadisticas.add(est4)
		user.jugador.estadisticas.add(est5)
		
		
		
		del.usuarios.add(user)
		
		val user2 = new Usuario("usuario2", "123")
		
		user2.jugador.estadisticas.add(est1)
		user2.jugador.estadisticas.add(est2)
		user2.jugador.estadisticas.add(est3)
		user2.jugador.estadisticas.add(est4)
		user2.jugador.estadisticas.add(est5)
		
		val user3 = new Usuario("usuario3", "123")
		
		user3.jugador.estadisticas.add(est1)
		user3.jugador.estadisticas.add(est2)
		user3.jugador.estadisticas.add(est3)
		user3.jugador.estadisticas.add(est4)
		user3.jugador.estadisticas.add(est5)
		
		//TarjetaDuelo
		val t1 = new TarjetaDeDuelo(amumu, user.jugador, Linea.Bottom)
		val t2 = new TarjetaDeDuelo(ashe, user2.jugador, Linea.Mid)  
		
		del.buscadores.add(t1)
		del.buscadores.add(t2)
		
		
		
		new WindowLogIn(new ControladorDueloEntreLeyendas(del)).startApplication
		
	}
	
	

	
	
}