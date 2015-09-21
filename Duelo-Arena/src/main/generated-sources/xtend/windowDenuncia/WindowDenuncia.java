package windowDenuncia;

import Jugador.Jugador;
import controladores.ControladorDenuncia;
import controladores.ControladorJugador;
import controladores.ControladorTipoDenuncia;
import java.awt.Color;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.actions.MessageSend;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.lacar.ui.model.ControlBuilder;

@SuppressWarnings("all")
public class WindowDenuncia extends MainWindow<ControladorDenuncia> {
  public WindowDenuncia(final ControladorJugador denunciado, final ControladorJugador denunciante) {
    super(new ControladorDenuncia(denunciado, denunciante));
  }
  
  public void createContents(final Panel panel) {
    this.setTitle("Duelo de leyendas");
    VerticalLayout _verticalLayout = new VerticalLayout();
    panel.setLayout(_verticalLayout);
    Label _label = new Label(panel);
    final Procedure1<Label> _function = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("HACER DENUNCIA!");
        it.setBackground(Color.BLACK);
        it.setWidth(400);
        it.setHeight(50);
        it.setFontSize(25);
        it.setForeground(Color.WHITE);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label, _function);
    Label _label_1 = new Label(panel);
    final Procedure1<Label> _function_1 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("");
        it.setHeight(10);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_1, _function_1);
    final Panel panelDenunciaA = new Panel(panel);
    HorizontalLayout _horizontalLayout = new HorizontalLayout();
    panelDenunciaA.setLayout(_horizontalLayout);
    Label _label_2 = new Label(panelDenunciaA);
    final Procedure1<Label> _function_2 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Estas queriendo denunciar a: ");
        it.setWidth(200);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_2, _function_2);
    Label _label_3 = new Label(panelDenunciaA);
    _label_3.<Object, ControlBuilder>bindValueToProperty("denunciado.nombreJugador");
    final Panel panelMotivo = new Panel(panel);
    HorizontalLayout _horizontalLayout_1 = new HorizontalLayout();
    panelMotivo.setLayout(_horizontalLayout_1);
    Label _label_4 = new Label(panelMotivo);
    final Procedure1<Label> _function_3 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Motivo");
        it.setWidth(200);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_4, _function_3);
    Selector<ControladorTipoDenuncia> _selector = new Selector<ControladorTipoDenuncia>(panelMotivo);
    final Procedure1<Selector<ControladorTipoDenuncia>> _function_4 = new Procedure1<Selector<ControladorTipoDenuncia>>() {
      public void apply(final Selector<ControladorTipoDenuncia> it) {
        it.allowNull(false);
        it.bindItemsToProperty("motivos");
        it.<Object, ControlBuilder>bindValueToProperty("motivo");
      }
    };
    ObjectExtensions.<Selector<ControladorTipoDenuncia>>operator_doubleArrow(_selector, _function_4);
    final Panel panelDetalles = new Panel(panel);
    HorizontalLayout _horizontalLayout_2 = new HorizontalLayout();
    panelDetalles.setLayout(_horizontalLayout_2);
    Label _label_5 = new Label(panelDetalles);
    final Procedure1<Label> _function_5 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Detalles");
        it.setWidth(200);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_5, _function_5);
    TextBox _textBox = new TextBox(panelDetalles);
    final Procedure1<TextBox> _function_6 = new Procedure1<TextBox>() {
      public void apply(final TextBox it) {
        it.setWidth(200);
        it.setFontSize(12);
        it.<Object, ControlBuilder>bindValueToProperty("detalles");
      }
    };
    ObjectExtensions.<TextBox>operator_doubleArrow(_textBox, _function_6);
    final Panel panelOpciones = new Panel(panel);
    HorizontalLayout _horizontalLayout_3 = new HorizontalLayout();
    panelOpciones.setLayout(_horizontalLayout_3);
    ColumnLayout _columnLayout = new ColumnLayout(2);
    panelOpciones.setLayout(_columnLayout);
    Button _button = new Button(panelOpciones);
    final Procedure1<Button> _function_7 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Denunciar");
        ControladorDenuncia _modelObject = WindowDenuncia.this.getModelObject();
        ControladorDenuncia _modelObject_1 = WindowDenuncia.this.getModelObject();
        String _motivo = _modelObject_1.getMotivo();
        String _plus = ("realizarDenuncia(" + _motivo);
        String _plus_1 = (_plus + " , ");
        ControladorDenuncia _modelObject_2 = WindowDenuncia.this.getModelObject();
        String _detalles = _modelObject_2.getDetalles();
        String _plus_2 = (_plus_1 + _detalles);
        String _plus_3 = (_plus_2 + ")");
        MessageSend _messageSend = new MessageSend(_modelObject, _plus_3);
        it.onClick(_messageSend);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function_7);
    Button _button_1 = new Button(panelOpciones);
    final Procedure1<Button> _function_8 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Cancelar");
        ControladorDenuncia _modelObject = WindowDenuncia.this.getModelObject();
        MessageSend _messageSend = new MessageSend(_modelObject, "cancelarDenuncia");
        it.onClick(_messageSend);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_8);
  }
  
  public static void main(final String[] args) {
    Jugador jug1 = new Jugador("magow");
    Jugador jug2 = new Jugador("pablinguis");
    ControladorJugador _controladorJugador = new ControladorJugador(jug1);
    ControladorJugador _controladorJugador_1 = new ControladorJugador(jug2);
    WindowDenuncia _windowDenuncia = new WindowDenuncia(_controladorJugador, _controladorJugador_1);
    _windowDenuncia.startApplication();
  }
}
