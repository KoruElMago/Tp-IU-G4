package windowDenuncia

import Jugador.Jugador
import controladores.ControladorDenuncia
import controladores.ControladorJugador
import controladores.ControladorTipoDenuncia
import java.awt.Color
import org.uqbar.arena.actions.MessageSend
import org.uqbar.arena.layout.ColumnLayout
import org.uqbar.arena.layout.HorizontalLayout
import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.Selector
import org.uqbar.arena.widgets.TextBox
import org.uqbar.arena.windows.MainWindow
import org.uqbar.arena.aop.windows.TransactionalDialog
import org.uqbar.arena.windows.WindowOwner

class WindowDenuncia extends TransactionalDialog<ControladorDenuncia>{
	
	new(WindowOwner owner, ControladorDenuncia model) {
		super(owner, model)
	}
	
	
	
	//new(ControladorJugador denunciado, ControladorJugador denunciante) {
		//super(new ControladorDenuncia (denunciado, denunciante))
		
	//	}
		
		
	
	override createContents(Panel panel) {
		this.setTitle("Duelo de leyendas")
		panel.setLayout(new VerticalLayout)
		
		new Label(panel) => [
			setText("HACER DENUNCIA!")
			setBackground(Color.BLACK)
			width = 400
			height = 50
			fontSize = 25
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
		
		new Label(panelDenunciaA).bindValueToProperty("denunciado.nombreJugador")
			

        val panelMotivo = new Panel(panel)
        panelMotivo.setLayout(new HorizontalLayout)
        
        new Label(panelMotivo) => [
			setText("Motivo")
			width = 200
			]
			
			
		new Selector<ControladorTipoDenuncia>(panelMotivo) => [
            
            allowNull = false
            bindItemsToProperty("motivos")
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
			fontSize = 12
			bindValueToProperty("detalles")
			]	
			
		val panelOpciones = new Panel(panel)
		panelOpciones.setLayout(new HorizontalLayout)
		panelOpciones.layout = new ColumnLayout(2)
		
		new Button(panelOpciones) => [
			setCaption("Denunciar")
			onClick[| enviarDenuncia]
			
			]
			
		
		new Button(panelOpciones) => [
			setCaption("Cancelar")
			onClick [|cancel]
		]
			
			
   
	}
	
	def enviarDenuncia(){
		modelObject.realizarDenuncia()
	}
	
	
	override protected createFormPanel(Panel mainPanel) {
//		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}