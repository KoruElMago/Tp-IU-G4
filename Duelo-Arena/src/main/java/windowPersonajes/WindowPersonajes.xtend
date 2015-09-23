package windowPersonajes

import controladores.ControladorDueloEntreLeyendas
import org.uqbar.arena.aop.windows.TransactionalDialog
import org.uqbar.arena.windows.WindowOwner
import org.uqbar.arena.widgets.Panel
import controladores.ControladorUsuario
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Selector
import controladores.ControladorPersonaje

class WindowPersonajes extends TransactionalDialog<ControladorPersonaje>{
	
	new(WindowOwner owner, ControladorPersonaje model) {
		super(owner, model)
	}
	
	override protected createFormPanel(Panel mainPanel) {
	}
	
	override createContents(Panel mainPanel) {
		
		new Label(mainPanel) => [
			setText("Personajes")
			
			width = 400
			height = 50
			]
		
		new Selector<ControladorPersonaje>(mainPanel) => [
            allowNull = false
            bindItemsToProperty("personajes")
            bindValueToProperty("unPersonaje")
			]
			
		/*
	var String nombre;
	var Linea rolIdeal;
	var List<String> debilidades;
	var List<String> fortalezas; 
		 */
		
		
		
		new Label(mainPanel) => [
			setText("Nombre:")
			width = 400
			height = 50
			]
		
		new Label(mainPanel) => [
			bindValueToProperty("nombre")
			width = 400
			height = 50
			]
		
		new Label(mainPanel) => [
			setText("Rol Ideal:")
			width = 400
			height = 50
		]
			
			new Label(mainPanel) => [
			bindValueToProperty("rolIdeal")
			width = 400
			height = 50
			]
			
		new Label(mainPanel) => [
			setText("Fortalezas: ")
			width = 400
			height = 50
] 
			
			
			
		new Label(mainPanel) => [
			setText("Debilidades: ")
			width = 400
			height = 50
		
		
		]
			 
			
			
			
		 	
		
	}
	
}