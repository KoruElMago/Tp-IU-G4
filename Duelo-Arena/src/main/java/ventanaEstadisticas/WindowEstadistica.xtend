package ventanaEstadisticas

import Jugador.Estadisticas
import Personaje.Personaje
import TarjetaDeDuelo.Linea
import java.util.ArrayList
import org.uqbar.arena.layout.HorizontalLayout
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.List
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.MainWindow
import controladores.ControladorEstadisticas
import controladores.ControladorPersonaje
import org.uqbar.arena.aop.windows.TransactionalDialog
import org.uqbar.arena.windows.WindowOwner
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Selector
import org.uqbar.arena.windows.Dialog

class WindowEstadistica extends TransactionalDialog<ControladorEstadisticas>{
	
	new(WindowOwner owner, ControladorEstadisticas model) {
		super(owner, model)
		//title = defaultTitle
	}
	
	override createContents(Panel mainPanel) {
	 
	 val panelPersonaje = new Panel(mainPanel)
	 panelPersonaje.setLayout(new HorizontalLayout)
	 
	 new Label(mainPanel) => [
			setText("Seleccione Personaje")
			//setBackground(Color.BLACK)
			//width = 600
			//height = 10
			fontSize = 15
		    //setForeground(Color.WHITE)
			]
		
		new Selector<ControladorEstadisticas>(mainPanel) => [
            
            allowNull = false
            bindItemsToProperty("nombreEstadisticas")
            bindValueToProperty("nombrePersonaje")
			]
			
			val panelOpciones = new Panel(mainPanel)
			panelOpciones.setLayout(new HorizontalLayout)
	 
	 
	 
	 new Label(panelPersonaje) => [
			setText("Personaje:")
			//setBackground(Color.BLACK)
			//width = 600
			//height = 10
			fontSize = 15
		    //setForeground(Color.WHITE)
			]
			
			new Label(panelPersonaje) => [
			//bindValueToProperty("estadisticaSeleccionada.personaje.nombre")
			bindValueToProperty("nombrePersonaje")
			//setBackground(Color.BLACK)
			//width = 600
			//height = 10
			fontSize = 15
		    //setForeground(Color.WHITE)
			]
			
			val panelPartidas = new Panel(mainPanel)
			panelPartidas.setLayout(new HorizontalLayout)
			
			new Label(panelPartidas) => [
			setText("cantidad de Duelos: ")
			fontSize = 15
			]
			
			new Label(panelPartidas) => [
			//bindValueToProperty("estadisticaSeleccionada.vecesQueInicio")
			bindValueToProperty("vecesQueInicio")
			fontSize = 15
			]
			
			val panelKills = new Panel(mainPanel)
			panelKills.setLayout(new HorizontalLayout)
			
			new Label(panelKills) => [
			setText("Kills: ")
			fontSize = 15
			]
			
			new Label(panelKills) => [
			//bindValueToProperty("estadisticaSeleccionada.kills")
			bindValueToProperty("kills")
			fontSize = 15
			]
			
			
			val panelDeads = new Panel(mainPanel)
			panelDeads.setLayout(new HorizontalLayout)
			
			new Label(panelDeads) => [
			setText("Deads: ")
			fontSize = 15
			]
			
			new Label(panelDeads) => [
			//bindValueToProperty("estadisticaSeleccionada.deads")
			bindValueToProperty("deads")
			fontSize = 15
			]
			
			val panelAssist = new Panel(mainPanel)
			panelAssist.setLayout(new HorizontalLayout)
			
			new Label(panelAssist) => [
			setText("Assists: ")
			fontSize = 15
			]
			
			new Label(panelAssist) => [
			//bindValueToProperty("estadisticaSeleccionada.assists")
			bindValueToProperty("assist")
			fontSize = 15
			]
			
			
			val panelVictorias = new Panel(mainPanel)
			panelVictorias.setLayout(new HorizontalLayout)
			
			new Label(panelVictorias) => [
			setText("Victorias: ")
			fontSize = 15
			]
			
			new Label(panelVictorias) => [
			//bindValueToProperty("estadisticaSeleccionada.victorias")
			bindValueToProperty("victorias")
			fontSize = 15
			]
			
			val panelMejorLinea = new Panel(mainPanel)
			panelMejorLinea.setLayout(new HorizontalLayout)
			
			new Label(panelMejorLinea) => [
			setText("Mejor Linea: ")
			fontSize = 15
			]
			
			new Label(panelMejorLinea) => [
			//bindValueToProperty("estadisticaSeleccionada.mejorLinea")
			bindValueToProperty("mejorLinea")
			fontSize = 15
			]
			
			val panelUbicaciones = new Panel(mainPanel)
			panelUbicaciones.setLayout(new HorizontalLayout)
			
			new Label(panelUbicaciones) => [
			setText("Ubicaciones: ")
			fontSize = 15
			]
			
			new List(panelUbicaciones) => [
			//bindValueToProperty("estadisticaSeleccionada.ubicaciones")
			bindValueToProperty("ubicaciones")
			]
			
			val panelCalificacion = new Panel(mainPanel)
			panelCalificacion.setLayout(new HorizontalLayout)
			
			new Label(panelCalificacion) => [
			setText("Calificacion: ")
			fontSize = 15
			]
			
			new Label(panelCalificacion) => [
			//bindValueToProperty("estadisticaSeleccionada.calificacionEnDuelo")
			bindValueToProperty("calificacionEnDuelo")
			fontSize = 15
			]
			
			new Button(mainPanel) => [
			setCaption("Volver")
			fontSize = 8
			 onClick [ | close]
			]
			
	
	
	
	}
	
	def openDialog(Dialog<?> dialog) {
		dialog.onAccept[|modelObject.seleccionar]
		dialog.open
	}
	
	def void abrirEstadistica() {
      //this.openDialog(new WindowEstadistica(this, modelObject.seleccionar))
      modelObject.abrirEstadistica()
}
	
	
	
	def static main(String[] args){
		//var fort = new ArrayList<String>()
		//var deb = new ArrayList<String>()
		//new WindowEstadistica(new ControladorEstadisticas(new Estadisticas(new Personaje("Amumu",Linea.Bottom, fort, deb)))).startApplication
		
		
	}
	
	override protected createFormPanel(Panel mainPanel) {
		//throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}