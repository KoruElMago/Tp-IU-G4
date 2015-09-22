package windowCreadorTarjetaDeDuelo

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
import windowLogIn.WindowLogIn
import controladores.ControladorUsuario

class WindowCreadorTarjetaDuelo extends MainWindow<Object>{
	
		new(Object model) {
		super(model)
	}
	
	
	
	override createContents(Panel panel) {
		this.setTitle("Duelo de leyendas")
		panel.setLayout(new VerticalLayout)
		
		
		new Label(panel) => [
			setText("Arma Tu Jugada ")
			width = 400
			height = 50
			]
		
		val panelSelector = new (new HorizontalLayout)
        panelSelector.layout = new ColumnLayout(2) 
		
		val panelSelector2 = new (new VerticalLayout)
		
		new Selector (panelSelector2) =>[
			allowNull(false)
			bindItems(new ObservableProperty(this, "personajes"))
			bindValueToProperty("personajeElegido")]
		
		new Label(panelSelector2) =>[
		
			bindValueToProperty("efectividad")
			]
			
			
		val panelSelector3 = new (new VerticalLayout)
		new RadioSelector (panelSelector3) =>[
			allowNull(false)
			bindItems(new ObservableProperty(this, "lineas"))
            bindValueToProperty("linea")
			onSelection(new MessageSend(
				this.modelObject,"calcularEfectividadEnLinea"))
		]
		
		
		val panelEstadisticas //to complete when the stats format :P
		
		
		val panelBotones = new Panel(panel)
        panelBotones.setLayout(new HorizontalLayout)
        panelBotones.layout = new ColumnLayout(2)
		
		new Button(panelBotones) => [
			caption = "Aceptar"
			onClick = this.accept
			width = 100
			]
			
		new Button(panelBotones) => [
			caption = "Cancelar"
			onClick = this.cancel
			width = 100
			]
		
	}