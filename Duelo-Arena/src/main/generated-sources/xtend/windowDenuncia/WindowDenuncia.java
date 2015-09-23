package windowDenuncia;

import controladores.ControladorDenuncia;
import controladores.ControladorDenunciaEnviada;
import controladores.ControladorTipoDenuncia;
import java.awt.Color;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.aop.windows.TransactionalDialog;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.lacar.ui.model.Action;
import org.uqbar.lacar.ui.model.ControlBuilder;
import windowDenunciaEnviada.WindowDenunciaEnviada;

@SuppressWarnings("all")
public class WindowDenuncia extends TransactionalDialog<ControladorDenuncia> {
  public WindowDenuncia(final WindowOwner owner, final ControladorDenuncia model) {
    super(owner, model);
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
    _label_3.<Object, ControlBuilder>bindValueToProperty("nombreDenunciado");
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
        final Action _function = new Action() {
          public void execute() {
            WindowDenuncia.this.enviarDenuncia();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function_7);
    Button _button_1 = new Button(panelOpciones);
    final Procedure1<Button> _function_8 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Cancelar");
        final Action _function = new Action() {
          public void execute() {
            WindowDenuncia.this.cancel();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_8);
  }
  
  public void enviarDenuncia() {
    ControladorDenuncia _modelObject = this.getModelObject();
    ControladorDenunciaEnviada _crearDenuncia = _modelObject.crearDenuncia();
    WindowDenunciaEnviada _windowDenunciaEnviada = new WindowDenunciaEnviada(this, _crearDenuncia);
    this.openDialog(_windowDenunciaEnviada);
  }
  
  public void openDialog(final Dialog<?> dialog) {
    dialog.open();
  }
  
  protected void createFormPanel(final Panel mainPanel) {
  }
}
