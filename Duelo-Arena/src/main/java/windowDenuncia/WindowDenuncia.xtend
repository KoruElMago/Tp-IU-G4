package windowDenuncia


import org.uqbar.arena.actions.MessageSend
import org.uqbar.arena.layout.ColumnLayout
import org.uqbar.arena.layout.HorizontalLayout
import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.TextBox
import org.uqbar.arena.windows.MainWindow
import java.awt.Color
import org.uqbar.arena.widgets.Selector
import ejemplos.EjemploDenuncia

class WindowDenuncia extends MainWindow<EjemploDenuncia>{
	
	
	new() {
		super(new EjemploDenuncia)
	}
	
	override createContents(Panel panel) {
		this.setTitle("Duelo de leyendas")
		panel.setLayout(new VerticalLayout)
		
		new Label(panel) => [
			setText("HACER DENUNCIA!")
			setBackground(Color.BLACK)
			width = 400
			height = 50
			fontSize = 35
		    setForeground(Color.WHITE)
			
			]
			
			new Label(panel) => [
			setText("")
			//setBackground(Color.BLACK)
			//width = 400
			height = 10
			//fontSize = 35
		    //setForeground(Color.WHITE)
			
			]
			
			
			//override createContents(Panel mainPanel) {
        
        //panel.layout = new ColumnLayout(3)
        
        val panelDenunciaA = new Panel(panel)
        panelDenunciaA.setLayout(new HorizontalLayout)
        
        
        new Label(panelDenunciaA) => [
			setText("Estas queriendo denunciar a: ")
			width = 200
			]
		new Label(panelDenunciaA) => [
			setText("<Un usuario>")
			width = 200
			]

        val panelMotivo = new Panel(panel)
        panelMotivo.setLayout(new HorizontalLayout)
        
        new Label(panelMotivo) => [
			setText("Motivo")
			width = 200
			]
			
			
		new Selector<EjemploDenuncia>(panelMotivo) => [
            allowNull = false
            bindItemsToProperty("unMotivo")
            bindValueToProperty("motivo")
			]            
			
		val panelDetalles = new Panel(panel)
		panelDetalles.setLayout(new HorizontalLayout)
		
		 new Label(panelDetalles) => [
			setText("Detalles")
			width = 200
			]
			
		 new TextBox(panelDetalles) => [
			width = 200
			//height = 150
			fontSize = 12
			]	
			
		val panelOpciones = new Panel(panel)
		panelOpciones.setLayout(new HorizontalLayout)
		
		new Button(panelOpciones) => [
			setCaption("Denunciar")
			onClick = new MessageSend(this.modelObject, "realizarDenuncia")
			]
			
		new Button(panelOpciones) => [
			setCaption("Cancelar")
			onClick = new MessageSend(this.modelObject, "cancelarDenuncia")
		]
			
			
   
	}
	
	
	
	
	
	
	def static main(String[] args){
		new WindowDenuncia().startApplication
	}
}