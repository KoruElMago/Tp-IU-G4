package ventanaEstadisticas

import org.uqbar.arena.windows.MainWindow
import org.uqbar.arena.widgets.Panel
import controladores.ControladorJugador
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Selector
import Jugador.Jugador
import Jugador.Estadisticas
import java.util.ArrayList
import Personaje.Personaje
import TarjetaDeDuelo.Linea
import org.uqbar.arena.layout.HorizontalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.actions.MessageSend
import controladores.ControladorEstadisticas
import org.uqbar.arena.windows.Dialog

class WindowSeleccionEstadistica extends MainWindow<ControladorJugador>{
	
	new(ControladorJugador model) {
		super(model)
	}
	
	override createContents(Panel mainPanel) {
		
		 new Label(mainPanel) => [
			setText("Seleccione Personaje")
			//setBackground(Color.BLACK)
			//width = 600
			//height = 10
			fontSize = 15
		    //setForeground(Color.WHITE)
			]
		
		new Selector<ControladorJugador>(mainPanel) => [
            
            allowNull = false
            bindItemsToProperty("nombreEstadisticas")
            bindValueToProperty("nombrePersonaje")
			]
			
			val panelOpciones = new Panel(mainPanel)
			panelOpciones.setLayout(new HorizontalLayout)
			
			new Button(panelOpciones) => [
			setCaption("Ver Estadistica")
			fontSize = 8
	
			//onClick = new MessageSend(this.modelObject, "abrirEstadistica(" +this.modelObject. )
			//onClick = this.openDialog(new WindowEstadisticas(this , modelObject)) ]
			 //onClick [|this.modelObject.estadisticaPersonaje]
			 //onClick = new MessageSend(this.modelObject, "estadisticaPersonaje")
			 //onClick [|this.modelObject.estadisticaPersonaje]
			 onClick [ | abrirEstadistica]
			 //onClick =  this.openDialog(new WindowEstadistica(new ControladorEstadisticas(modelObject.estadisticaPersonaje)))
			]
			
			new Button(panelOpciones) => [
			setCaption("Cerrar")
			fontSize = 8
			 onClick [ | close]

			]
			
			
	}
	
	def openDialog(Dialog<?> dialog) {
		dialog.onAccept[|modelObject.seleccionar]
		dialog.open
	}
	
	def void abrirEstadistica() {
      this.openDialog(new WindowEstadistica(this, modelObject.seleccionar))
}
	
	
	
	
	
	
	def static main(String[] args){
		var fort = new ArrayList<String>()
		var deb = new ArrayList<String>()
		
		val jugador = new Jugador("TeemoTiamat")
		val statics = jugador.estadisticas
		
		statics.add(new Estadisticas(new Personaje("Amumu",Linea.Bottom, fort, deb)))
		statics.add(new Estadisticas(new Personaje("Ashe",Linea.Bottom, fort, deb)))
		jugador.estadisticas = statics
		new WindowSeleccionEstadistica(new ControladorJugador(jugador)).startApplication	
	}
}