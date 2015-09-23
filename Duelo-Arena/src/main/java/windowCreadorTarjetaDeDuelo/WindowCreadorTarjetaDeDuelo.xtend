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
import org.uqbar.arena.aop.windows.TransactionalDialog
import controladores.ControladorTarjetaDuelo
import org.uqbar.arena.windows.WindowOwner
import TarjetaDeDuelo.TarjetaDeDuelo
import org.uqbar.arena.windows.Dialog
import windowDuelo.WindowDuelo
import windowBuscadorDuelo.WindowBuscadorDuelo

class WindowCreadorTarjetaDuelo extends TransactionalDialog<ControladorTarjetaDuelo>{
	
		new(WindowOwner owner, ControladorTarjetaDuelo model) {
		super(owner, model)
	}
	
	
	
	override createContents(Panel panel) {
		this.setTitle("Duelo de leyendas")
		panel.setLayout(new VerticalLayout)
		
		
		new Label(panel) => [
			setText("Arma Tu Jugada ")
			width = 400
			height = 50
			]
		
		val panelSelector = new Panel(panel)
        //panelSelector.layout = new ColumnLayout(2)
        panelSelector.setLayout(new VerticalLayout) 
		
		//val panelSelector2 = new (new VerticalLayout)
		
		
		new Label(panel) =>[
			setText("Elige tu personaje")
		]
		
		
		new Selector<ControladorTarjetaDuelo>(panel) =>[
			allowNull(false)
			bindItemsToProperty("personajes")
            bindValueToProperty("personajeElegido")
			]
		
		new Label(panel) =>[
			setText("Elige tu rol")
		]
		
		new Selector<ControladorTarjetaDuelo>(panel) =>[
			allowNull(false)
			bindItemsToProperty("lineas")
            bindValueToProperty("lineaElegida")
			]
			
		/*val panelSelector3 = new (new VerticalLayout)
		new RadioSelector (panelSelector3) =>[
			allowNull(false)
			bindItems(new ObservableProperty(this, "lineas"))
            bindValueToProperty("linea")
			onSelection(new MessageSend(
				this.modelObject,"calcularEfectividadEnLinea"))
		]
		*/
		
		
		//val panelEstadisticas //to complete when the stats format :P
		
		
		val panelBotones = new Panel(panel)
        panelBotones.setLayout(new HorizontalLayout)
        //panelBotones.layout = new ColumnLayout(2)
		
		new Button(panelBotones) => [
			caption = "BuscarDuelo"
			onClick [|buscarDuelo]
			width = 100
			]
			
		new Button(panelBotones) => [
			caption = "Cancelar"
			onClick [|cancel]
			width = 100
			]
			
			new Button(panelBotones) => [
			caption = "Aceptar"
			onClick [|this.buscarDuelo]
			width = 100
			]
		
	
	
	}
	
	def void buscarDuelo() {
		this.openDialog(new WindowBuscadorDuelo(this, modelObject.buscarDuelo()))
	}
	
	def openDialog(Dialog<?> dialog) {
		dialog.onAccept[|modelObject.buscarDuelo()]
		dialog.open
	}
	
	override protected createFormPanel(Panel mainPanel) {
		//throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}



	
	
	
	