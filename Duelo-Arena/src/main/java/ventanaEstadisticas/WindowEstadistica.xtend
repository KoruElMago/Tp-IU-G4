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

class WindowEstadistica extends TransactionalDialog<ControladorEstadisticas>{
	
	new(WindowOwner owner, ControladorEstadisticas model) {
		super(owner, model)
		//title = defaultTitle
	}
	
	override createContents(Panel mainPanel) {
	 
	 val panelPersonaje = new Panel(mainPanel)
	 panelPersonaje.setLayout(new HorizontalLayout)
	 
	 new Label(panelPersonaje) => [
			setText("Personaje:")
			//setBackground(Color.BLACK)
			//width = 600
			//height = 10
			fontSize = 15
		    //setForeground(Color.WHITE)
			]
			
			new Label(panelPersonaje) => [
			bindValueToProperty("nombre")
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
			bindValueToProperty("ubicaciones")
			]
			
			val panelCalificacion = new Panel(mainPanel)
			panelCalificacion.setLayout(new HorizontalLayout)
			
			new Label(panelCalificacion) => [
			setText("Calificacion: ")
			fontSize = 15
			]
			
			new Label(panelCalificacion) => [
			bindValueToProperty("calificacionEnDuelo")
			fontSize = 15
			]
			
			new Button(mainPanel) => [
			setCaption("Volver")
			fontSize = 8
			 onClick [ | close]
			]
			
	
	
	
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