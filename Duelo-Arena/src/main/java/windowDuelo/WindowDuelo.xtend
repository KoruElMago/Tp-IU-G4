package windowDuelo

import controladores.ControladorDuelo
import org.uqbar.arena.aop.windows.TransactionalDialog
import org.uqbar.arena.windows.WindowOwner
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.layout.ColumnLayout
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Button

class WindowDuelo extends TransactionalDialog<ControladorDuelo>{
	
	new(WindowOwner owner, ControladorDuelo model) {
		super(owner, model)
	}
	
	override protected createFormPanel(Panel mainPanel) {
		//throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override createContents(Panel panel) {
		
		this.setTitle("Duelo!")
		panel.setLayout(new VerticalLayout)
		panel.layout = new ColumnLayout(2)
		
			
		
		
		
		
		
		val panelJugador1 = new Panel(panel)
		panelJugador1.setLayout(new VerticalLayout())
		
		new Label(panelJugador1) =>[
			setText("Nombre de Usuario")	
		]
		new Label(panelJugador1) =>[
			bindValueToProperty("nombre1")	
		]
		
		new Label(panelJugador1) =>[
			setText("Personaje")	
		]
		new Label(panelJugador1) =>[
			bindValueToProperty("personaje1")	
		]
		
		new Label(panelJugador1) =>[
			setText("Linea")	
		]
		new Label(panelJugador1) =>[
			bindValueToProperty("linea1")
			
			
		new Label(panelJugador1) =>[
			setText("puntaje")		
		]	
			new Label(panelJugador1) =>[
			bindValueToProperty("puntaje1")		
		]
		
		
		
		val panelJugador2 = new Panel(panel)
		panelJugador2.setLayout(new VerticalLayout())
		
		new Label(panelJugador2) =>[
			setText("Nombre de Usuario")	
		]
		new Label(panelJugador2) =>[
			bindValueToProperty("nombre2")
			]
			
			new Label(panelJugador2) =>[
			setText("Personaje")	
		]
		new Label(panelJugador2) =>[
			bindValueToProperty("personaje2")
			]
			
			new Label(panelJugador2) =>[
			setText("Linea")	
		]
		new Label(panelJugador2) =>[
			bindValueToProperty("linea2")
			]
			
			new Label(panelJugador2) =>[
			setText("puntaje")		
		]	
		
				new Label(panelJugador2) =>[
			bindValueToProperty("puntaje2")		
		]
			]
			
		//new Button(panel) => [
			//caption = "Aceptar"
			//onClick [ | comenzarDuelo 
						
			//]
			//]
		
		new Button(panel) => [
			caption = "Denunciar"
			//onClick [ | comenzarDuelo 	]
			
			]
			
			new Label(panel) =>[
			setText("ganador")		
		]
		new Label(panel) =>[
			bindValueToProperty("nombreGanador")		
		]
			this.comenzarDuelo
	}
	
	def comenzarDuelo() {
		modelObject.comenzarDuelo()
	}
	
	
	
}