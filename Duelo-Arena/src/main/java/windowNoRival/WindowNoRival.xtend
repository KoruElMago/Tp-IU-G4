package windowPrincipal

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

class WindowNoRival extends MainWindow<Object>{
	
		new(Object model) {
		super(model)
	}
	override createContents(Panel panel) {
	this.setTitle("Duelo de leyendas")
	panel.setLayout(new VerticalLayout)
	
	
	new Label(panel) => [
			setText("No Tienes Rival")
			
			width = 400
			height = 50
			]
			
	new Label(panel) => [
			setText("NO HAY QUIEN SE TE ANIME EN TU RANKING ACTUAL.")
			
			width = 400
			height = 50
			]
	
	new Label(panel) => [
			setText("Puedes optar entre 3 oscuros senderos para continuar tu camino")
			
			width = 400
			height = 50
			]
	
	new Label(panel) => [
			setText("Puedes descanzar en tu gloria esperando que tus proesas sean cantandas en las tabernas del mundo")
			
			width = 400
			height = 50
			]

	new Label(panel) => [
			setText("O puedes seguir forjando tu leyenda")
			
			width = 400
			height = 50
			]
			
	new Label(panel) => [
			setText("Enfrentandote al Todopoderoso campeon surgido desde la mismisima Arena el bot MR-X")
			
			width = 400
			height = 50
			]
			
	new Label(panel) => [
			setText("O si crees que es poca cosa param ti puedes anunciarte en el tablon y esperar que la proxima promesa venga buscancdo duelo y te enfrentes a ella")
			
			width = 400
			height = 50
			]
			
	new Label(panel) => [
			setText("Cual es su eleccion oh venerable y poderoso guerrero")
			
			width = 400
			height = 50
			]
		
	val panelBotones = new Panel(panel)
        panelBotones.setLayout(new HorizontalLayout)
        panelBotones.layout = new ColumnLayout(3)
	
	new Button(panelBotones) => [
			caption = "MR-X el Rey de la Arena"
			onClick = this.accept
			width = 100
			]
			
	new Button(panelBotones) => [
			caption = "Descanzar en la gloria"
			onClick = this.cancel
			width = 100
			]
	new Button(panelBotones) => [
			caption = "Esperar a la nueva promesa"
			onClick = this.accept
			width = 100
			]
		